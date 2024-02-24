package com.alves.pedido.application.ports.in.pedido;

import com.alves.pedido.domain.models.Pedido;

import java.util.List;

public interface FindAllPedidoUseCase {
    List<Pedido> findAll();
}
