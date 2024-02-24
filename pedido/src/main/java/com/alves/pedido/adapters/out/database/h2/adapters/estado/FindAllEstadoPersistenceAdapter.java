package com.alves.pedido.adapters.out.database.h2.adapters.estado;

import com.alves.pedido.adapters.out.database.h2.mapper.EstadoPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.EstadoRepository;
import com.alves.pedido.application.ports.out.estado.FindAllEstadoPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Estado;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@PersistenceAdapter
@RequiredArgsConstructor
public class FindAllEstadoPersistenceAdapter implements FindAllEstadoPort {

    private final EstadoRepository estadoRepository;
    private final EstadoPersistenceMapper estadoPersistenceMapper;

    @Override
    public List<Estado> findAll() {
        return estadoRepository.findAll()
                .stream()
                .map(estadoPersistenceMapper::toDomain)
                .collect(Collectors.toList());
    }
}
