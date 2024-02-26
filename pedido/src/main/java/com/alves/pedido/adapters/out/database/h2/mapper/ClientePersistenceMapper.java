package com.alves.pedido.adapters.out.database.h2.mapper;

import com.alves.pedido.adapters.out.database.h2.entities.ClienteEntity;
import com.alves.pedido.adapters.out.database.h2.entities.EnderecoEntity;
import com.alves.pedido.adapters.out.database.h2.entities.EstadoEntity;
import com.alves.pedido.domain.models.Cliente;
import com.alves.pedido.domain.models.Endereco;
import com.alves.pedido.domain.models.Estado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientePersistenceMapper extends AbstractPersistenceMapper<Cliente, ClienteEntity> {

    @Deprecated
    @Mapping(target = "cliente", ignore = true)
    Endereco enderecoEntityToEndereco(EnderecoEntity enderecoEntity);

    @Deprecated
    @Mapping(target = "cliente", ignore = true)
    EnderecoEntity enderecoToEnderecoEntity(Endereco endereco);

    @Deprecated
    @Mapping(target = "cidades", ignore = true)
    Estado estadoEntityToEstado(EstadoEntity estadoEntity);

    @Deprecated
    @Mapping(target = "cidades", ignore = true)
    EstadoEntity estadoToEstadoEntity(Estado estado);


}
