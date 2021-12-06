package com.java.DAO;

import java.util.List;
import com.java.entity.Playlist;

public interface PlaylistDAO {
	
	public void gravar(Playlist musica);
	List<Playlist> buscarlista();
	public void remover(int id);
	
	
	


}
