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

    @OneToMany(mappedBy = "veiculos", cascade = CascadeType.ALL)
    @JoinColumn(name = "veiculos_id")
    private List<Usuario> usuario;

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

    public List<Usuario> getUsuario() {
        return usuario;
    }
}
