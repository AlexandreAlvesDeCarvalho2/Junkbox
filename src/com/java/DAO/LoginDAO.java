package com.java.DAO;

import java.util.List;

import com.java.entity.Login;

public interface LoginDAO {
	
	
	public List<Login> BuscarLogin(String email, String senha);

}
