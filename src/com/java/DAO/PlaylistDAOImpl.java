package com.java.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.DbMananger;
import com.java.entity.Playlist;

public class PlaylistDAOImpl implements PlaylistDAO {
	
	private Connection conexao;
	PreparedStatement pstmt = null;
	
	@Override
	public void gravar(Playlist musica) {
		try {
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("INSERT INTO t_playlist (ID_Musicas)"
					+ " VALUES (?)");

			
			pstmt.setInt(1, musica.getIdMusica());
	
			
			

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
		
	

	@Override
	public List<Playlist> buscarlista() {

		List<Playlist> playlists = new ArrayList<Playlist>();
		ResultSet rs = null;

		try {	
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("select * from t_playlist p inner join t_musica m on(p.ID_MUSICAS = m.ID_MUSICA)");
		
						
			
			rs = pstmt.executeQuery();

			
			while (rs.next()) {

				Playlist playlist = new Playlist();

				playlist.setMusicas(rs.getString("NM_MUSICA"));
			

				playlists.add(playlist);
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

		return playlists;
	}
	
	
	
	@Override
	public void remover(int id) {
		try {

			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("DELETE FROM T_PLAYLIST WHERE ID_MUSICAS = ?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	

}
