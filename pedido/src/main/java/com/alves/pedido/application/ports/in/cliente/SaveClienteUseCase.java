package com.alves.pedido.application.ports.in.cliente;

import com.alves.pedido.domain.models.Cliente;

public interface SaveClienteUseCase {
    Cliente save(Cliente cliente);
}
