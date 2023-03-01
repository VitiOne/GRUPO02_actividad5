package com.tienda.modelo;

import java.time.LocalDate;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class  Usuario {

  @Id
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "nombre", nullable = false, length = 20)
  private String nombre;

  @Column(name = "apellidos", nullable = false, length = 45)
  private String apellidos;

  @Column(name = "fecha_nacimiento")
  private LocalDate fechaNacimiento;

  @Column(name = "email", nullable = false, length = 45)
  private String email;

  @Column(name = "password", nullable = false, length = 45)
  private String password;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "id_rol", nullable = false)
  private Role idRol;

  @ManyToMany
  @JoinTable(name = "usuario_direccion",
      joinColumns = { @JoinColumn(name = "id_usuario") },
      inverseJoinColumns = { @JoinColumn(name = "id_direccion") })
  private Set<Direccion> direcciones;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Role getIdRol() {
    return idRol;
  }

  public void setIdRol(Role idRol) {
    this.idRol = idRol;
  }

}
