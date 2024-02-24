package com.alves.pedido.domain.services.cliente;

import com.alves.pedido.application.ports.in.cliente.FindAllClienteUseCase;
import com.alves.pedido.application.ports.out.cliente.FindAllClientePort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Cliente;
import lombok.RequiredArgsConstructor;

import java.util.List;

@UseCase
@RequiredArgsConstructor
public class FindAllClienteService implements FindAllClienteUseCase {

    private final FindAllClientePort findAllClientePort;

    @Override
    public List<Cliente> findAll() {
        return findAllClientePort.findAll();
    }
}
