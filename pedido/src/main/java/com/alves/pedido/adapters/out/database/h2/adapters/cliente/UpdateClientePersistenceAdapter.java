package com.alves.pedido.adapters.out.database.h2.adapters.cliente;

import com.alves.pedido.application.ports.out.cliente.SaveClientePort;
import com.alves.pedido.application.ports.out.cliente.UpdateClientePort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Cliente;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class UpdateClientePersistenceAdapter implements UpdateClientePort {

    private final SaveClientePort saveClientePort;

    @Override
    public Cliente update(Cliente cliente) {
        return saveClientePort.save(cliente);
    }
}
