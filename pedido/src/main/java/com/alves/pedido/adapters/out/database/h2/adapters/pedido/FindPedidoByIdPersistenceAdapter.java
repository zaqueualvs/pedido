package com.alves.pedido.adapters.out.database.h2.adapters.pedido;

import com.alves.pedido.adapters.out.database.h2.entities.PedidoEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.PedidoPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.PedidoRepository;
import com.alves.pedido.application.ports.out.pedido.FindPedidoByIdPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Pedido;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@PersistenceAdapter
@RequiredArgsConstructor
public class FindPedidoByIdPersistenceAdapter implements FindPedidoByIdPort {

    private final PedidoRepository pedidoRepository;
    private final PedidoPersistenceMapper pedidoPersistenceMapper;

    @Override
    public Optional<Pedido> findById(Long id) {
        Optional<PedidoEntity> pedidoEntityO = pedidoRepository.findById(id);
        if (pedidoEntityO.isEmpty()) {
            return Optional.empty();
        }
        Pedido pedido = pedidoPersistenceMapper.toDomain(pedidoEntityO.get());
        return Optional.of(pedido);
    }
}
