package com.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.modelo.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{

  @Query(value = "select * from usuario where email = :email and password = :password", nativeQuery = true)
  Usuario findUsuario(@Param(value="email") String email, @Param(value="password") String password);

}
