package com.alves.pedido.adapters.out.database.h2.adapters.categoria;

import com.alves.pedido.adapters.out.database.h2.entities.CategoriaEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.CategoriaPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.CategoriaRepository;
import com.alves.pedido.application.ports.out.categoria.FindCategoriaByIdPort;
import com.alves.pedido.commons.customannotation.PersitenceAdapter;
import com.alves.pedido.domain.models.Categoria;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@PersitenceAdapter
@RequiredArgsConstructor
public class FindCategoriaByIdPersistenceAdapter implements FindCategoriaByIdPort {

    private final CategoriaRepository categoriaRepository;
    private final CategoriaPersistenceMapper categoriaPersistenceMapper;

    @Override
    public Optional<Categoria> findById(Integer id) {
        Optional<CategoriaEntity> categoriaEntity = categoriaRepository.findById(id);
        if (categoriaEntity.isEmpty()) {
            return Optional.empty();
        }
        Categoria categoria = categoriaPersistenceMapper.toDomain(categoriaEntity.get());
        return Optional.of(categoria);
    }
}
