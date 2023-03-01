package com.tienda.modelo;

import java.math.BigDecimal;
import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {

  @Id
  @Column(name = "id", nullable = false)
  private Integer id;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "id_usuario", nullable = false)
  private Usuario idUsuario;

  @Column(name = "fecha_compra", nullable = false)
  private Instant fechaCompra;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "id_direccion", nullable = false)
  private Direccion idDireccion;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "id_tarjeta", nullable = false)
  private Tarjeta idTarjeta;

  @Column(name = "total", precision = 9, scale = 2)
  private BigDecimal total;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Usuario getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Usuario idUsuario) {
    this.idUsuario = idUsuario;
  }

  public Instant getFechaCompra() {
    return fechaCompra;
  }

  public void setFechaCompra(Instant fechaCompra) {
    this.fechaCompra = fechaCompra;
  }

  public Direccion getIdDireccion() {
    return idDireccion;
  }

  public void setIdDireccion(Direccion idDireccion) {
    this.idDireccion = idDireccion;
  }

  public Tarjeta getIdTarjeta() {
    return idTarjeta;
  }

  public void setIdTarjeta(Tarjeta idTarjeta) {
    this.idTarjeta = idTarjeta;
  }

  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

}
