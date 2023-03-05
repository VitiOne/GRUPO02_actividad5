package com.tienda.dao;

import com.tienda.modelo.Usuario;

public interface UsuarioDao {
	
	Usuario findById(String email);
	boolean registro(Usuario usuario);
	

}
