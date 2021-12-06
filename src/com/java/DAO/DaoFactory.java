package com.java.DAO;

public abstract class DaoFactory {
		public static AlbumDAO getAlbumDAO(){
		return new AlbumDAOImpl();
		}
		
		public static MusicasDAO getMusicDAO(){
			return new MusicasDAOImpl();
			}
		
		public static BibliotecaDAO getBibliotecaDAO(){
			return new BibliotecaDAOImpl();
			}
		public static PlaylistDAO getPlaylistDAO(){
			return new PlaylistDAOImpl();
			}
		
		
}
