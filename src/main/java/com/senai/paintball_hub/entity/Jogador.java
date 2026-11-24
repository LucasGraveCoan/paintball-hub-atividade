package com.senai.paintball_hub.entity;

import jakarta.persistence.*;
import lombok.*;
//isso são coisas do lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//isso são JPA
@Entity
@Table (name = "jogadores")

public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

@Column(name = "nome", nullable = false)
    private String nome;

@Column(name = "idade")
    private Integer idade;


}
