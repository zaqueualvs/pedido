package com.alves.pedido.application.ports.out.cliente;

import com.alves.pedido.domain.models.Cliente;

import java.util.Optional;

public interface FindClienteByIdPort {
    Optional<Cliente> findById(Long id);
}
