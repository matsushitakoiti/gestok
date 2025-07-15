package com.estudos.gestok.model;

import com.estudos.gestok.enums.TipoArmarioEnum;
import jakarta.persistence.Entity;

@Entity
public class Armario {
    private Long id;
    private Ambiente ambiente;
    private String ni;
    private String nome;
    private TipoArmarioEnum tipo;


}
