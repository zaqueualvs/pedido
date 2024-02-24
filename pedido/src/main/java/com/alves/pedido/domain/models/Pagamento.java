package com.alves.pedido.domain.models;

import com.alves.pedido.domain.models.enums.EstadoPagamento;

import java.util.Objects;

public abstract class Pagamento {
    private Integer id;
    private EstadoPagamento estadoPagamento;

    public Pagamento() {
    }

    public Pagamento(Integer id, EstadoPagamento estadoPagamento) {
        this.id = id;
        this.estadoPagamento = estadoPagamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EstadoPagamento getEstadoPagamento() {
        return estadoPagamento;
    }

    public void setEstadoPagamento(EstadoPagamento estadoPagamento) {
        this.estadoPagamento = estadoPagamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pagamento pagamento = (Pagamento) o;
        return Objects.equals(id, pagamento.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
