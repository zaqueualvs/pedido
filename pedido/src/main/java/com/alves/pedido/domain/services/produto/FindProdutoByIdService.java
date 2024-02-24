package com.alves.pedido.domain.services.produto;

import com.alves.pedido.application.ports.in.produto.FindProdutoByIdUseCase;
import com.alves.pedido.application.ports.out.produto.FindProdutoByIdPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.exception.ProdutoNaoEncontradoException;
import com.alves.pedido.domain.models.Produto;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class FindProdutoByIdService implements FindProdutoByIdUseCase {

    private final FindProdutoByIdPort findProdutoByIdPort;

    @Override
    public Produto findById(Long id) {
        return findProdutoByIdPort.findById(id).orElseThrow(
                () -> new ProdutoNaoEncontradoException(id)
        );
    }
}
