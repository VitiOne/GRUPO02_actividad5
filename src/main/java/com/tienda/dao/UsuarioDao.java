package com.tienda.dao;

import com.tienda.modelo.Usuario;

public interface UsuarioDao {
	
	Usuario findById(int id_usuario);
	boolean registro(Usuario usuario);
	

}
