package com.alves.pedido.application.ports.in.produto;

import com.alves.pedido.domain.models.Produto;

public interface FindProdutoByIdUseCase {
    Produto findById(Integer id);
}
