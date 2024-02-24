package com.alves.pedido.adapters.out.database.h2.mapper;

import com.alves.pedido.adapters.out.database.h2.entities.CategoriaEntity;
import com.alves.pedido.domain.models.Categoria;
import org.mapstruct.Mapper;

@Mapper(uses = {ProdutoPersistenceMapper.class})
public interface CategoriaPersistenceMapper extends AbstractPersistenceAdapter<Categoria, CategoriaEntity> {

}
