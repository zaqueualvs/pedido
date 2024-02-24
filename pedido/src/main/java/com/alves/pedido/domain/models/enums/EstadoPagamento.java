package com.alves.pedido.domain.models.enums;

public enum EstadoPagamento {
    PENDENTE("pendente"),
    QUITADO("quitado"),
    CANCELADO("cancelado");

    private String status;

    EstadoPagamento(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
