package com.java.test;

import java.util.List;

import com.junkbox.DAO.DaoFactory;
import com.junkbox.DAO.LoginDAO;
import com.junkbox.entity.Album;
import com.junkbox.entity.Biblioteca;
import com.junkbox.entity.Login;
import com.junkbox.entity.Playlist;




public class testJunkbox {

	public static void main(String[] args) {
		
		Album album = new Album();
		Biblioteca biblioteca = new Biblioteca();
		Playlist playlist = new Playlist();
		Login conectar = new Login();
			
		
		// teste métodos JunkBox
		
		//biblioteca.listarAlbum(); // Lista todos albuns da tabela T_ALBUM 
		//biblioteca.pegarAlbum(1); // busca album por ID da tabela T_ALBUM
		
		
		//album.pegarMusica(14); // busca musica por ID da tabela T_MUSICAS
		
		
		//playlist.addMusicToList(14); // adiciona música por ID na tabela T_PLAYLIST 
		//playlist.listarMusicasPlaylist();
		
		
		//conectar.logar("alexandre@gmail", "123456");
		
			
		LoginDAO dao = DaoFactory.getLoginDAO();
			
			List<Login> logins =  dao.BuscarLogin("alexandre@gmail.com", "123456");
			
			
			System.out.println("---------------------------------------------\n"
					+ "Seu login: " );
			for (Login l : logins) {
				System.out.println(l.toString());
			}
		
		
		
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
