package com.alves.pedido.application.ports.out.produto;

import com.alves.pedido.domain.models.Produto;

public interface UpdateProdutoPort {
    Produto update(Produto produto);
}
