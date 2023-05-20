package com.docker.dockerchallenge.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "linguagens")
public class Linguagens {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome")
    private String nome;


}
