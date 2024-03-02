package com.alves.pedido.adapters.out.database.h2.mapper;

import com.alves.pedido.adapters.out.database.h2.entities.ClienteEntity;
import com.alves.pedido.adapters.out.database.h2.entities.EnderecoEntity;
import com.alves.pedido.adapters.out.database.h2.entities.EstadoEntity;
import com.alves.pedido.adapters.out.database.h2.entities.PedidoEntity;
import com.alves.pedido.domain.models.Cliente;
import com.alves.pedido.domain.models.Endereco;
import com.alves.pedido.domain.models.Estado;
import com.alves.pedido.domain.models.Pedido;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientePersistenceMapper extends AbstractPersistenceMapper<Cliente, ClienteEntity>, PagamentoInstanciaMapper {

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

    @Deprecated
    @Mapping(target = "cliente", ignore = true)
    Pedido pedidoEntityToPedido(PedidoEntity pedidoEntity);

    @Deprecated
    @Mapping(target = "cliente", ignore = true)
    PedidoEntity pedidoToPedidoEntity(Pedido pedido);


}
