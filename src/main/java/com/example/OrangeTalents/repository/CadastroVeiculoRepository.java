package com.example.OrangeTalents.repository;
import com.example.OrangeTalents.cadastro.Veiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CadastroVeiculoRepository extends JpaRepository<Veiculos,Long> {}