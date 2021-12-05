package com.java.DAO;

import java.util.List;

import com.java.entity.Music;


public interface MusicasDAO {
	
	
	public List<Music> buscarPorNome(String nome);
	
}
