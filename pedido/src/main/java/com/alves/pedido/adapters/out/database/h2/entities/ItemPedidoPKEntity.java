package com.alves.pedido.adapters.out.database.h2.entities;

import com.alves.pedido.domain.models.Produto;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Embeddable
public class ItemPedidoPKEntity implements Serializable {
    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "produto_id")
    private ProdutoEntity produto;
    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private PedidoEntity pedido;
}
