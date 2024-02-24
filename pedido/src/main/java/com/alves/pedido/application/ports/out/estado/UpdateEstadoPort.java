package com.alves.pedido.application.ports.out.estado;

import com.alves.pedido.domain.models.Estado;

public interface UpdateEstadoPort {
    Estado update(Estado estado);
}
