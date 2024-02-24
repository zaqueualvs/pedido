package com.alves.pedido.application.ports.in.cidade;

import com.alves.pedido.domain.models.Cidade;

public interface SaveCidadeUseCase {
    Cidade save(Cidade cidade);
}
