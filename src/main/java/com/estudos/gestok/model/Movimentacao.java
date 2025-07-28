package com.estudos.gestok.model;

import com.estudos.gestok.enums.TipoMovimentacaoEnum;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Funcionario funcionario;

    @ManyToOne(optional = false)
    private Item item;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date data;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoMovimentacaoEnum tipo;

}
