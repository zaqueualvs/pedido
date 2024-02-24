package com.alves.pedido.application.ports.out.pedido;

import com.alves.pedido.domain.models.Pedido;

public interface UpdatePedidoPort {
    Pedido update(Pedido pedido);
}
