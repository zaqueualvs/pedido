package com.alves.pedido.adapters.out.database.h2.adapters.categoria;

import com.alves.pedido.adapters.out.database.h2.entities.CategoriaEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.CategoriaPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.CategoriaRepository;
import com.alves.pedido.application.ports.out.categoria.FindCategoriaByIdPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Categoria;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@PersistenceAdapter
@RequiredArgsConstructor
public class FindCategoriaByIdPersistenceAdapter implements FindCategoriaByIdPort {

    private final CategoriaRepository categoriaRepository;
    private final CategoriaPersistenceMapper categoriaPersistenceMapper;

    @Override
    public Optional<Categoria> findById(Long id) {
        Optional<CategoriaEntity> categoriaEntityO = categoriaRepository.findById(id);
        if (categoriaEntityO.isEmpty()) {
            return Optional.empty();
        }
        Categoria categoria = categoriaPersistenceMapper.toDomain(categoriaEntityO.get());
        return Optional.of(categoria);
    }
}
