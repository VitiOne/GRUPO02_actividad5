package com.tienda.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tienda.modelo.Usuario;
import com.tienda.repository.UsuarioRepository;



@Repository
public class UsuarioDaoImpl implements UsuarioDao {
	@Autowired
	private UsuarioRepository urepo;
	@Override
	public Usuario findById(int  id_usuario) {
		// TODO Auto-generated method stub
		return urepo.findById(id_usuario).orElse(null);
	}
	@Override
	public boolean registro(Usuario usuario) {
		if (findById(usuario.getId()) == null) {
				urepo.save(usuario);
				return true;
		}
		return false;
	}
}
