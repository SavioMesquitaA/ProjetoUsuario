package com.dio.projetospringboot.usuariosimplesrestapi.controller;

import com.dio.projetospringboot.usuariosimplesrestapi.model.Usuario;
import com.dio.projetospringboot.usuariosimplesrestapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/api/usuario/{id}")
    public ResponseEntity consultar(@PathVariable("id") Integer id){
        return repository.findById(id).map(record -> ResponseEntity.ok()
                .body(record)).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/usuario/salvar")
    public Usuario salvar(@RequestBody Usuario usuario){
        return repository.save(usuario);
    }



}
