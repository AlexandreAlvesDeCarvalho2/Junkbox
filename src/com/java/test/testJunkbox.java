package com.java.test;

import com.java.entity.Album;
import com.java.entity.Biblioteca;
import com.java.entity.Playlist;




public class testJunkbox {

	public static void main(String[] args) {
		
		Album album = new Album();
		Biblioteca biblioteca = new Biblioteca();
		Playlist playlist = new Playlist();
			
		
		// teste m�todos JunkBox
		
		biblioteca.listarAlbum(); // Lista todos albuns da tabela T_ALBUM 
		biblioteca.pegarAlbum(1); // busca album por ID da tabela T_ALBUM
		
		
		album.pegarMusica(11); // busca musica por ID da tabela T_MUSICAS
		
		
		playlist.addMusicToList(11); // adiciona m�sica por ID na tabela T_PLAYLIST 
		playlist.listarMusicasPlaylist();
		
		
		/* 			outros m�todos	
		 * 
		 * 	Music musica = new Music();
		 *  musica.exibirinforma�oes(13); // busca infoma��es por ID da tabela T_MUSICSA
		 *  album.listarMusicas(); // Lista todas as m�sicas da tabela T_MUSICAS
		 *  playlist.remover(10);	
		 *	
		 */
		
	

	}

}
