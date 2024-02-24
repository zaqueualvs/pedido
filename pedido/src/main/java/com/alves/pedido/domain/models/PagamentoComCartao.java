package com.alves.pedido.domain.models;

import com.alves.pedido.domain.models.enums.EstadoPagamento;

public class PagamentoComCartao extends Pagamento {
    private Integer numeroDeParcelas;

    public PagamentoComCartao() {
    }

    public PagamentoComCartao(Integer id,
                              EstadoPagamento estadoPagamento,
                              Integer numeroDeParcelas) {
        super(id, estadoPagamento);
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public Integer getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }
}
