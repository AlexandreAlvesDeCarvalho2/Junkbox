package com.java.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.java.DbMananger;
import com.java.entity.Login;


public class LoginDAOImpl implements LoginDAO {

	private Connection conexao;
	PreparedStatement pstmt = null;

	@Override
	public List<Login> BuscarLogin(String email, String senha) {
		
		

		List<Login> logins = new ArrayList<Login>();
		ResultSet rs = null;

		try {	
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("select * from T_USUARIO where EMAIL_USUARIO = ? and SENHA_USUARIO = ?");
			
			pstmt.setString(1, email);
			pstmt.setString(2, senha);
				
			
			rs = pstmt.executeQuery();

			while (rs.next()) {

				Login login = new Login();
				
				login.setID_USUARIO(rs.getInt("ID_USUARIO"));
				login.setEMAIL_USUARIO(rs.getString("EMAIL_USUARIO"));
				login.setSENHA_USUARIO(rs.getString("SENHA_USUARIO"));
				login.setCATEGORIA_USUARIO(rs.getString("CATEGORIA_USUARIO"));

		

				logins.add(login);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return logins;
	}		
}
