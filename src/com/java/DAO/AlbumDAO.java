package com.java.DAO;
import java.util.List;

import com.java.entity.Album;


public interface AlbumDAO {
	
	public List <Album> pegarMusica(int musica);
	
	public List <Album> listarMusicas();
	
}
