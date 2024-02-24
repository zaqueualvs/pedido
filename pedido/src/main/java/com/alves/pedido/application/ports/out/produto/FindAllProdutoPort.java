package com.alves.pedido.application.ports.out.produto;

import com.alves.pedido.domain.models.Produto;

import java.util.List;

public interface FindAllProdutoPort {
    List<Produto> findAll();
}
