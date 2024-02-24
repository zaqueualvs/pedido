package com.alves.pedido.domain.models.enums;

public enum TipoCliente {
    PESSOAFISICA("pessoa_fisica"),
    PESSOAJURIDICA("pessoa_juridica");

    private String tipo;

    TipoCliente(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
