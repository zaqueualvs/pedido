package com.alves.pedido.application.ports.in.cliente;

import com.alves.pedido.domain.models.Cliente;

public interface FindClienteByIdUseCase {
    Cliente findById(Long id);
}
