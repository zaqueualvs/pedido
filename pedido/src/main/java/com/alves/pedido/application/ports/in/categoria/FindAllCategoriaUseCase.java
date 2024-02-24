package com.alves.pedido.application.ports.in.categoria;

import com.alves.pedido.domain.models.Categoria;

import java.util.List;

public interface FindAllCategoriaUseCase {
    List<Categoria> findAll();
}
