package com.alves.pedido.application.ports.in.cidade;

import com.alves.pedido.domain.models.Cidade;

import java.util.List;

public interface FindAllCidadeUseCase {
    List<Cidade> findAll();
}
