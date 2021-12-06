package com.java.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.DbMananger;
import com.java.entity.Biblioteca;

public class BibliotecaDAOImpl implements BibliotecaDAO {

	private Connection conexao;
	PreparedStatement pstmt = null;

	@Override
	public List<Biblioteca> pegarAlbum(int albumDaBiblioteca) {

		List<Biblioteca> albuns = new ArrayList<Biblioteca>();
		ResultSet rs = null;

		try {
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("select * from T_MUSICA"
					+ " m inner join ALBUM a on(a.ID_ALBUM = m.ID_MUSICA_ALBUM)" + " where ID_MUSICA_ALBUM = ?");

			pstmt.setInt(1, albumDaBiblioteca);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				Biblioteca album = new Biblioteca();
				
				album.setNomeAlbum(rs.getString("LISTMUSICA"));
				album.setAlbum(rs.getString("NM_MUSICA"));
				album.setId(rs.getInt("ID_MUSICA"));
				
				
				

				albuns.add(album);
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

		return albuns;

	}

	@Override
	public List<Biblioteca> listarAlbuns() {

		List<Biblioteca> listas = new ArrayList<Biblioteca>();
		ResultSet rs = null;

		try {
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("select * from ALBUM");

			rs = pstmt.executeQuery();

			while (rs.next()) {

				Biblioteca lista = new Biblioteca();

				lista.setAlbum(rs.getString("LISTMUSICA"));
				lista.setId(rs.getInt("ID_ALBUM"));

				listas.add(lista);
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

		return listas;
	}
}
