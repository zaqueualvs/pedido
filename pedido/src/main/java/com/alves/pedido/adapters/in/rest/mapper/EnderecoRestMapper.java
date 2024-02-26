package com.alves.pedido.adapters.in.rest.mapper;

import com.alves.pedido.adapters.in.rest.data.request.EnderecoRequest;
import com.alves.pedido.adapters.in.rest.data.response.EnderecoResponse;
import com.alves.pedido.domain.models.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoRestMapper extends AbstractRestAdapterMapper<Endereco, EnderecoRequest, EnderecoResponse> {
}
