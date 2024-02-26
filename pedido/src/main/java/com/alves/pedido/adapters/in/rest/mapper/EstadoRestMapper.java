package com.alves.pedido.adapters.in.rest.mapper;

import com.alves.pedido.adapters.in.rest.data.request.EstadoRequest;
import com.alves.pedido.adapters.in.rest.data.response.EstadoResponse;
import com.alves.pedido.domain.models.Estado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EstadoRestMapper extends AbstractRestAdapterMapper<Estado, EstadoRequest, EstadoResponse>{
}
