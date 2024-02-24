package com.alves.pedido.domain.services.estado;

import com.alves.pedido.application.ports.in.estado.SaveEstadoUseCase;
import com.alves.pedido.application.ports.out.estado.SaveEstadoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Estado;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class SaveEstadoService implements SaveEstadoUseCase {
    private final SaveEstadoPort saveEstadoPort;

    @Override
    public Estado save(Estado estado) {
        return saveEstadoPort.save(estado);
    }
}
