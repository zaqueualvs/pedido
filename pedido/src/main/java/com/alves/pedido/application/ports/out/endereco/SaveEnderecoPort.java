package com.alves.pedido.application.ports.out.endereco;

import com.alves.pedido.domain.models.Endereco;

public interface SaveEnderecoPort {
    Endereco save(Endereco endereco);
}
