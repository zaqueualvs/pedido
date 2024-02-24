package com.alves.pedido.adapters.out.database.h2.mapper;

import com.alves.pedido.adapters.out.database.h2.entities.CategoriaEntity;
import com.alves.pedido.domain.models.Categoria;
import org.mapstruct.Context;

import java.io.Serializable;

public interface AbstractPersistenceMapper<D extends Serializable, E extends Serializable> {
    D toDomain(final E entity);

    E toEntity(final D domain);
}
