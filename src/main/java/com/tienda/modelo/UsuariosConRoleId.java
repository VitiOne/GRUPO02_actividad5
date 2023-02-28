package com.tienda.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.hibernate.Hibernate;

@Embeddable
public class UsuariosConRoleId implements Serializable {

  private static final long serialVersionUID = 7381036942767114082L;

  @Column(name = "id_usuarios", nullable = false)
  private Integer idUsuarios;

  @Column(name = "id_roles", nullable = false)
  private Integer idRoles;

  public Integer getIdUsuarios() {
    return idUsuarios;
  }

  public void setIdUsuarios(Integer idUsuarios) {
    this.idUsuarios = idUsuarios;
  }

  public Integer getIdRoles() {
    return idRoles;
  }

  public void setIdRoles(Integer idRoles) {
    this.idRoles = idRoles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    UsuariosConRoleId entity = (UsuariosConRoleId) o;
    return Objects.equals(this.idRoles, entity.idRoles) && Objects.equals(this.idUsuarios, entity.idUsuarios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idRoles, idUsuarios);
  }

}
