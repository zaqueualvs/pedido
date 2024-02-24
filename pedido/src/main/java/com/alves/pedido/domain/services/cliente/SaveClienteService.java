package com.alves.pedido.domain.services.cliente;

import com.alves.pedido.application.ports.in.cliente.SaveClienteUseCase;
import com.alves.pedido.application.ports.out.cliente.SaveClientePort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Cliente;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class SaveClienteService implements SaveClienteUseCase {
    private final SaveClientePort saveClientePort;
    @Override
    public Cliente save(Cliente cliente) {
        return saveClientePort.save(cliente);
    }
}
