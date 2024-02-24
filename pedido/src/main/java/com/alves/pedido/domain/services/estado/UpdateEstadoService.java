package com.alves.pedido.domain.services.estado;

import com.alves.pedido.application.ports.in.estado.UpdateEstadoUseCase;
import com.alves.pedido.application.ports.out.estado.UpdateEstadoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Estado;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class UpdateEstadoService implements UpdateEstadoUseCase {

    private final UpdateEstadoPort updateEstadoPort;
    @Override
    public Estado update(Estado estado) {
        return updateEstadoPort.update(estado);
    }
}
