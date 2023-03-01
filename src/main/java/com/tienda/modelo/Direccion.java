package com.tienda.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "direccion")
public class Direccion {

  @Id
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "cp", nullable = false, length = 5)
  private String cp;

  @Column(name = "localidad", nullable = false, length = 20)
  private String localidad;

  @Column(name = "calle", nullable = false, length = 20)
  private String calle;

  @Column(name = "numero", nullable = false)
  private Integer numero;

  @Column(name = "piso", length = 20)
  private String piso;

  @Column(name = "letra", length = 10)
  private String letra;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCp() {
    return cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public String getLocalidad() {
    return localidad;
  }

  public void setLocalidad(String localidad) {
    this.localidad = localidad;
  }

  public String getCalle() {
    return calle;
  }

  public void setCalle(String calle) {
    this.calle = calle;
  }

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public String getPiso() {
    return piso;
  }

  public void setPiso(String piso) {
    this.piso = piso;
  }

  public String getLetra() {
    return letra;
  }

  public void setLetra(String letra) {
    this.letra = letra;
  }

}
