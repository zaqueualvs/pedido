package com.alves.pedido.adapters.out.database.h2.mapper;

import com.alves.pedido.adapters.out.database.h2.entities.CategoriaEntity;
import com.alves.pedido.adapters.out.database.h2.entities.ProdutoEntity;
import com.alves.pedido.domain.models.Categoria;
import com.alves.pedido.domain.models.Produto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoriaPersistenceMapper extends AbstractPersistenceMapper<Categoria, CategoriaEntity> {

    @Deprecated
    @Mapping(target = "categorias", ignore = true)
    Produto produtoEntityToProduto(ProdutoEntity produtoEntity);

    @Deprecated
    @Mapping(target = "categorias", ignore = true)
    ProdutoEntity produtoToProdutoEntity(Produto produto);
}
