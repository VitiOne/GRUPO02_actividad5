package com.tienda.dao;

import org.springframework.stereotype.Repository;

import com.tienda.modelo.Role;


public interface RolDao {
	
	Role findById(int id_rol); 
}
