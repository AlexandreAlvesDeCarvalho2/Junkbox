package com.java.test;

import java.util.List;

import com.java.DAO.DaoFactory;
import com.java.DAO.LoginDAO;
import com.java.entity.Album;
import com.java.entity.Biblioteca;
import com.java.entity.Login;
import com.java.entity.Playlist;




public class testJunkbox {

	public static void main(String[] args) {
		
		Album album = new Album();
		Biblioteca biblioteca = new Biblioteca();
		Playlist playlist = new Playlist();
		Login conectar = new Login();
			
		
		// teste m�todos JunkBox
		
		//biblioteca.listarAlbum(); // Lista todos albuns da tabela T_ALBUM 
		//biblioteca.pegarAlbum(1); // busca album por ID da tabela T_ALBUM
		
		
		//album.pegarMusica(14); // busca musica por ID da tabela T_MUSICAS
		
		
		//playlist.addMusicToList(14); // adiciona m�sica por ID na tabela T_PLAYLIST 
		//playlist.listarMusicasPlaylist();
		
		
		//conectar.logar("alexandre@gmail", "123456");
		
			
		LoginDAO dao = DaoFactory.getLoginDAO();
			
			List<Login> logins =  dao.BuscarLogin("alexandre@gmail.com", "123456");
			
			
			System.out.println("---------------------------------------------\n"
					+ "Seu login: " );
			for (Login l : logins) {
				System.out.println(l.toString());
			}
		
		
		
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
