package com.alves.pedido.adapters.out.database.h2.mapper;

import com.alves.pedido.adapters.out.database.h2.entities.CidadeEntity;
import com.alves.pedido.adapters.out.database.h2.entities.ClienteEntity;
import com.alves.pedido.domain.models.Cidade;
import com.alves.pedido.domain.models.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientePersistenceMapper extends AbstractPersistenceMapper<Cliente, ClienteEntity> {

}
