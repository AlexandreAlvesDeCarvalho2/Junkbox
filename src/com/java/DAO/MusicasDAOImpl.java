package com.java.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.DbMananger;
import com.java.entity.Music;

public class MusicasDAOImpl implements MusicasDAO {
	
	private Connection conexao;
	PreparedStatement pstmt = null;

	@Override
	public List<Music> buscarPorNome(int nome) {
		
		List<Music> musicas = new ArrayList<Music>();
		ResultSet rs = null;

		try {	
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("select * from T_MUSICA"
					+ " m inner join ALBUM a on(a.ID_ALBUM = m.ID_MUSICA_ALBUM)"
					+ " where ID_MUSICA = ?");
			
			pstmt.setInt(1, nome);
				
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {

				Music musica = new Music();

				musica.setNome(rs.getString("NM_MUSICA"));
				musica.setArtista(rs.getString("NM_ARTISTA"));
				musica.setMUSICA_ALBUM(rs.getString("LISTMUSICA"));
				musicas.add(musica);
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

		return musicas;
		
		
		
	}
	
	

}
