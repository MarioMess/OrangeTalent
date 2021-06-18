package com.example.OrangeTalents.repository;

import com.example.OrangeTalents.model.CadastroUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroUsuarioRepository extends JpaRepository<CadastroUsuario,Long> {}

