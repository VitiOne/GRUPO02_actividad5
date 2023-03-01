package com.tienda.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.hibernate.Hibernate;

@Embeddable
public class PedidoProductoId implements Serializable {

  private static final long serialVersionUID = 3040388735596310894L;

  @Column(name = "id_pedido", nullable = false)
  private Integer idPedido;

  @Column(name = "id_producto", nullable = false)
  private Integer idProducto;

  public Integer getIdPedido() {
    return idPedido;
  }

  public void setIdPedido(Integer idPedido) {
    this.idPedido = idPedido;
  }

  public Integer getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(Integer idProducto) {
    this.idProducto = idProducto;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    PedidoProductoId entity = (PedidoProductoId) o;
    return Objects.equals(this.idProducto, entity.idProducto) && Objects.equals(this.idPedido, entity.idPedido);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProducto, idPedido);
  }

}
