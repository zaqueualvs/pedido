package com.alves.pedido.adapters.out.database.h2.adapters.estado;

import com.alves.pedido.application.ports.out.estado.SaveEstadoPort;
import com.alves.pedido.application.ports.out.estado.UpdateEstadoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Estado;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class UpdateEstadoPersistenceAdapter implements UpdateEstadoPort {

    private final SaveEstadoPort saveEstadoPort;

    @Override
    public Estado update(Estado estado) {
        return saveEstadoPort.save(estado);
    }
}
