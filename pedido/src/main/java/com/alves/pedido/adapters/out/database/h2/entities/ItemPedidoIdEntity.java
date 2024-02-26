package com.alves.pedido.adapters.out.database.h2.entities;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Embeddable
public class ItemPedidoIdEntity implements Serializable {
    @EqualsAndHashCode.Include
    private Long produtoId;
    @EqualsAndHashCode.Include
    private Long pedidoId;
}
