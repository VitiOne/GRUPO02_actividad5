package com.tienda.modelo;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "pedido_producto")
public class PedidoProducto {

  @EmbeddedId
  private PedidoProductoId id;

  @MapsId("idPedido")
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "id_pedido", nullable = false)
  private Pedido idPedido;

  @MapsId("idProducto")
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "id_producto", nullable = false)
  private Producto idProducto;

  @Column(name = "cantidad", nullable = false)
  private Integer cantidad;

  @Column(name = "precio", precision = 9, scale = 2)
  private BigDecimal precio;

  public PedidoProductoId getId() {
    return id;
  }

  public void setId(PedidoProductoId id) {
    this.id = id;
  }

  public Pedido getIdPedido() {
    return idPedido;
  }

  public void setIdPedido(Pedido idPedido) {
    this.idPedido = idPedido;
  }

  public Producto getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(Producto idProducto) {
    this.idProducto = idProducto;
  }

  public Integer getCantidad() {
    return cantidad;
  }

  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }

  public BigDecimal getPrecio() {
    return precio;
  }

  public void setPrecio(BigDecimal precio) {
    this.precio = precio;
  }

}
