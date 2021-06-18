package com.example.OrangeTalents.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity(name = "veiculos")
public class CadastroVeiculos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String marca;

    @NotBlank
    private String modelo;

    @NotNull
    private Integer ano;
    
    @ManyToOne
    private CadastroUsuario usuario;

    public CadastroVeiculos(){}

    public Long getId() {

        return id;
    }

    public String getMarca() {

        return marca;
    }   

	public String getModelo() {

        return modelo;
    }

    public Integer getAno() {

        return ano;
    }
}