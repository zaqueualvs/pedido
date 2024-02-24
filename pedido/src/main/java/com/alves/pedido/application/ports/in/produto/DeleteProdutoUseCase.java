package com.alves.pedido.application.ports.in.produto;

import com.alves.pedido.domain.models.Produto;

public interface DeleteProdutoUseCase {
    void delete(Long id);

}
