package com.alves.pedido.domain.services.produto;

import com.alves.pedido.application.ports.in.produto.UpdateProdutoUseCase;
import com.alves.pedido.application.ports.out.produto.UpdateProdutoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Produto;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class UpdateProdutoService implements UpdateProdutoUseCase {
    private final UpdateProdutoPort updateProdutoPort;

    @Override
    public Produto update(Produto produto) {
        return updateProdutoPort.update(produto);
    }
}
