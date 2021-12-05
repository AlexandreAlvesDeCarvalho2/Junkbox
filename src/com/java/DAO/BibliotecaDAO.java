package com.java.DAO;
import java.util.List;


import com.java.entity.Biblioteca;


public interface BibliotecaDAO {
	
	public List <Biblioteca> pegarAlbum(String album);
	
	public List <Biblioteca> listarAlbuns();
	
}
