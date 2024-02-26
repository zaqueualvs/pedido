package com.alves.pedido.adapters.out.database.h2.adapters.pedido;

import com.alves.pedido.adapters.out.database.h2.mapper.PedidoPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.PedidoRepository;
import com.alves.pedido.application.ports.out.pedido.FindAllPedidoPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Pedido;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@PersistenceAdapter
@RequiredArgsConstructor
public class FindAllPedidoPersistenceAdapter implements FindAllPedidoPort {

    private final PedidoRepository pedidoRepository;
    private final PedidoPersistenceMapper pedidoPersistenceMapper;

    @Override
    public List<Pedido> findAll() {
        return pedidoRepository.findAll()
                .stream()
                .map(pedidoPersistenceMapper::toDomain)
                .collect(Collectors.toList());
    }
}
