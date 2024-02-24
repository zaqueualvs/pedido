package com.alves.pedido.application.ports.out.categoria;

import com.alves.pedido.domain.models.Categoria;

import java.util.List;

public interface FindAllCategoriaPort {
    List<Categoria> findAll();
}
