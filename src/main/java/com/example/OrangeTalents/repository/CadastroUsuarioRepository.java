package com.example.OrangeTalents.repository;

import com.example.OrangeTalents.cadastro.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroUsuarioRepository extends JpaRepository<Usuario,Long> {
}

