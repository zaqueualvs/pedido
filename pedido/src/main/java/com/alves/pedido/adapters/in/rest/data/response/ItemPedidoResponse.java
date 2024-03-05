package com.alves.pedido.adapters.in.rest.data.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ItemPedidoResponse {

    private ProdutoResponse produto;
    private Double desconto;
    private Integer quantidade;
    private BigDecimal preco;
    private BigDecimal subTotal;
}
