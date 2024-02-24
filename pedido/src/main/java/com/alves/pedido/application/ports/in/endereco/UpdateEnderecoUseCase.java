package com.alves.pedido.application.ports.in.endereco;

import com.alves.pedido.domain.models.Endereco;

public interface UpdateEnderecoUseCase {
    Endereco update(Endereco endereco);
}
