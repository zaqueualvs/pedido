package com.alves.pedido.application.ports.in.pedido;

import com.alves.pedido.domain.models.Pedido;
import com.alves.pedido.domain.models.Produto;

public interface UpdatePedidoUseCase {
    Pedido update(Pedido pedido);
}
