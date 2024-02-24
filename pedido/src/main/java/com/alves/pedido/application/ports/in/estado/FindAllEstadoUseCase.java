package com.alves.pedido.application.ports.in.estado;

import com.alves.pedido.domain.models.Categoria;
import com.alves.pedido.domain.models.Estado;

import java.util.List;

public interface FindAllEstadoUseCase {
    List<Estado> findAll();
}
