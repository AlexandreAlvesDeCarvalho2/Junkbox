package com.java.entity;


public class Playlist {
	
	
	private String musicas;

	public String getMusicas() {
		return musicas;
	}

	public void setMusicas(String musicas) {
		this.musicas = musicas;
	}
	
	
	public Playlist() {
		
	}
	public Playlist(String musicas) {
		super();
		this.musicas = musicas;
	}
	
	


	@Override
	public String toString() {
		return "Playlist [musicas=" + musicas + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
