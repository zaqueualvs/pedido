package com.alves.pedido.domain.services.categoria;

import com.alves.pedido.application.ports.in.categoria.FindAllCategoriaUseCase;
import com.alves.pedido.application.ports.out.categoria.FindAllCategoriaPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Categoria;
import lombok.RequiredArgsConstructor;

import java.util.List;

@UseCase
@RequiredArgsConstructor
public class FindAllCategoriaService implements FindAllCategoriaUseCase {

    private final FindAllCategoriaPort findAllCategoriaPort;

    @Override
    public List<Categoria> findAll() {
        return findAllCategoriaPort.findAll();
    }
}
