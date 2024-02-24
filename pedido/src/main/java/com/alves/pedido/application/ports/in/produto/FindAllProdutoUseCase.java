package com.alves.pedido.application.ports.in.produto;

import com.alves.pedido.domain.models.Produto;

import java.util.List;

public interface FindAllProdutoUseCase {
    List<Produto> findAll();
}
