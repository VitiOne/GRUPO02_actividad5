package com.tienda.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.hibernate.Hibernate;

@Embeddable
public class UsuariosConDireccioneId implements Serializable {

  private static final long serialVersionUID = 7095476185964624340L;

  @Column(name = "id_usuarios", nullable = false)
  private Integer idUsuarios;

  @Column(name = "id_direcciones", nullable = false)
  private Integer idDirecciones;

  public Integer getIdUsuarios() {
    return idUsuarios;
  }

  public void setIdUsuarios(Integer idUsuarios) {
    this.idUsuarios = idUsuarios;
  }

  public Integer getIdDirecciones() {
    return idDirecciones;
  }

  public void setIdDirecciones(Integer idDirecciones) {
    this.idDirecciones = idDirecciones;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    UsuariosConDireccioneId entity = (UsuariosConDireccioneId) o;
    return Objects.equals(this.idDirecciones, entity.idDirecciones) && Objects.equals(this.idUsuarios, entity.idUsuarios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDirecciones, idUsuarios);
  }

}
