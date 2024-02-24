package com.alves.pedido.application.ports.out.categoria;

import com.alves.pedido.domain.models.Categoria;

public interface UpdateCategoriaPort {
    Categoria update(Categoria categoria);
}
