package com.alves.pedido.adapters.out.database.h2.adapters.produto;

import com.alves.pedido.adapters.out.database.h2.mapper.ProdutoPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.ProdutoRepository;
import com.alves.pedido.application.ports.out.produto.FindAllProdutoPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Produto;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@PersistenceAdapter
@RequiredArgsConstructor
public class FindAllProdutoPersistenceAdapter implements FindAllProdutoPort {

    private final ProdutoRepository produtoRepository;
    private final ProdutoPersistenceMapper produtoPersistenceMapper;

    @Override
    public List<Produto> findAll() {
        return produtoRepository.findAll()
                .stream()
                .map(produtoPersistenceMapper::toDomain)
                .collect(Collectors.toList());
    }
}
