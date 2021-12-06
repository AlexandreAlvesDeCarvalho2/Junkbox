package com.java.entity;

import java.util.List;

import com.java.DAO.BibliotecaDAO;
import com.java.DAO.DaoFactory;

public class Biblioteca {
	
	
	private String album;
	private int id;
	private String nomeAlbum;
	
	

	public String getNomeAlbum() {
		return nomeAlbum;
	}

	public void setNomeAlbum(String nomeAlbum) {
		this.nomeAlbum = nomeAlbum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
	

	public void listarAlbum() {
		BibliotecaDAO dao = DaoFactory.getBibliotecaDAO();
		List<Biblioteca> albuns = dao.listarAlbuns();
		System.out.println("---------------------------------------------\n"
				+ "Selecione album: ");
		for (Biblioteca a : albuns) {
			System.out.println(a.toString());
		}
	}
	public void pegarAlbum(int Numeroalbum) {
	
		BibliotecaDAO dao = DaoFactory.getBibliotecaDAO();
		
		List<Biblioteca> albuns = dao.pegarAlbum(Numeroalbum);
		System.out.println("---------------------------------------------\n"
				+ "Selecione musicas: " );
		for (Biblioteca a : albuns) {
			System.out.println(a.toString());
		}
		
	}
	

	public Biblioteca() {
		
	}
	public Biblioteca(String album, int id, String nomeAlbum) {
		super();
		this.album = album;
		this.id = id;
		this.nomeAlbum = nomeAlbum;
	}

	@Override
	public String toString() {
		return id + " - " + album ;
	}


	

}
