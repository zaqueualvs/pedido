package com.alves.pedido.adapters.out.database.h2.mapper;

import com.alves.pedido.adapters.out.database.h2.entities.PedidoEntity;
import com.alves.pedido.domain.models.Pedido;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PedidoPersistenceMapper extends AbstractPersistenceMapper<Pedido, PedidoEntity> {

}
