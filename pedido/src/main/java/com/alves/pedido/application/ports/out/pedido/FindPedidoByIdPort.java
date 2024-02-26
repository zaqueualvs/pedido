package com.alves.pedido.application.ports.out.pedido;

import com.alves.pedido.domain.models.Pedido;

import java.util.Optional;

public interface FindPedidoByIdPort {
    Optional<Pedido> findById(Long id);
}
