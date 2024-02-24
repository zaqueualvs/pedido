package com.alves.pedido.domain.services.categoria;

import com.alves.pedido.application.ports.in.categoria.UpdateCategoriaUseCase;
import com.alves.pedido.application.ports.out.categoria.UpdateCategoriaPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Categoria;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class UpdateCategoriaService implements UpdateCategoriaUseCase {

    private final UpdateCategoriaPort updateCategoriaPort;

    @Override
    public Categoria update(Categoria categoria) {
        return updateCategoriaPort.update(categoria);
    }
}
