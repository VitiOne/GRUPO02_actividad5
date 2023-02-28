package com.tienda.modelo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios_con_tarjetas")
public class UsuariosConTarjeta {

  @EmbeddedId
  private UsuariosConTarjetaId id;

  @MapsId("idUsuarios")
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "id_usuarios", nullable = false)
  private Usuario idUsuarios;

  @MapsId("idTarjetas")
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "id_tarjetas", nullable = false)
  private Tarjeta idTarjetas;

  public UsuariosConTarjetaId getId() {
    return id;
  }

  public void setId(UsuariosConTarjetaId id) {
    this.id = id;
  }

  public Usuario getIdUsuarios() {
    return idUsuarios;
  }

  public void setIdUsuarios(Usuario idUsuarios) {
    this.idUsuarios = idUsuarios;
  }

  public Tarjeta getIdTarjetas() {
    return idTarjetas;
  }

  public void setIdTarjetas(Tarjeta idTarjetas) {
    this.idTarjetas = idTarjetas;
  }

}
