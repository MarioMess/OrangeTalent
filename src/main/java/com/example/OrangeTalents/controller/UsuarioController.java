package com.example.OrangeTalents.controller;

import com.example.OrangeTalents.cadastro.Usuario;

import com.example.OrangeTalents.repository.CadastroUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RequestMapping("/usuarios")
public class UsuarioController {

    @PersistenceContext
    EntityManager manager;
    
    @Autowired
    private CadastroUsuarioRepository usuarioRepository;

    @GetMapping(value = "/usuario")
    public ResponseEntity<List<Usuario>> GetAll() {
        return ResponseEntity.ok(usuarioRepository.findAll());
    }

    @GetMapping("/{id}")
  	public ResponseEntity<Usuario> buscarusuarios(@PathVariable long id) {
  		return usuarioRepository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
  	}
     @PostMapping
     public ResponseEntity<Usuario> cadastrousuarios(@RequestBody Usuario usuario){
    	 if (usuario == null){
    		 return ResponseEntity.badRequest().build();
         }

         usuarioRepository.save(usuario);
         return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(usuario));
    }
}