package com.alves.pedido.domain.services.categoria;

import com.alves.pedido.application.ports.in.categoria.DeleteCategoriaUseCase;
import com.alves.pedido.application.ports.out.categoria.DeleteCategoriaPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Categoria;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class DeleteCategoriaService implements DeleteCategoriaUseCase {

    private final DeleteCategoriaPort deleteCategoriaPort;

    @Override
    public void delete(Categoria categoria) {
        deleteCategoriaPort.delete(categoria);
    }

}
