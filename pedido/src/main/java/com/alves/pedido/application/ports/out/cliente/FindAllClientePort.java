package com.alves.pedido.application.ports.out.cliente;

import com.alves.pedido.domain.models.Cliente;

import java.util.List;

public interface FindAllClientePort {
    List<Cliente> findAll();
}
