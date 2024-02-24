package com.alves.pedido.adapters.out.database.h2.mapper;

import java.io.Serializable;

public interface AbstractPersistenceAdapter<D extends Serializable, E extends Serializable> {
    D toDomain(final E entity);

    E toEntity(final D domain);
}
