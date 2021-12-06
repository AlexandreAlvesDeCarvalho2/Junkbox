package com.java.entity;

import java.util.List;

import com.java.DAO.BibliotecaDAO;
import com.java.DAO.DaoFactory;
import com.java.DAO.PlaylistDAO;

public class Playlist {
	PlaylistDAO dao = DaoFactory.getPlaylistDAO();
	
	private String musicas;
	private int idMusica;
	

	public int getIdMusica() {
		return idMusica;
	}

	public void setIdMusica(int idMusica) {
		this.idMusica = idMusica;
	}

	public String getMusicas() {
		return musicas;
	}

	public void setMusicas(String musicas) {
		this.musicas = musicas;
	}
	
	
	public void addMusicToList(int id) {
		Playlist playlist = new Playlist();
		PlaylistDAO dao = DaoFactory.getPlaylistDAO();
		playlist.setIdMusica(id);
		dao.gravar(playlist);
		
		System.out.println("Musica adicionada a playlist id: " + id );
	}
	
	
	public void listarMusicasPlaylist () {
		PlaylistDAO dao = DaoFactory.getPlaylistDAO();
			
			List<Playlist> musicas = dao.buscarlista();
			System.out.println("---------------------------------------------\n"
					+ "Musicas da Playlist:  " );
			int cont = 1;
			for (Playlist a : musicas) {
				
				System.out.println(cont + a.toString());
				cont++;
			}
	}
	
	public void remover(int id){
		PlaylistDAO dao = DaoFactory.getPlaylistDAO();
		dao.remover(id);
		
	}
	
	
	public Playlist() {
		
	}
	
	public Playlist(String musicas, int idMusica) {
		super();
		this.musicas = musicas;
		this.idMusica = idMusica;
	}

	@Override
	public String toString() {
		return " - " + musicas;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
