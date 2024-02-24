package com.alves.pedido.adapters.out.database.h2.adapters.categoria;

import com.alves.pedido.application.ports.out.categoria.SaveCategoriaPort;
import com.alves.pedido.application.ports.out.categoria.UpdateCategoriaPort;
import com.alves.pedido.commons.customannotation.PersitenceAdapter;
import com.alves.pedido.domain.models.Categoria;
import lombok.RequiredArgsConstructor;

@PersitenceAdapter
@RequiredArgsConstructor
public class UpdateCategoriaPersistenceAdapter implements UpdateCategoriaPort {

    private final SaveCategoriaPort saveCategoriaPort;
    @Override
    public Categoria update(Categoria categoria) {
        return saveCategoriaPort.save(categoria);
    }
}
