package com.java.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.DbMananger;
import com.java.entity.Album;





public class AlbumDAOImpl implements AlbumDAO{
	private Connection conexao;
	PreparedStatement pstmt = null;

	@Override
	public List<Album> pegarMusica(int musicsDoAlbum) {
			
		
			List<Album> musicas = new ArrayList<Album>();
			ResultSet rs = null;

			try {
				conexao = DbMananger.obterConexao();
					pstmt = conexao.prepareStatement("select * from T_MUSICA m inner join ALBUM a on(a.ID_ALBUM = m.ID_MUSICA_ALBUM) where ID_MUSICA = ?");
				
					
				pstmt.setInt(1, musicsDoAlbum);
				
					
					
					
					rs = pstmt.executeQuery();

					
					while (rs.next()) {

						Album musica = new Album();
						
						musica.setMusicas(rs.getString("NM_MUSICA"));
						musica.setId(rs.getInt("ID_MUSICA"));
						

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


	@Override
	public List<Album> listarMusicas() {
		List<Album> musicas = new ArrayList<Album>();
		ResultSet rs = null;

		try {
			conexao = DbMananger.obterConexao();
				pstmt = conexao.prepareStatement("select * from T_MUSICA");				
				
				
				rs = pstmt.executeQuery();

				
				while (rs.next()) {

					Album musica = new Album();
					
					musica.setMusicas(rs.getString("NM_MUSICA"));
					musica.setId(rs.getInt("ID_MUSICA"));
					
					

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
