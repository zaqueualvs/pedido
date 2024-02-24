package com.alves.pedido.application.ports.out.produto;

import com.alves.pedido.domain.models.Produto;

import java.util.Optional;

public interface FindProdutoByIdPort {
    Optional<Produto> findById(Long id);
}
