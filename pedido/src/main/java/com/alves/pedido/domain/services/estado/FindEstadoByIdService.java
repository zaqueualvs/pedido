package com.alves.pedido.domain.services.estado;

import com.alves.pedido.application.ports.in.estado.FindEstadoByIdUseCase;
import com.alves.pedido.application.ports.out.estado.FindEstadoByIdPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Estado;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class FindEstadoByIdService implements FindEstadoByIdUseCase {
    private final FindEstadoByIdPort findEstadoByIdPort;

    @Override
    public Estado findById(Integer id) {
        return findEstadoByIdPort.findById(id);
    }
}
