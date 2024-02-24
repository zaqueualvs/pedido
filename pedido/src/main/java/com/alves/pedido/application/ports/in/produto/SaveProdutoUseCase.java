package com.alves.pedido.application.ports.in.produto;

import com.alves.pedido.domain.models.Produto;

public interface SaveProdutoUseCase {
    Produto save(Produto produto);
}
