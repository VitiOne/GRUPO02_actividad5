package com.tienda.modelo;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarjetas")
public class Tarjeta {

  @Id
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "numero_tarjeta", length = 20)
  private String numeroTarjeta;

  @Column(name = "nombre_titular", length = 20)
  private String nombreTitular;

  @Column(name = "fecha_caducidad")
  private LocalDate fechaCaducidad;

  @Column(name = "cvv")
  private Integer cvv;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNumeroTarjeta() {
    return numeroTarjeta;
  }

  public void setNumeroTarjeta(String numeroTarjeta) {
    this.numeroTarjeta = numeroTarjeta;
  }

  public String getNombreTitular() {
    return nombreTitular;
  }

  public void setNombreTitular(String nombreTitular) {
    this.nombreTitular = nombreTitular;
  }

  public LocalDate getFechaCaducidad() {
    return fechaCaducidad;
  }

  public void setFechaCaducidad(LocalDate fechaCaducidad) {
    this.fechaCaducidad = fechaCaducidad;
  }

  public Integer getCvv() {
    return cvv;
  }

  public void setCvv(Integer cvv) {
    this.cvv = cvv;
  }

}
