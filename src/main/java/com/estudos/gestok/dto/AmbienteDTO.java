package com.estudos.gestok.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AmbienteDTO {

    @NotNull(message = "Código de referência do ambiente não pode ser vazio ")
    private String codigo;

    @Size(max = 50, message = "Nome não deve ter mais que 50 caracteres")
    @NotNull(message = "O nome do ambiente deve ser informado")
    private String nome;

    @NotNull(message = "Informação de localização deve ser informado")
    private String localizacao;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
