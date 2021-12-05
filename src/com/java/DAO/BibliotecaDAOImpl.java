package com.java.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jarvis.DBFactory.DbMananger;

import com.java.entity.Biblioteca;

public class BibliotecaDAOImpl implements BibliotecaDAO {

	private Connection conexao;
	PreparedStatement pstmt = null;

	@Override
	public List<Biblioteca> pegarAlbum(String albumDaBiblioteca) {

		List<Biblioteca> albuns = new ArrayList<Biblioteca>();
		ResultSet rs = null;

		try {
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("select * from ALBUM"
					+ " a inner join T_BIBLI b on(b.ID_BIBLI = a.ID_ALBUM_BIBLI)" + " where LISTMUSICA = ?");

			pstmt.setString(1, albumDaBiblioteca);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				Biblioteca album = new Biblioteca();

				album.setAlbum(rs.getString("LISTMUSICA"));

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
