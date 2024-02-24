package com.alves.pedido.adapters.out.database.h2.mapper;

import com.alves.pedido.adapters.out.database.h2.entities.CidadeEntity;
import com.alves.pedido.domain.models.Cidade;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CidadePersistenceMapper extends AbstractPersistenceMapper<Cidade, CidadeEntity> {

}
