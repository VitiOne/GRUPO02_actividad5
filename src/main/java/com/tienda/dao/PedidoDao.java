package com.tienda.dao;

import java.util.List;

import com.tienda.modelo.Pedido;

public interface PedidoDao {
	Pedido buscarUno(int id_pedido);
	List<Pedido> buscarTodos();
	int borrarPedido(int id_pedido);
	int modificarPedido(Pedido pedido);

}
