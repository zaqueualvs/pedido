package com.alves.pedido.adapters.out.database.h2.adapters.estado;

import com.alves.pedido.adapters.out.database.h2.entities.EstadoEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.EstadoPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.EstadoRepository;
import com.alves.pedido.application.ports.out.estado.SaveEstadoPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Estado;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class SaveEstadoPersistenceAdapter implements SaveEstadoPort {

    private final EstadoRepository estadoRepository;
    private final EstadoPersistenceMapper estadoPersistenceMapper;

    @Override
    public Estado save(Estado estado) {
        EstadoEntity estadoEntity = estadoPersistenceMapper.toEntity(estado);
        estadoEntity = estadoRepository.save(estadoEntity);
        estado = estadoPersistenceMapper.toDomain(estadoEntity);
        return estado;
    }
}
