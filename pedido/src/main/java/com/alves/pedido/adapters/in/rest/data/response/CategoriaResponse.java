package com.alves.pedido.adapters.in.rest.data.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CategoriaResponse implements Serializable {
    private Long id;
    private String nome;
    private Set<ProdutoCategoriaResponse> produtos = new HashSet<>();
}
