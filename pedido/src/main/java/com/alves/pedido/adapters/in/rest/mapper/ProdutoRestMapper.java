package com.alves.pedido.adapters.in.rest.mapper;

import com.alves.pedido.adapters.in.rest.data.request.ProdutoRequest;
import com.alves.pedido.adapters.in.rest.data.response.ProdutoResponse;
import com.alves.pedido.domain.models.Produto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProdutoRestMapper extends AbstractRestAdapterMapper<Produto, ProdutoRequest, ProdutoResponse> {
}
