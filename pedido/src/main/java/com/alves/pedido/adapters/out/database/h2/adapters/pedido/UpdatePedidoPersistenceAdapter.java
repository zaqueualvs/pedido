package com.alves.pedido.adapters.out.database.h2.adapters.pedido;

import com.alves.pedido.application.ports.in.pedido.UpdatePedidoUseCase;
import com.alves.pedido.application.ports.out.pedido.SavePedidoPort;
import com.alves.pedido.application.ports.out.pedido.UpdatePedidoPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Pedido;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class UpdatePedidoPersistenceAdapter implements UpdatePedidoPort {

    private final SavePedidoPort savePedidoPort;

    @Override
    public Pedido update(Pedido pedido) {
        return savePedidoPort.save(pedido);
    }
}
