package com.alves.pedido.application.ports.out.estado;

import com.alves.pedido.domain.models.Estado;

import java.util.List;

public interface FindAllEstadoPort {
    List<Estado> findAll();
}
