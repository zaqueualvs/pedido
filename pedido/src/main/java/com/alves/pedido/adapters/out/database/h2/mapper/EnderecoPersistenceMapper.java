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
public interface EnderecoPersistenceMapper extends AbstractPersistenceMapper<Endereco, EnderecoEntity> {

    @Deprecated
    @Mapping(target = "enderecos", ignore = true)
    Cliente clienteEntityToCliente(ClienteEntity clienteEntity);

    @Deprecated
    @Mapping(target = "enderecos", ignore = true)
    ClienteEntity clienteToClienteEntity(Cliente cliente);

    @Deprecated
    @Mapping(target = "cidades", ignore = true)
    Estado estadoEntityToEstado(EstadoEntity estadoEntity);

    @Deprecated
    @Mapping(target = "cidades", ignore = true)
    EstadoEntity estadoToEstadoEntity(Estado estado);
}
