package com.alves.pedido.application.ports.out.endereco;

import com.alves.pedido.domain.models.Endereco;

public interface UpdateEnderecoPort {
    Endereco update(Endereco endereco);
}
