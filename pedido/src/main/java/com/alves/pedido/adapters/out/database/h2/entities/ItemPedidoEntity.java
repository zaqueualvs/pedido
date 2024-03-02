package com.alves.pedido.adapters.out.database.h2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "item_pedido")
public class ItemPedidoEntity {

    @EmbeddedId
    private ItemPedidoPKEntity id;
    private Double desconto;
    private Integer quantidade;
    private BigDecimal preco;
    @MapsId("produtoId")
    @ManyToOne(optional = false)
    @JoinColumn(name = "produto_id")
    private ProdutoEntity produto;
    @MapsId("pedidoId")
    @ManyToOne(optional = false)
    @JoinColumn(name = "pedido_id")
    private PedidoEntity pedido;

    public ItemPedidoEntity(Double desconto, Integer quantidade, BigDecimal preco, ProdutoEntity produto, PedidoEntity pedido) {
        this.id.setPedido(pedido);
        this.id.setProduto(produto);
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
        this.pedido = pedido;
    }


    public ProdutoEntity getProduto() {
        return id.getProduto();
    }

    public PedidoEntity getPedido() {
        return id.getPedido();
    }
}
