package com.alves.pedido.domain.services.cliente;

import com.alves.pedido.application.ports.in.cliente.UpdateClienteUseCase;
import com.alves.pedido.application.ports.out.cliente.UpdateClientePort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Cliente;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class UpdateClienteService implements UpdateClienteUseCase {

    private final UpdateClientePort updateClientePort;
    @Override
    public Cliente update(Cliente cliente) {
        return updateClientePort.update(cliente);
    }
}
