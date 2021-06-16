package com.example.OrangeTalents.cadastro;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Veiculos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String veiculo;

    @NotBlank
    private String marca;

    @NotBlank
    private String modelo;

    @NotNull
    private Integer ano;

    //@OneToMany(mappedBy = "veiculos", cascade = CascadeType.ALL)
    //private List<Usuario> usuario;
    
    @ManyToOne
    private Usuario usuario;

    public Veiculos(){}

    public String getVeiculo() {
        return veiculo;
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

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
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
    
  
    
 }

