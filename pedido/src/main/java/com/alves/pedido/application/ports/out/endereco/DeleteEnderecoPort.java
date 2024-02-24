package com.alves.pedido.application.ports.out.endereco;

import com.alves.pedido.domain.models.Endereco;

public interface DeleteEnderecoPort {
    void delete(Endereco endereco);

}
