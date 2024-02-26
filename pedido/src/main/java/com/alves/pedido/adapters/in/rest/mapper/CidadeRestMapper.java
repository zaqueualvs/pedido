package com.alves.pedido.adapters.in.rest.mapper;

import com.alves.pedido.adapters.in.rest.data.request.CidadeRequest;
import com.alves.pedido.adapters.in.rest.data.response.CidadeResponse;
import com.alves.pedido.domain.models.Cidade;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CidadeRestMapper extends AbstractRestAdapterMapper<Cidade, CidadeRequest, CidadeResponse>{
}
