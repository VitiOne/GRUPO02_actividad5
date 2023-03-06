package com.tienda.dao;

import org.springframework.stereotype.Repository;
import com.tienda.modelo.Tarjeta;


public interface TarjetaDao {
	
	Tarjeta findById(int id_tarjeta); 
}
