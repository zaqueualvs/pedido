package com.alves.pedido.adapters.out.database.h2.adapters.estado;

import com.alves.pedido.adapters.out.database.h2.entities.EstadoEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.EstadoPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.EstadoRepository;
import com.alves.pedido.application.ports.out.estado.DeleteEstadoPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Estado;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class DeleteEstadoPersistenceAdapter implements DeleteEstadoPort {

    private final EstadoRepository estadoRepository;
    private final EstadoPersistenceMapper estadoPersistenceMapper;

    @Override
    public void delete(Estado estado) {
        EstadoEntity estadoEntity = estadoPersistenceMapper.toEntity(estado);
        estadoRepository.delete(estadoEntity);
    }

}
