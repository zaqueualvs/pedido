package com.alves.pedido.adapters.out.database.h2.mapper;

import com.alves.pedido.adapters.out.database.h2.entities.ProdutoEntity;
import com.alves.pedido.domain.models.Produto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProdutoPersistenceMapper extends AbstractPersistenceAdapter<Produto, ProdutoEntity> {

}
