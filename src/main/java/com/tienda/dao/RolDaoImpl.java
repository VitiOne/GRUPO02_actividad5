package com.tienda.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tienda.modelo.Role;
import com.tienda.repository.RolRepository;


@Repository
public class RolDaoImpl implements RolDao{
	@Autowired
	RolRepository rrepo;

	@Override
	public Role findById(int id_rol) {
		// TODO Auto-generated method stub
		return rrepo.findById(id_rol).orElse(null);
	}
	
	

}
