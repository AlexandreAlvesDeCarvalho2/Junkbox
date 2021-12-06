package com.java.entity;

import java.util.List;

import com.java.DAO.AlbumDAO;
import com.java.DAO.DaoFactory;


public class Album {

	private String musicas;
	private int id;
	
		

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMusicas() {
		return musicas;
	}

	public void setMusicas(String musicas) {
		this.musicas = musicas;
	}

	public void pegarMusica(int nome) {

		AlbumDAO dao = DaoFactory.getAlbumDAO();
		List<Album> musicas = dao.pegarMusica(nome);
		System.out.println("---------------------------------------------\n"
				+ "Musica selecionada: ");
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
	
	
	public Album(){
		
	}
	
	
	public Album(String musicas, int id) {
		super();
		this.musicas = musicas;
		this.id = id;
	}

	@Override
	public String toString() {
		return id +" - " + musicas ;
	}
	
	
}
