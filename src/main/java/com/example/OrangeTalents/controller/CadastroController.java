package com.example.OrangeTalents.controller;

import com.example.OrangeTalents.cadastro.Usuario;
import com.example.OrangeTalents.cadastro.Veiculos;
import com.example.OrangeTalents.repository.CadastroUsuarioRepository;
import com.example.OrangeTalents.repository.CadastroVeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controleveiculos")
public class CadastroController {

    @Autowired
    private CadastroUsuarioRepository usuarioRepository;

    @Autowired
    private CadastroVeiculoRepository veiculoRepository;

    @PostMapping(value = "/usuario")
    public ResponseEntity <Usuario> cadastro(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

    @PostMapping(value = "/veiculos")
    public ResponseEntity <Veiculos> cadastro(@RequestBody Veiculos veiculos){
        veiculoRepository.save(veiculos);
        return ResponseEntity.status(HttpStatus.CREATED).body(veiculos);
    }
}
