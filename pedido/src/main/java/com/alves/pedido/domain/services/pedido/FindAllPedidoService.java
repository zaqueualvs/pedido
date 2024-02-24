package com.alves.pedido.domain.services.pedido;

import com.alves.pedido.application.ports.in.pedido.FindAllPedidoUseCase;
import com.alves.pedido.application.ports.out.pedido.FindAllPedidoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Pedido;
import lombok.RequiredArgsConstructor;

import java.util.List;

@UseCase
@RequiredArgsConstructor
public class FindAllPedidoService implements FindAllPedidoUseCase {
    private final FindAllPedidoPort findAllPedidoPort;

    @Override
    public List<Pedido> findAll() {
        return findAllPedidoPort.findAll();
    }
}
