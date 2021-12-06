package com.java.entity;

import java.util.List;

import com.java.DAO.DaoFactory;
import com.java.DAO.MusicasDAO;

public class Music {
	private String nome;
	private String artista;
	private int ID;
	private int ID_MUSICA_ALBUM;
	private String MUSICA_ALBUM;
	

	// Get e Set
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getID() {
		return ID;
	}
		
	public void setID(int iD) {
		ID = iD;
	}
	
	public int getID_MUSICA_ALBUM() {
		return ID_MUSICA_ALBUM;
	}


	public void setID_MUSICA_ALBUM(int iD_MUSICA_ALBUM) {
		ID_MUSICA_ALBUM = iD_MUSICA_ALBUM;
	}
	
	public String getMUSICA_ALBUM() {
		return MUSICA_ALBUM;
	}

	public void setMUSICA_ALBUM(String MUSICA_ALBUM) {
		this.MUSICA_ALBUM = MUSICA_ALBUM;
	}

	
	
	public void exibirinformaçoes(int nome) {
		MusicasDAO dao2 = DaoFactory.getMusicDAO();
		System.out.println("---------------------------------------------"
				+ "\nexibirinformaçoes:  ");
		List<Music> musicas = dao2.buscarPorNome(nome);
		for(Music c: musicas) {
	System.out.println(c.toString());
}
	}
	
	public void play() {
		System.out.println("Reproduzinho música");
	}

	/*
	 * Constructions
	 */
	public Music() {
	}

	




	public Music(String nome, String artista, int iD, int iD_MUSICA_ALBUM, String mUSICA_ALBUM) {
		super();
		this.nome = nome;
		this.artista = artista;
		ID = iD;
		ID_MUSICA_ALBUM = iD_MUSICA_ALBUM;
		MUSICA_ALBUM = mUSICA_ALBUM;
	}

	/*
	 * sobrecarregando 
	 */
	@Override
	public String toString() {
		return 	" Musica: " + nome + "Artista(s): " + artista + " Album: "+ MUSICA_ALBUM ;
	}

}
