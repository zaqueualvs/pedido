package com.alves.pedido.domain.models;

import java.io.Serializable;

public class ItemPedidoPk implements Serializable {
    private Pedido pedido;
    private Produto produto;

    public ItemPedidoPk() {
    }

    public ItemPedidoPk(Pedido pedido, Produto produto) {
        this.pedido = pedido;
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
