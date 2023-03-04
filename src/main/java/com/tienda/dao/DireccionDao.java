package com.tienda.dao;

import org.springframework.stereotype.Repository;

import com.tienda.modelo.Direccion;


public interface DireccionDao {
	
	Direccion findById(int id_direccion); 
}
