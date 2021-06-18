package com.example.OrangeTalents.repository;
import com.example.OrangeTalents.model.CadastroVeiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CadastroVeiculoRepository extends JpaRepository<CadastroVeiculos,Long> {}