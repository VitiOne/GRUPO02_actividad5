package com.tienda.dao;

import com.tienda.modelo.Usuario;

public interface UsuarioDao {
	
	Usuario findUser(String email, String password);
	boolean registro(Usuario usuario);
	

}
