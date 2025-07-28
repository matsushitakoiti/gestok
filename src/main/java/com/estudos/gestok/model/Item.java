package com.estudos.gestok.model;

import com.estudos.gestok.enums.TipoItemEnum;
import jakarta.persistence.*;
import org.w3c.dom.Text;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Armario armario;

    @Column(nullable = false, length = 8)
    private String ni; //numero identificador

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String descricao;

    @Column(nullable = false)
    private boolean disponivel;

    @Column(nullable = false)
    private TipoItemEnum tipoPatrimonio;



}
