package com.tienda.modelo;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

  @Id
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "fecha_compra", nullable = false)
  private Instant fechaCompra;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Instant getFechaCompra() {
    return fechaCompra;
  }

  public void setFechaCompra(Instant fechaCompra) {
    this.fechaCompra = fechaCompra;
  }

}
