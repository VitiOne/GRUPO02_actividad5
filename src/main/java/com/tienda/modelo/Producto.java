package com.tienda.modelo;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {

  @Id
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "nombre_producto", nullable = false, length = 100)
  private String nombreProducto;

  @Column(name = "descripcion", length = 30)
  private String descripcion;

  @Column(name = "precio", precision = 9, scale = 2)
  private BigDecimal precio;

  @Column(name = "stock")
  private Integer stock;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombreProducto() {
    return nombreProducto;
  }

  public void setNombreProducto(String nombreProducto) {
    this.nombreProducto = nombreProducto;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public BigDecimal getPrecio() {
    return precio;
  }

  public void setPrecio(BigDecimal precio) {
    this.precio = precio;
  }

  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

}
