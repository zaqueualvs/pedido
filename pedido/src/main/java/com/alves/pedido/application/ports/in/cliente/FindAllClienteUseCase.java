package com.alves.pedido.application.ports.in.cliente;

import com.alves.pedido.domain.models.Cliente;

import java.util.List;

public interface FindAllClienteUseCase {
    List<Cliente> findAll();
}
