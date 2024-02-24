package com.alves.pedido.domain.services.cliente;

import com.alves.pedido.application.ports.in.cliente.DeleteClienteUseCase;
import com.alves.pedido.application.ports.in.cliente.FindClienteByIdUseCase;
import com.alves.pedido.application.ports.out.cliente.DeleteClientePort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Cliente;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class DeleteClienteService implements DeleteClienteUseCase {

    private final DeleteClientePort deleteClientePort;
    private final FindClienteByIdUseCase findClienteByIdUseCase;

    @Override
    public void delete(Long id) {
        Cliente cliente = findClienteByIdUseCase.findById(id);
        deleteClientePort.delete(cliente);
    }
}
