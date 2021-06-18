package com.example.OrangeTalents.model;

import org.hibernate.validator.constraints.br.CPF;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity(name = "usuario")
public class CadastroUsuario {

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

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@Column(name = "id")
	private List<CadastroVeiculos> idveiculo;

	public CadastroUsuario(){}

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
	
	public List<CadastroVeiculos> getIdveiculo() {

		return idveiculo;
	}

	public void setIdveiculo(List<CadastroVeiculos> idveiculo) {

		this.idveiculo = idveiculo;
	}
	
	public void setNome(String nome) {

		this.nome = nome;
	}

	public void setEmail(String email) {

		this.email = email;
	}

	public void setCpf(String cpf) {

		this.cpf = cpf;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;

	}
}