package com.senai.paintball_hub.repository;

import com.senai.paintball_hub.entity.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//o jpa precisa saber a entidade e o tipo da chave primaria

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Integer > {

}
