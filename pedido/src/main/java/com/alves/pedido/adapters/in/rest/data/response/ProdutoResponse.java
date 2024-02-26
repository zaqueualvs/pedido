package com.alves.pedido.adapters.in.rest.data.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProdutoResponse implements Serializable {
    private Long id;
    private String nome;
    private BigDecimal preco;
    private Set<CategoriaProdutoResponse> categorias = new HashSet<>();
}
