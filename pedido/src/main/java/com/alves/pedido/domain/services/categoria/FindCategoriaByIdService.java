package com.alves.pedido.domain.services.categoria;

import com.alves.pedido.application.ports.in.categoria.FindCategoriaByIdUseCase;
import com.alves.pedido.application.ports.out.categoria.FindCategoriaByIdPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Categoria;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class FindCategoriaByIdService implements FindCategoriaByIdUseCase {

    private final FindCategoriaByIdPort findCategoriaByIdPort;

    @Override
    public Categoria findById(Integer id) {
        return findCategoriaByIdPort.findById(id).orElseThrow(() -> new RuntimeException("aa"));
    }
}
