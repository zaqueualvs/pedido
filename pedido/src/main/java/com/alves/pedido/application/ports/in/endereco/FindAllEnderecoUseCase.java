package com.alves.pedido.application.ports.in.endereco;

import com.alves.pedido.domain.models.Endereco;

import java.util.List;

public interface FindAllEnderecoUseCase {
    List<Endereco> findAll();
}
