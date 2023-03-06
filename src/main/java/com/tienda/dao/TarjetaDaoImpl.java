package com.tienda.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tienda.modelo.Tarjeta;
import com.tienda.repository.TarjetaRepository;


@Repository
public class TarjetaDaoImpl implements TarjetaDao{
	@Autowired
	TarjetaRepository trepo;

	@Override
	public Tarjeta findById(int id_tarjeta) {
		// TODO Auto-generated method stub
		return trepo.findById(id_tarjeta).orElse(null);
	}
	
	

}
