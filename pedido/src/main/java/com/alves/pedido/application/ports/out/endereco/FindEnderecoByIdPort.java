package com.alves.pedido.application.ports.out.endereco;

import com.alves.pedido.domain.models.Endereco;

import java.util.Optional;

public interface FindEnderecoByIdPort {

    Optional<Endereco> findById(Long id);
}
