package com.java.entity;

import java.util.List;

import com.java.DAO.AlbumDAO;
import com.java.DAO.DaoFactory;


public class Album {

	private String musicas;
		

	public String getMusicas() {
		return musicas;
	}

	public void setMusicas(String musicas) {
		this.musicas = musicas;
	}

	public void pegarMusica(String nome) {

		AlbumDAO dao = DaoFactory.getAlbumDAO();
		List<Album> musicas = dao.pegarMusica(nome);
		System.out.println("---------------------------------------------\n"
				+ "pegarMusica: ");
		for (Album c : musicas) {
			System.out.println(c.toString());

		}
		
	}

	public void listarMusicas() {
		AlbumDAO dao = DaoFactory.getAlbumDAO();
		List<Album> musicas = dao.listarMusicas();
		System.out.println("---------------------------------------------\n"
				+ "pegarTodasMusicas: ");
		for (Album m : musicas) {
			System.out.println(m.toString());
		}
		
	}
	
	
	@Override
	public String toString() {
		return  musicas;
	}
	
	
}
