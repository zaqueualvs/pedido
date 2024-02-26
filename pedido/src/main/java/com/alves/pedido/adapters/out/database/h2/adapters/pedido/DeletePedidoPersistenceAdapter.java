package com.alves.pedido.adapters.out.database.h2.adapters.pedido;

import com.alves.pedido.adapters.out.database.h2.entities.PedidoEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.PedidoPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.PedidoRepository;
import com.alves.pedido.application.ports.out.pedido.DeletePedidoPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Pedido;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class DeletePedidoPersistenceAdapter implements DeletePedidoPort {

    private final PedidoRepository pedidoRepository;
    private final PedidoPersistenceMapper pedidoPersistenceMapper;

    @Override
    public void delete(Pedido pedido) {
        PedidoEntity pedidoEntity = pedidoPersistenceMapper.toEntity(pedido);
        pedidoRepository.delete(pedidoEntity);
    }
}
