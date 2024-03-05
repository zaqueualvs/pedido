package com.alves.pedido.adapters.in.rest.controllers;

import com.alves.pedido.adapters.in.rest.data.response.PedidoResponse;
import com.alves.pedido.adapters.in.rest.mapper.PedidoRestMapper;
import com.alves.pedido.application.ports.in.pedido.FindAllPedidoUseCase;
import com.alves.pedido.domain.models.Pedido;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "pedidos")
public class PedidoController {

    private final FindAllPedidoUseCase findAllPedidoUseCase;
    private final PedidoRestMapper pedidoRestMapper;

    @GetMapping
    public ResponseEntity<List<PedidoResponse>> findAll() {
        List<Pedido> pedidos = findAllPedidoUseCase.findAll();
        pedidos.forEach(Pedido::calculaPrecoTotal);
        List<PedidoResponse> pedidoResponses = pedidos.stream()
                .map(pedidoRestMapper::toResponse)
                .toList();
        return ResponseEntity.status(HttpStatus.OK).body(pedidoResponses);
    }

}
