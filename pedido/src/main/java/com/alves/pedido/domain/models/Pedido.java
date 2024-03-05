package com.alves.pedido.domain.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.*;

public class Pedido implements Serializable {
    private Long id;
    private OffsetDateTime dataPedido;
    private Set<ItemPedido> itemPedidos = new HashSet<>();

    private Endereco enderecoEntrega;
    private Pagamento pagamento;
    private Cliente cliente;
    private BigDecimal precoTotal;

    public Pedido() {
    }

    public Pedido(Long id,
                  OffsetDateTime dataPedido,
                  Endereco enderecoEntrega,
                  Cliente cliente) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.enderecoEntrega = enderecoEntrega;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OffsetDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(OffsetDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Set<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public void setItemPedidos(Set<ItemPedido> itemPedidos) {
        this.itemPedidos = itemPedidos;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void calculaPrecoTotal() {
        itemPedidos.forEach(ItemPedido::calculaSubTotal);
        precoTotal = itemPedidos.stream()
                .map(ItemPedido::getSubTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal getPrecoTotal() {
        return precoTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(id, pedido.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
