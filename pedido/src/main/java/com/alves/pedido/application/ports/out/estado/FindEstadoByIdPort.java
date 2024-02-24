package com.alves.pedido.application.ports.out.estado;

import com.alves.pedido.domain.models.Estado;

import java.util.Optional;

public interface FindEstadoByIdPort {
    Optional<Estado> findById(Long id);
}
