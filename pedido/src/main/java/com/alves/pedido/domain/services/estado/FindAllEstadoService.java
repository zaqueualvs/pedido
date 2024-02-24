package com.alves.pedido.domain.services.estado;

import com.alves.pedido.application.ports.in.estado.FindAllEstadoUseCase;
import com.alves.pedido.application.ports.out.estado.FindAllEstadoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Estado;
import lombok.RequiredArgsConstructor;

import java.util.List;

@UseCase
@RequiredArgsConstructor
public class FindAllEstadoService implements FindAllEstadoUseCase {

    private final FindAllEstadoPort findAllEstadoPort;

    @Override
    public List<Estado> findAll() {
        return findAllEstadoPort.findAll();
    }
}
