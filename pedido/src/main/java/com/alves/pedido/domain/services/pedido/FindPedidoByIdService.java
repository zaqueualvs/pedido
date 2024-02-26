package com.alves.pedido.domain.services.pedido;

import com.alves.pedido.application.ports.in.pedido.FindPedidoByIdUseCase;
import com.alves.pedido.application.ports.out.pedido.FindPedidoByIdPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.exception.PedidoNaoEncontradoException;
import com.alves.pedido.domain.models.Pedido;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class FindPedidoByIdService implements FindPedidoByIdUseCase {

    private final FindPedidoByIdPort findPedidoByIdPort;

    @Override
    public Pedido findById(Long id) {
        return findPedidoByIdPort.findById(id).orElseThrow(
                () -> new PedidoNaoEncontradoException(id)
        );
    }
}
