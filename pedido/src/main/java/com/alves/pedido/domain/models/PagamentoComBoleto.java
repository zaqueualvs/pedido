package com.alves.pedido.domain.models;

import com.alves.pedido.domain.models.enums.EstadoPagamento;

import java.time.OffsetDateTime;

public class PagamentoComBoleto extends Pagamento{
    private OffsetDateTime dataVencimento;
    private OffsetDateTime dataPagamento;

    public PagamentoComBoleto() {
    }

    public PagamentoComBoleto(Long id, EstadoPagamento estadoPagamento, Pedido pedido, OffsetDateTime dataVencimento, OffsetDateTime dataPagamento) {
        super(id, estadoPagamento, pedido);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public OffsetDateTime getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(OffsetDateTime dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public OffsetDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(OffsetDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
