package com.alves.pedido.domain.services.produto;

import com.alves.pedido.application.ports.in.produto.FindAllProdutoUseCase;
import com.alves.pedido.application.ports.out.produto.FindAllProdutoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Produto;
import lombok.RequiredArgsConstructor;

import java.util.List;

@UseCase
@RequiredArgsConstructor
public class FindAllProdutoService implements FindAllProdutoUseCase {
    private final FindAllProdutoPort findAllProdutoPort;

    @Override
    public List<Produto> findAll() {
        return findAllProdutoPort.findAll();
    }
}
