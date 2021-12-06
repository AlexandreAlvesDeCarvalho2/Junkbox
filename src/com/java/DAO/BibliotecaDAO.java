package com.java.DAO;
import java.util.List;


import com.java.entity.Biblioteca;


public interface BibliotecaDAO {
	
	public List <Biblioteca> pegarAlbum(int Numeroalbum);
	
	public List <Biblioteca> listarAlbuns();
	
}
