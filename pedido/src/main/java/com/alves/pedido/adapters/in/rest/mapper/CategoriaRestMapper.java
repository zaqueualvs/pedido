package com.alves.pedido.adapters.in.rest.mapper;

import com.alves.pedido.adapters.in.rest.data.request.CategoriaRequest;
import com.alves.pedido.adapters.in.rest.data.response.CategoriaResponse;
import com.alves.pedido.domain.models.Categoria;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriaRestMapper extends AbstractRestAdapterMapper<Categoria, CategoriaRequest, CategoriaResponse>{
}
