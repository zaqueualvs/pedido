package com.alves.pedido.application.ports.out.endereco;

import com.alves.pedido.domain.models.Endereco;

import java.util.List;

public interface FindAllEnderecoPort {
    List<Endereco> findAll();
}
