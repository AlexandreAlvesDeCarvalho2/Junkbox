package com.java.test;

import com.java.entity.Album;
import com.java.entity.Biblioteca;
import com.java.entity.Playlist;




public class testJunkbox {

	public static void main(String[] args) {
		
		Album album = new Album();
		Biblioteca biblioteca = new Biblioteca();
		Playlist playlist = new Playlist();
			
		
		// teste métodos JunkBox
		
		biblioteca.listarAlbum(); // Lista todos albuns da tabela T_ALBUM 
		biblioteca.pegarAlbum(1); // busca album por ID da tabela T_ALBUM
		
		
		album.pegarMusica(11); // busca musica por ID da tabela T_MUSICAS
		
		
		playlist.addMusicToList(11); // adiciona música por ID na tabela T_PLAYLIST 
		playlist.listarMusicasPlaylist();
		
		
		/* 			outros métodos	
		 * 
		 * 	Music musica = new Music();
		 *  musica.exibirinformaçoes(13); // busca infomações por ID da tabela T_MUSICSA
		 *  album.listarMusicas(); // Lista todas as músicas da tabela T_MUSICAS
		 *  playlist.remover(10);	
		 *	
		 */
		
	

	}

}
