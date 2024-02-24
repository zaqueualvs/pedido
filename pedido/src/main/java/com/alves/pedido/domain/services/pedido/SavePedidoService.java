package com.alves.pedido.domain.services.pedido;

import com.alves.pedido.application.ports.in.pedido.SavePedidoUseCase;
import com.alves.pedido.application.ports.out.pedido.SavePedidoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Pedido;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class SavePedidoService implements SavePedidoUseCase {
    private final SavePedidoPort savePedidoPort;

    @Override
    public Pedido save(Pedido pedido) {
        return savePedidoPort.save(pedido);
    }
}
