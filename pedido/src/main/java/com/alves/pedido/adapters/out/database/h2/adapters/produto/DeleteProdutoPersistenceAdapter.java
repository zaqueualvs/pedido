package com.alves.pedido.adapters.out.database.h2.adapters.produto;

import com.alves.pedido.adapters.out.database.h2.mapper.ProdutoPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.ProdutoRepository;
import com.alves.pedido.application.ports.out.produto.DeleteProdutoPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Produto;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class DeleteProdutoPersistenceAdapter implements DeleteProdutoPort {

    private final ProdutoRepository produtoRepository;
    private final ProdutoPersistenceMapper produtoPersistenceMapper;

    @Override
    public void delete(Produto produto) {
        produtoRepository.delete(produtoPersistenceMapper.toEntity(produto));
    }
}
