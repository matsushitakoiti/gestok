package com.estudos.gestok.model;

import jakarta.persistence.*;

@Entity
public class RefreshToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Funcionario funcionario;

    @Column(nullable = false)
    private String token;
}
