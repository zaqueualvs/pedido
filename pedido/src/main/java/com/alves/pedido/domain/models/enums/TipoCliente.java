package com.alves.pedido.domain.models.enums;

public enum TipoCliente {
    PESSOAFISICA(1, "Pessoa Fisica"),
    PESSOAJURIDICA(2, "Pessoa Juridica");

    private Integer cod;

    private String tipo;

    TipoCliente(Integer cod, String tipo) {
        this.cod = cod;
        this.tipo = tipo;
    }

    public Integer getCod() {
        return cod;
    }

    public String getTipo() {
        return tipo;
    }

    public static TipoCliente toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (TipoCliente x : TipoCliente.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Codigo invalido: " + cod);
    }
}
