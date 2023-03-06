package com.tienda.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tienda.modelo.Pedido;
import com.tienda.modelo.Producto;
import com.tienda.repository.PedidoRepository;

public class PedidoDaoImpl implements PedidoDao{
	@Autowired
	PedidoRepository perepo;

	@Override
	public Pedido buscarUno(int id_pedido) {
		return perepo.findById(id_pedido).orElse(null);
		
	}

	@Override
	public List<Pedido> buscarTodos() {
		// TODO Auto-generated method stub
		return perepo.findAll();
	}

	@Override
	public int borrarPedido(int id_pedido) {
		// TODO Auto-generated method stub
		int filas = 0;
		try {
			perepo.deleteById(id_pedido);
			filas=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int modificarPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		int filas = 0;
		Pedido p1 = null;
		try {
			p1=perepo.getById(pedido.getId());
			//p1=prepo.getOne(producto.getIdProducto());
			p1 = pedido;
			perepo.save(p1);
			filas=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

}
