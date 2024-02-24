package com.alves.pedido.application.ports.out.cidade;

import com.alves.pedido.domain.models.Cidade;

public interface DeleteCidadePort {
    void delete(Cidade cidade);

}
