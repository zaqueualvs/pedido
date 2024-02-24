package com.alves.pedido.adapters.out.database.h2.adapters.produto;

import com.alves.pedido.adapters.out.database.h2.entities.ProdutoEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.ProdutoPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.ProdutoRepository;
import com.alves.pedido.application.ports.out.produto.SaveProdutoPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Produto;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class SaveProdutoPersistenceAdapter implements SaveProdutoPort {

    private final ProdutoRepository produtoRepository;
    private final ProdutoPersistenceMapper produtoPersistenceMapper;

    @Override
    public Produto save(Produto produto) {
        ProdutoEntity produtoEntity = produtoPersistenceMapper.toEntity(produto);
        produtoEntity = produtoRepository.save(produtoEntity);
        produto = produtoPersistenceMapper.toDomain(produtoEntity);
        return produto;
    }
}
