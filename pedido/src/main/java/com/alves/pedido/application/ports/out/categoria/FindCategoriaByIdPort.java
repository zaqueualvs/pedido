package com.alves.pedido.application.ports.out.categoria;

import com.alves.pedido.domain.models.Categoria;

import java.util.Optional;

public interface FindCategoriaByIdPort {
    Optional<Categoria> findById(Integer id);
}
