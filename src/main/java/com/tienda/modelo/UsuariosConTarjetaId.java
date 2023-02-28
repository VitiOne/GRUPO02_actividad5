package com.tienda.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.hibernate.Hibernate;

@Embeddable
public class UsuariosConTarjetaId implements Serializable {

  private static final long serialVersionUID = 2389751294978667053L;

  @Column(name = "id_usuarios", nullable = false)
  private Integer idUsuarios;

  @Column(name = "id_tarjetas", nullable = false)
  private Integer idTarjetas;

  public Integer getIdUsuarios() {
    return idUsuarios;
  }

  public void setIdUsuarios(Integer idUsuarios) {
    this.idUsuarios = idUsuarios;
  }

  public Integer getIdTarjetas() {
    return idTarjetas;
  }

  public void setIdTarjetas(Integer idTarjetas) {
    this.idTarjetas = idTarjetas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    UsuariosConTarjetaId entity = (UsuariosConTarjetaId) o;
    return Objects.equals(this.idTarjetas, entity.idTarjetas) && Objects.equals(this.idUsuarios, entity.idUsuarios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTarjetas, idUsuarios);
  }

}
