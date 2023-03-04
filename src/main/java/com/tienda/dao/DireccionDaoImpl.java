package com.tienda.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tienda.modelo.Direccion;
import com.tienda.repository.DireccionRepository;


@Repository
public class DireccionDaoImpl implements DireccionDao{
	@Autowired
	DireccionRepository drepo;

	@Override
	public Direccion findById(int id_direccion) {
		// TODO Auto-generated method stub
		return drepo.findById(id_direccion).orElse(null);
	}
	
	

}
