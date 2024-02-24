package com.alves.pedido.adapters.out.database.h2.adapters.categoria;

import com.alves.pedido.adapters.out.database.h2.entities.CategoriaEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.CategoriaPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.CategoriaRepository;
import com.alves.pedido.application.ports.out.categoria.SaveCategoriaPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Categoria;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class SaveCategoriaPersistenceAdapter implements SaveCategoriaPort {

    private final CategoriaRepository categoriaRepository;
    private final CategoriaPersistenceMapper categoriaPersistenceMapper;

    @Override
    public Categoria save(Categoria categoria) {
        CategoriaEntity categoriaEntity = categoriaPersistenceMapper.toEntity(categoria);
        categoriaEntity = categoriaRepository.save(categoriaEntity);
        categoria = categoriaPersistenceMapper.toDomain(categoriaEntity);
        return categoria;
    }
}
