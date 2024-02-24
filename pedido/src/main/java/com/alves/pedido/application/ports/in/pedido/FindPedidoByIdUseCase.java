package com.alves.pedido.application.ports.in.pedido;

import com.alves.pedido.domain.models.Pedido;

public interface FindPedidoByIdUseCase {
    Pedido findById(Integer id);
}
