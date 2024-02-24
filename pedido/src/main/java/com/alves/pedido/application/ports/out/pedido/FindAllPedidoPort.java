package com.alves.pedido.application.ports.out.pedido;

import com.alves.pedido.domain.models.Pedido;

import java.util.List;

public interface FindAllPedidoPort {
    List<Pedido> findAll();
}
