package com.alves.pedido.application.ports.in.estado;

import com.alves.pedido.domain.models.Categoria;
import com.alves.pedido.domain.models.Estado;

public interface DeleteEstadoUseCase {
    void delete(Estado estado);

}