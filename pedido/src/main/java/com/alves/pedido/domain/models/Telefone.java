package com.alves.pedido.domain.models;

public class Telefone {
    private String telefone;

    public Telefone() {
    }

    public Telefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
