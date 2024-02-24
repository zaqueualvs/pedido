package com.alves.pedido.application.ports.out.categoria;

import com.alves.pedido.domain.models.Categoria;

public interface SaveCategoriaPort {
    Categoria save(Categoria categoria);
}
