package com.example.OrangeTalents.cadastro;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String nome;

	@NotBlank(message = "Email inválido")
	@Email(message = "Email válido")
	@Column(unique = true)
	private String email;

	@NotBlank(message = "CPF válido")
	@CPF
	@Column(unique = true)
	private String cpf;

	@NotNull
	private Date dataNascimento;

	@ManyToOne
	private Veiculos veiculos;

	public Usuario(){}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getCpf() {
		return cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public Veiculos getVeiculos() {
		return veiculos;}
}
