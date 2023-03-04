package com.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.modelo.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
