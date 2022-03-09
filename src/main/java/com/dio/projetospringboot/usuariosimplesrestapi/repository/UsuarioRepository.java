package com.dio.projetospringboot.usuariosimplesrestapi.repository;

import com.dio.projetospringboot.usuariosimplesrestapi.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {



}
