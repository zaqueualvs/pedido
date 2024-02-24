package com.alves.pedido.adapters.out.database.h2.adapters.estado;

import com.alves.pedido.adapters.out.database.h2.entities.EstadoEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.EstadoPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.EstadoRepository;
import com.alves.pedido.application.ports.out.estado.FindEstadoByIdPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Estado;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@PersistenceAdapter
@RequiredArgsConstructor
public class FindEstadoByIdPersistenceAdapter implements FindEstadoByIdPort {

    private final EstadoRepository estadoRepository;
    private final EstadoPersistenceMapper estadoPersistenceMapper;

    @Override
    public Optional<Estado> findById(Long id) {
        Optional<EstadoEntity> estadoEntityO = estadoRepository.findById(id);
        if (estadoEntityO.isEmpty()) {
            return Optional.empty();
        }
        Estado estado = estadoPersistenceMapper.toDomain(estadoEntityO.get());
        return Optional.of(estado);
    }
}
