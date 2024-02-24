package com.alves.pedido.application.ports.out.cidade;

import com.alves.pedido.domain.models.Cidade;

import java.util.List;

public interface FindAllCidadePort {
    List<Cidade> findAll();
}
