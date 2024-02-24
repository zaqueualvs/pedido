package com.alves.pedido.domain.services.estado;

import com.alves.pedido.application.ports.in.estado.DeleteEstadoUseCase;
import com.alves.pedido.application.ports.in.estado.FindEstadoByIdUseCase;
import com.alves.pedido.application.ports.out.estado.DeleteEstadoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Estado;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class DeleteEstadoService implements DeleteEstadoUseCase {

    private final DeleteEstadoPort deleteEstadoPort;
    private final FindEstadoByIdUseCase findEstadoByIdUseCase;

    @Override
    public void delete(Long id) {
        Estado estado = findEstadoByIdUseCase.findById(id);
        deleteEstadoPort.delete(estado);
    }

}
