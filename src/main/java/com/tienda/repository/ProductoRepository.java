package com.tienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tienda.modelo.Producto;


public interface ProductoRepository extends JpaRepository<Producto, Integer>{

	//public List<Producto> findByNombre(String nombre_producto); ???????????????????????
	
//	@Query("select p from Producto p where p.familia.codigo = ?1")
//	public List<Producto> findPorFamilia(int codigo);
	
}
