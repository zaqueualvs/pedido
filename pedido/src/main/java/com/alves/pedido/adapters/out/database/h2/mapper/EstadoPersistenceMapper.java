package com.alves.pedido.adapters.out.database.h2.mapper;

import com.alves.pedido.adapters.out.database.h2.entities.EstadoEntity;
import com.alves.pedido.domain.models.Estado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EstadoPersistenceMapper extends AbstractPersistenceMapper<Estado, EstadoEntity>{
}
