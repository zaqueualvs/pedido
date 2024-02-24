package com.alves.pedido.domain.services.categoria;

import com.alves.pedido.application.ports.in.categoria.DeleteCategoriaUseCase;
import com.alves.pedido.application.ports.in.categoria.FindCategoriaByIdUseCase;
import com.alves.pedido.application.ports.out.categoria.DeleteCategoriaPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Categoria;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class DeleteCategoriaService implements DeleteCategoriaUseCase {

    private final DeleteCategoriaPort deleteCategoriaPort;
    private final FindCategoriaByIdUseCase findCategoriaByIdUseCase;

    @Override
    public void delete(Long id) {
        Categoria categoria = findCategoriaByIdUseCase.findById(id);
        deleteCategoriaPort.delete(categoria);
    }

}
