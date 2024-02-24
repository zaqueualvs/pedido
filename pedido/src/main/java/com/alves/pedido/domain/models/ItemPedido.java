package com.alves.pedido.domain.models;

import java.math.BigDecimal;

public class ItemPedido {
    private Double desconto;
    private Integer quantidade;
    private BigDecimal preco;
    private Produto produto;
    private Pedido pedido;

    public ItemPedido() {
    }

    public ItemPedido(Double desconto, Integer quantidade, BigDecimal preco, Produto produto, Pedido pedido) {
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
        this.pedido = pedido;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

}
