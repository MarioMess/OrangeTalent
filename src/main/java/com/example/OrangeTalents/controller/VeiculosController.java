package com.example.OrangeTalents.controller;

import com.example.OrangeTalents.model.CadastroVeiculos;
import com.example.OrangeTalents.repository.CadastroVeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RequestMapping("/veiculos")
public class VeiculosController<ano> {

    @PersistenceContext
    EntityManager manager;
    
    @Autowired
    private CadastroVeiculoRepository veiculoRepository;

    @GetMapping(value = "/veiculo")
    public ResponseEntity<List<CadastroVeiculos>> GetAll() {
        return ResponseEntity.ok(veiculoRepository.findAll());
    }
    
    @GetMapping("/{id}")
	public ResponseEntity<CadastroVeiculos> buscarveiculos(@PathVariable long id) {
		return veiculoRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

    @PostMapping
    public ResponseEntity<CadastroVeiculos> cadastroveiculos(@RequestBody CadastroVeiculos veiculos) {
        if (veiculos == null) {
            return ResponseEntity.badRequest().build();
        }
        veiculoRepository.save(veiculos);
        return ResponseEntity.status(HttpStatus.CREATED).body(veiculoRepository.save(veiculos));
    }	
}