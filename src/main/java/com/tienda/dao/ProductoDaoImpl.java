package com.tienda.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.modelo.Producto;
import com.tienda.repository.ProductoRepository;



@Service
public class ProductoDaoImpl implements ProductoDao{
	@Autowired
	ProductoRepository prepo;

	@Override
	public int insertarProducto(Producto producto) {
		int filas =0;
		try {
			prepo.save(producto);
			filas=1;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Producto buscarUno(int id_producto) {
		// TODO Auto-generated method stub
		return prepo.findById(id_producto).orElse(null);
	}

	@Override
	public List<Producto> buscarTodos() {
		// TODO Auto-generated method stub
		return prepo.findAll();
	}

//	@Override
//	public List<Producto> buscarporFamilia(int codigoFamilia) {
//		// TODO Auto-generated method stub
//		return prepo.findPorFamilia(codigoFamilia);
//	}

//	@Override
//	public List<Producto> buscarPorNombre(String nombre_producto) {
//		// TODO Auto-generated method stub
//		return prepo.findByNombre(nombre_producto);
//	}

	@Override
	public int borrarProducto(int id_producto) {
		int filas = 0;
		try {
			prepo.deleteById(id_producto);
			filas=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int modificarProducto(Producto producto) {
		int filas = 0;
		Producto p1 = null;
		try {
			p1=prepo.getById(producto.getId());
			//p1=prepo.getOne(producto.getIdProducto());
			p1 = producto;
			prepo.save(p1);
			filas=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}


	

}
