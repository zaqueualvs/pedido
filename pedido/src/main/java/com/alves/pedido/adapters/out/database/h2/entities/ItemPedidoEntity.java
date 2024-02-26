package com.alves.pedido.adapters.out.database.h2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "item_pedido")
public class ItemPedidoEntity {

    @EmbeddedId
    private ItemPedidoIdEntity id;
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
}
