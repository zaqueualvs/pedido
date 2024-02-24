package com.alves.pedido.adapters.out.database.h2.adapters.produto;

import com.alves.pedido.application.ports.out.produto.SaveProdutoPort;
import com.alves.pedido.application.ports.out.produto.UpdateProdutoPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Produto;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class UpdateProdutoPersistenceAdapter implements UpdateProdutoPort {

    private final SaveProdutoPort saveProdutoPort;

    @Override
    public Produto update(Produto produto) {
        return saveProdutoPort.save(produto);
    }
}
