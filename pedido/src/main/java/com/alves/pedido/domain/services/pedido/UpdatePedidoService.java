package com.alves.pedido.domain.services.pedido;

import com.alves.pedido.application.ports.in.pedido.UpdatePedidoUseCase;
import com.alves.pedido.application.ports.out.pedido.UpdatePedidoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Pedido;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class UpdatePedidoService implements UpdatePedidoUseCase {
    private final UpdatePedidoPort updatePedidoPort;

    @Override
    public Pedido update(Pedido pedido) {
        return updatePedidoPort.update(pedido);
    }
}
