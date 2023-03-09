package com.tienda.controller.dto;

public class UsuarioRegistroDto {

  private String nombre;

  private String email;
  private String password;

  private String apellidos;
  private String direccion;
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public UsuarioRegistroDto(){

  }

  public UsuarioRegistroDto(String nombre, String password, String apellidos, String direccion, String email) {
    this.nombre = nombre;
    this.password = password;
    this.apellidos = apellidos;
    this.direccion = direccion;
    this.email = email;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }


}
