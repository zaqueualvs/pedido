package com.alves.pedido.domain.services.cliente;

import com.alves.pedido.application.ports.in.cliente.FindClienteByIdUseCase;
import com.alves.pedido.application.ports.out.cliente.FindClienteByIdPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.exception.ClienteNaoEncontradoException;
import com.alves.pedido.domain.models.Cliente;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class FindClienteByIdService implements FindClienteByIdUseCase {
    private final FindClienteByIdPort findClienteByIdPort;

    @Override
    public Cliente findById(Long id) {
        return findClienteByIdPort.findById(id).orElseThrow(
                () -> new ClienteNaoEncontradoException(id)
        );
    }
}
