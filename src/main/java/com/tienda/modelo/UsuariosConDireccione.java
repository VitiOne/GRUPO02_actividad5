package com.tienda.modelo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios_con_direcciones")
public class UsuariosConDireccione {

  @EmbeddedId
  private UsuariosConDireccioneId id;

  @MapsId("idUsuarios")
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "id_usuarios", nullable = false)
  private Usuario idUsuarios;

  @MapsId("idDirecciones")
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "id_direcciones", nullable = false)
  private Direccione idDirecciones;

  public UsuariosConDireccioneId getId() {
    return id;
  }

  public void setId(UsuariosConDireccioneId id) {
    this.id = id;
  }

  public Usuario getIdUsuarios() {
    return idUsuarios;
  }

  public void setIdUsuarios(Usuario idUsuarios) {
    this.idUsuarios = idUsuarios;
  }

  public Direccione getIdDirecciones() {
    return idDirecciones;
  }

  public void setIdDirecciones(Direccione idDirecciones) {
    this.idDirecciones = idDirecciones;
  }

}
