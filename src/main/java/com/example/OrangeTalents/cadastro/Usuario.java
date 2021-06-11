package com.example.OrangeTalents.cadastro;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Usuario {

	private String nome;
	private String email;
	private String cpf;
	private LocalDate dataNascimento;

}
