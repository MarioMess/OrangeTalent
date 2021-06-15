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
@RequestMapping("/usuario")
public class UsuarioController {

    @PersistenceContext
    EntityManager manager;
    @Autowired
    private CadastroUsuarioRepository usuarioRepository;

    @GetMapping(value = "/usuario")
    public ResponseEntity<List<Usuario>> GetAll() {
        return ResponseEntity.ok(usuarioRepository.findAll());
    }

//        @GetMapping("/{cpf}")
//    public String busca(@PathVariable @RequestBody @Valid String cpf){
//        return usuarioRepository.findById(cpf).
//                orElseThrow(()->new ResponseStatusException(NOT_FOUND,
//                        "usuario não encontrado"));
//    }

    @PostMapping(value = "/usuario")
        public ResponseEntity<Usuario> cadastro(@RequestBody Usuario usuario){
            if (usuario == null){
                return ResponseEntity.badRequest().build();
            }

            usuarioRepository.save(usuario);
            return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

}
