package com.alves.pedido.application.ports.out.pedido;

import com.alves.pedido.domain.models.Pedido;

public interface SavePedidoPort{
    Pedido save(Pedido pedido);
}
