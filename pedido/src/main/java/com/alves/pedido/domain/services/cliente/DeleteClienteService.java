package com.alves.pedido.domain.services.cliente;

import com.alves.pedido.application.ports.in.cliente.DeleteClienteUseCase;
import com.alves.pedido.application.ports.out.cliente.DeleteClientePort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Cliente;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class DeleteClienteService implements DeleteClienteUseCase {

    private final DeleteClientePort deleteClientePort;

    @Override
    public void delete(Cliente cliente) {
        deleteClientePort.delete(cliente);
    }
}
