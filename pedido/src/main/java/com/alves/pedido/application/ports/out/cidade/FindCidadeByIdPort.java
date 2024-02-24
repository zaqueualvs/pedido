package com.alves.pedido.application.ports.out.cidade;

import com.alves.pedido.domain.models.Cidade;

import java.util.Optional;

public interface FindCidadeByIdPort {
    Optional<Cidade> findById(Long id);
}
