package com.java.test;


import com.java.entity.Album;
import com.java.entity.Biblioteca;
import com.java.entity.Music;
import com.java.entity.Playlist;


public class testJunkbox {

	public static void main(String[] args) {

		Music musica = new Music();
		Album album = new Album();
		Biblioteca biblioteca = new Biblioteca();
		Playlist playlist = new Playlist();
		
		
		
		// metodo exibir informações da musica 
		
		musica.exibirinformaçoes("Temporal");
		
		// metodos pegarMusica e pegarTodasMusicas do album
		
		album.pegarMusica("TNT");
		album.listarMusicas();
		
		
		
		
		// metodos pegarListas e pegarTodasListas da biblioteca
		
		biblioteca.pegarAlbum("Exaltasamba");
		biblioteca.listarAlbum();
		
		
		// metodo adicionar musica a playlist
		
		
		
		
		System.out.println(playlist);
		
		

	}

}
