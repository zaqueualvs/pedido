package com.alves.pedido.adapters.out.database.h2.mapper;

import com.alves.pedido.adapters.out.database.h2.entities.EnderecoEntity;
import com.alves.pedido.domain.models.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoPersistenceMapper extends AbstractPersistenceMapper<Endereco, EnderecoEntity> {

}
