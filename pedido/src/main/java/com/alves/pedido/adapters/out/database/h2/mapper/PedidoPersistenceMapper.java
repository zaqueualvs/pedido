package com.alves.pedido.adapters.out.database.h2.mapper;

import com.alves.pedido.adapters.out.database.h2.entities.*;
import com.alves.pedido.domain.models.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PedidoPersistenceMapper extends AbstractPersistenceMapper<Pedido, PedidoEntity>, PagamentoInstanciaMapper {
    @Override
    PedidoEntity toEntity(final Pedido domain);

    @Deprecated
    @Mapping(target = "cliente", ignore = true)
    EnderecoEntity enderecoToEnderecoEntity(Endereco endereco);

    @Deprecated
    @Mapping(target = "cliente", ignore = true)
    Endereco enderecoEntityToEndereco(EnderecoEntity enderecoEntity);

    @Deprecated
    @Mapping(target = "cidades", ignore = true)
    Estado estadoEntityToEstado(EstadoEntity estadoEntity);

    @Deprecated
    @Mapping(target = "cidades", ignore = true)
    EstadoEntity estadoToEstadoEntity(Estado estado);

    @Deprecated
    @Mapping(target = "pedidos", ignore = true)
    @Mapping(target = "enderecos", ignore = true)
    ClienteEntity clienteToClienteEntity(Cliente cliente);

    @Deprecated
    @Mapping(target = "pedidos", ignore = true)
    @Mapping(target = "enderecos", ignore = true)
    Cliente clienteEntityToCliente(ClienteEntity clienteEntity);

    @Deprecated
    @Mapping(target = "produtos", ignore = true)
    Categoria categoriaEntityToCategoria(CategoriaEntity categoriaEntity);

    @Deprecated
    @Mapping(target = "produtos", ignore = true)
    CategoriaEntity categoriaToCategoriaEntity(Categoria categoria);

    @Deprecated
    @Mapping(target = "pedido", ignore = true)
    ItemPedido itemPedidoEntityToItemPedido(ItemPedidoEntity itemPedidoEntity);

    @Deprecated
    @Mapping(target = "pedido", ignore = true)
    ItemPedidoEntity itemPedidoToItemPedidoEntity(ItemPedido itemPedido);

}
