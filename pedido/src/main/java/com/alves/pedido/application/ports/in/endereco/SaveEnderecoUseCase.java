package com.alves.pedido.application.ports.in.endereco;

import com.alves.pedido.domain.models.Endereco;

public interface SaveEnderecoUseCase {
    Endereco save(Endereco endereco);
}
