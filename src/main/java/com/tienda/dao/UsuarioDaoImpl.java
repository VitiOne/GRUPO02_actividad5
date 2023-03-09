package com.tienda.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tienda.modelo.Usuario;
import com.tienda.repository.UsuarioRepository;



@Repository
public class UsuarioDaoImpl implements UsuarioDao {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario findUser(String email, String password) {
		return usuarioRepository.findUsuario(email,password);
	}

	@Override
	public boolean registro(Usuario usuario) {
		usuarioRepository.save(usuario);
		return true;
	}
}
