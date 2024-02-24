package com.alves.pedido.application.ports.in.cliente;

import com.alves.pedido.domain.models.Cliente;

public interface DeleteClienteUseCase {
    void delete(Long id);

}
