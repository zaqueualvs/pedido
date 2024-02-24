package com.alves.pedido.application.ports.out.cliente;

import com.alves.pedido.domain.models.Cliente;

public interface FindClienteByIdPort {
    Cliente findById(Long id);
}
