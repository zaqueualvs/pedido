package com.alves.pedido.domain.services.estado;

import com.alves.pedido.application.ports.in.estado.DeleteEstadoUseCase;
import com.alves.pedido.application.ports.out.estado.DeleteEstadoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Estado;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class DeleteEstadoService implements DeleteEstadoUseCase {

    private final DeleteEstadoPort deleteEstadoPort;

    @Override
    public void delete(Estado estado) {
        deleteEstadoPort.delete(estado);
    }

}
