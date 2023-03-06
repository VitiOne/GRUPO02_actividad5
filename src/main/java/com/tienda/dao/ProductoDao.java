package com.tienda.dao;

import java.util.List;

import com.tienda.modelo.Producto;


public interface ProductoDao {
	
	int insertarProducto(Producto producto);
	Producto buscarUno(int id_producto);
	List<Producto> buscarTodos();
	//List<Producto> buscarporFamilia(int codigoFamilia);
	//List<Producto> buscarPorNombre(String nombre_producto);
	int borrarProducto(int id_producto);
	int modificarProducto(Producto producto);
	
	

}
