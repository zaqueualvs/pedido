package com.alves.pedido.application.ports.in.categoria;

import com.alves.pedido.domain.models.Categoria;

public interface FindCategoriaByIdUseCase {
    Categoria findById(Long id);
}
