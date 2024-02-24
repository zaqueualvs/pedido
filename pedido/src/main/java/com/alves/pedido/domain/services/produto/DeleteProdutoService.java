package com.alves.pedido.domain.services.produto;

import com.alves.pedido.application.ports.in.produto.DeleteProdutoUseCase;
import com.alves.pedido.application.ports.out.produto.DeleteProdutoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Produto;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class DeleteProdutoService implements DeleteProdutoUseCase {

    private final DeleteProdutoPort deleteProdutoPort;

    @Override
    public void delete(Produto produto) {
        deleteProdutoPort.delete(produto);
    }
}
