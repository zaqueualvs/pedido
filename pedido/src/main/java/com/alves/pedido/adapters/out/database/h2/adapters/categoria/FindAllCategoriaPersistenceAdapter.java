package com.alves.pedido.adapters.out.database.h2.adapters.categoria;

import com.alves.pedido.adapters.out.database.h2.mapper.CategoriaPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.CategoriaRepository;
import com.alves.pedido.application.ports.out.categoria.FindAllCategoriaPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Categoria;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@PersistenceAdapter
@RequiredArgsConstructor
public class FindAllCategoriaPersistenceAdapter implements FindAllCategoriaPort {

    private final CategoriaRepository categoriaRepository;
    private final CategoriaPersistenceMapper categoriaPersistenceMapper;

    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll()
                .stream()
                .map(categoriaPersistenceMapper::toDomain)
                .collect(Collectors.toList());
    }
}
