package com.alves.pedido.application.ports.out.categoria;

import com.alves.pedido.domain.models.Categoria;

public interface DeleteCategoriaPort {
    void delete(Categoria categoria);

}
