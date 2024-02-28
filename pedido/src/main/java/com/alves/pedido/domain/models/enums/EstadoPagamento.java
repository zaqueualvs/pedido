package com.alves.pedido.domain.models.enums;

public enum EstadoPagamento {
    PENDENTE(1, "Pendente"),
    QUITADO(2, "Quitado"),
    CANCELADO(3, "Cancelado");

    private String status;
    private Integer cod;

    EstadoPagamento(Integer cod, String status) {
        this.cod = cod;
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public Integer getCod() {
        return cod;
    }

    public static EstadoPagamento toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (EstadoPagamento x : EstadoPagamento.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Codigo invalido: " + cod);
    }
}
