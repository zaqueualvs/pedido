package com.alves.pedido.adapters.in.rest.mapper;

import java.io.Serializable;

public interface AbstractRestAdapterMapper
        <Domain extends Serializable,
                Request extends Serializable,
                Response extends Serializable> {

    Domain toDomain(final Request request);

    Response toResponse(final Domain domain);
}
