package com.alves.pedido.domain.models.enums;

public enum EstadoPagamento {
    PENDENTE("Pendente"),
    QUITADO("Quitado"),
    CANCELADO("Cancelado");

    private String status;

    EstadoPagamento(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
