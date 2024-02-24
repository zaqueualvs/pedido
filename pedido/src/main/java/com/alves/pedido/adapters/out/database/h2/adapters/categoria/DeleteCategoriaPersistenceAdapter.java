package com.alves.pedido.adapters.out.database.h2.adapters.categoria;

import com.alves.pedido.adapters.out.database.h2.mapper.CategoriaPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.CategoriaRepository;
import com.alves.pedido.application.ports.out.categoria.DeleteCategoriaPort;
import com.alves.pedido.commons.customannotation.PersitenceAdapter;
import com.alves.pedido.domain.models.Categoria;
import lombok.RequiredArgsConstructor;

@PersitenceAdapter
@RequiredArgsConstructor
public class DeleteCategoriaPersistenceAdapter implements DeleteCategoriaPort {

    private final CategoriaRepository categoriaRepository;
    private final CategoriaPersistenceMapper categoriaPersistenceMapper;

    @Override
    public void delete(Categoria categoria) {
        categoriaRepository.delete(categoriaPersistenceMapper.toEntity(categoria));
    }

}
