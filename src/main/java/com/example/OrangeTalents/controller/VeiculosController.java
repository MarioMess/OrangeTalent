package com.example.OrangeTalents.controller;


import com.example.OrangeTalents.cadastro.Veiculos;
import com.example.OrangeTalents.repository.CadastroVeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;

@RestController
@RequestMapping("/veiculos")
public class VeiculosController {

    @PersistenceContext
    EntityManager manager;
    @Autowired
    private CadastroVeiculoRepository veiculoRepository;


    @PostMapping(value = "/veiculos")
    public ResponseEntity<Veiculos> cadastro(@RequestBody @Valid Veiculos veiculos) {
        if (veiculos == null) {
            return ResponseEntity.badRequest().build();
        }
        veiculoRepository.save(veiculos);
        return ResponseEntity.status(HttpStatus.CREATED).body(veiculos);
    }
}