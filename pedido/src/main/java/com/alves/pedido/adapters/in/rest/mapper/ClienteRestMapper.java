package com.alves.pedido.adapters.in.rest.mapper;

import com.alves.pedido.adapters.in.rest.data.request.ClienteRequest;
import com.alves.pedido.adapters.in.rest.data.response.ClienteResponse;
import com.alves.pedido.domain.models.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteRestMapper extends AbstractRestAdapterMapper<Cliente, ClienteRequest, ClienteResponse> {
}
