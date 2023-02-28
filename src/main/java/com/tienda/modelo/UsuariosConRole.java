package com.tienda.modelo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios_con_roles")
public class UsuariosConRole {

  @EmbeddedId
  private UsuariosConRoleId id;

  @MapsId("idUsuarios")
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "id_usuarios", nullable = false)
  private Usuario idUsuarios;

  @MapsId("idRoles")
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "id_roles", nullable = false)
  private Role idRoles;

  public UsuariosConRoleId getId() {
    return id;
  }

  public void setId(UsuariosConRoleId id) {
    this.id = id;
  }

  public Usuario getIdUsuarios() {
    return idUsuarios;
  }

  public void setIdUsuarios(Usuario idUsuarios) {
    this.idUsuarios = idUsuarios;
  }

  public Role getIdRoles() {
    return idRoles;
  }

  public void setIdRoles(Role idRoles) {
    this.idRoles = idRoles;
  }

}
