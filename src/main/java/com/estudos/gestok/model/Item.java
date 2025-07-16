package com.estudos.gestok.model;

import jakarta.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Ambiente idAmbiente;

    @Column(nullable = false)
    private String ni; //numero identificador

    @Column(nullable = false)
    private String nome;


}
