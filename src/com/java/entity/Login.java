package com.java.entity;

import java.io.Serializable;
import java.util.List;

import com.java.DAO.BibliotecaDAO;
import com.java.DAO.DaoFactory;
import com.java.DAO.LoginDAO;

public class Login implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID_USUARIO;
	private String EMAIL_USUARIO;
	private	String SENHA_USUARIO;
	private String CATEGORIA_USUARIO;
	public int getID_USUARIO() {
		return ID_USUARIO;
	}
	public void setID_USUARIO(int iD_USUARIO) {
		ID_USUARIO = iD_USUARIO;
	}
	public String getEMAIL_USUARIO() {
		return EMAIL_USUARIO;
	}
	public void setEMAIL_USUARIO(String eMAIL_USUARIO) {
		EMAIL_USUARIO = eMAIL_USUARIO;
	}
	public String getSENHA_USUARIO() {
		return SENHA_USUARIO;
	}
	public void setSENHA_USUARIO(String sENHA_USUARIO) {
		SENHA_USUARIO = sENHA_USUARIO;
	}
	public String getCATEGORIA_USUARIO() {
		return CATEGORIA_USUARIO;
	}
	public void setCATEGORIA_USUARIO(String cATEGORIA_USUARIO) {
		CATEGORIA_USUARIO = cATEGORIA_USUARIO;
	}
	
	public void logar(String email, String senha ) {
		LoginDAO dao = DaoFactory.getLoginDAO();
		
		List<Login> logins =  dao.BuscarLogin(email, senha);
		
		
		System.out.println("---------------------------------------------\n"
				+ "Seu login: " );
		for (Login l : logins) {
			System.out.println(l.toString());
		}
		
		
	}

	
		
	
	
	public Login() {
		
	}
	public Login(int iD_USUARIO, String eMAIL_USUARIO, String sENHA_USUARIO, String cATEGORIA_USUARIO) {
		super();
		ID_USUARIO = iD_USUARIO;
		EMAIL_USUARIO = eMAIL_USUARIO;
		SENHA_USUARIO = sENHA_USUARIO;
		CATEGORIA_USUARIO = cATEGORIA_USUARIO;
	}
	@Override
	public String toString() {
		return "Login [ID_USUARIO=" + ID_USUARIO + ", EMAIL_USUARIO=" + EMAIL_USUARIO + ", SENHA_USUARIO="
				+ SENHA_USUARIO + ", CATEGORIA_USUARIO=" + CATEGORIA_USUARIO + "]";
	}
	
	
	
		

}
