package com.alves.pedido.adapters.out.database.h2.entities;

import com.alves.pedido.domain.models.Pedido;
import com.alves.pedido.domain.models.Produto;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


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

    public ItemPedidoEntity(Double desconto,
                            Integer quantidade,
                            BigDecimal preco,
                            ProdutoEntity produto,
                            PedidoEntity pedido) {
        this.id.setPedido(pedido);
        this.id.setProduto(produto);
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public ProdutoEntity getProduto() {
        return id.getProduto();
    }
    public void setProduto(ProdutoEntity produtoEntity) {
        id.setProduto(produtoEntity);
    }

    public PedidoEntity getPedido() {
        return id.getPedido();
    }
    public void setPerdido(PedidoEntity pedidoEntity) {
        id.setPedido(pedidoEntity);
    }
}
