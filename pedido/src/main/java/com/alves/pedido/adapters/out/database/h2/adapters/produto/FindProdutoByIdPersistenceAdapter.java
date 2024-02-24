package com.alves.pedido.adapters.out.database.h2.adapters.produto;

import com.alves.pedido.adapters.out.database.h2.entities.ProdutoEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.ProdutoPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.ProdutoRepository;
import com.alves.pedido.application.ports.out.produto.FindProdutoByIdPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Produto;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@PersistenceAdapter
@RequiredArgsConstructor
public class FindProdutoByIdPersistenceAdapter implements FindProdutoByIdPort {

    private final ProdutoRepository produtoRepository;
    private final ProdutoPersistenceMapper produtoPersistenceMapper;

    @Override
    public Optional<Produto> findById(Long id) {
        Optional<ProdutoEntity> produtoEntityO = produtoRepository.findById(id);
        if (produtoEntityO.isEmpty()) {
            return Optional.empty();
        }
        Produto produto = produtoPersistenceMapper.toDomain(produtoEntityO.get());
        return Optional.of(produto);
    }
}
