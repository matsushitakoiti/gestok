package com.estudos.gestok.model;

import com.estudos.gestok.enums.TipoArmarioEnum;
import jakarta.persistence.*;

@Entity
public class Armario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Ambiente ambiente;

    @Column(nullable = false)
    private String ni;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private TipoArmarioEnum tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public String getNi() {
        return ni;
    }

    public void setNi(String ni) {
        this.ni = ni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoArmarioEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoArmarioEnum tipo) {
        this.tipo = tipo;
    }
}
