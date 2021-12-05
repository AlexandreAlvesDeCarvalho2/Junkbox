package com.java.entity;

import java.util.List;

import com.java.DAO.BibliotecaDAO;
import com.java.DAO.DaoFactory;

public class Biblioteca {
	
	
	private String album;

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
	
	public void pegarAlbum(String album) {
		
		BibliotecaDAO dao = DaoFactory.getBibliotecaDAO();
		
		List<Biblioteca> albuns = dao.pegarAlbum(album);
		System.out.println("---------------------------------------------\n"
				+ "pegarAlbuns: ");
		for (Biblioteca a : albuns) {
			System.out.println(a.toString());
		}
		
	}
	public void listarAlbum() {
		BibliotecaDAO dao = DaoFactory.getBibliotecaDAO();
		List<Biblioteca> albuns = dao.listarAlbuns();
		System.out.println("---------------------------------------------\n"
				+ "listarAlbum: ");
		for (Biblioteca a : albuns) {
			System.out.println(a.toString());
		}
	}
	
	
	public Biblioteca() {
		
	}
	public Biblioteca(String album) {
		super();
		this.album = album;
	}

	@Override
	public String toString() {
		return album ;
	}
	
	

}
