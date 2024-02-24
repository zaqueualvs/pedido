package com.alves.pedido.domain.services.categoria;

import com.alves.pedido.application.ports.in.categoria.SaveCategoriaUseCase;
import com.alves.pedido.application.ports.out.categoria.SaveCategoriaPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Categoria;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class SaveCategoriaService implements SaveCategoriaUseCase {
    private final SaveCategoriaPort saveCategoriaPort;

    @Override
    public Categoria save(Categoria categoria) {
        return saveCategoriaPort.save(categoria);
    }
}
