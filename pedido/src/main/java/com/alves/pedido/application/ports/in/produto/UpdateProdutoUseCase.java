package com.alves.pedido.application.ports.in.produto;

import com.alves.pedido.domain.models.Produto;

public interface UpdateProdutoUseCase {
    Produto update(Produto produto);
}
