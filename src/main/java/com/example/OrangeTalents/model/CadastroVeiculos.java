package com.example.OrangeTalents.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

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

    private LocalDateTime hoje = LocalDateTime.now();
    
    @ManyToOne
    private CadastroUsuario usuario;

    public CadastroVeiculos(){}

    public String getMarca() {
        return marca;
    }   

	public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }


	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public LocalDateTime getHoje() {
        return hoje;
    }
}