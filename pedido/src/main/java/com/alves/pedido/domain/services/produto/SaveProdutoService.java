package com.alves.pedido.domain.services.produto;

import com.alves.pedido.application.ports.in.produto.SaveProdutoUseCase;
import com.alves.pedido.application.ports.out.produto.SaveProdutoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Produto;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class SaveProdutoService implements SaveProdutoUseCase {
    private final SaveProdutoPort saveProdutoPort;

    @Override
    public Produto save(Produto produto) {
        return saveProdutoPort.save(produto);
    }
}
