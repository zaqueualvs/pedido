package com.alves.pedido.application.ports.out.cliente;

import com.alves.pedido.domain.models.Cliente;

public interface SaveClientePort {
    Cliente save(Cliente cliente);
}
