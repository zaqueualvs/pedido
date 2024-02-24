package com.alves.pedido.adapters.out.database.h2.mapper;

import com.alves.pedido.adapters.out.database.h2.entities.CategoriaEntity;
import com.alves.pedido.adapters.out.database.h2.entities.ProdutoEntity;
import com.alves.pedido.domain.models.Categoria;
import com.alves.pedido.domain.models.Produto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface ProdutoPersistenceMapper extends AbstractPersistenceMapper<Produto, ProdutoEntity> {

    @Deprecated
    @Mapping(target = "produtos", ignore = true)
    Categoria categoriaEntityToCategoria(CategoriaEntity categoriaEntity);

    @Deprecated
    @Mapping(target = "produtos", ignore = true)
    CategoriaEntity categoriaToCategoriaEntity(Categoria categoria);
}
