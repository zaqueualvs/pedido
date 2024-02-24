package com.alves.pedido.domain.services.pedido;

import com.alves.pedido.application.ports.in.pedido.DeletePedidoUseCase;
import com.alves.pedido.application.ports.in.pedido.FindPedidoByIdUseCase;
import com.alves.pedido.application.ports.out.pedido.DeletePedidoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Pedido;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class DeletePedidoService implements DeletePedidoUseCase {

    private final DeletePedidoPort deletePedidoPort;
    private final FindPedidoByIdUseCase findPedidoByIdUseCase;

    @Override
    public void delete(Long id) {
        Pedido pedido = findPedidoByIdUseCase.findById(id);
        deletePedidoPort.delete(pedido);
    }
}
