package com.alves.pedido.adapters.in.rest.controllers;

import com.alves.pedido.adapters.in.rest.data.response.ClienteResponse;
import com.alves.pedido.adapters.in.rest.mapper.ClienteRestMapper;
import com.alves.pedido.application.ports.in.cliente.FindAllClienteUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "clientes")
public class ClienteController {

    private final FindAllClienteUseCase findAllClienteUseCase;
    private final ClienteRestMapper clienteRestMapper;

    @GetMapping
    public ResponseEntity<List<ClienteResponse>> findAll() {
        List<ClienteResponse> clienteResponses = findAllClienteUseCase.findAll()
                .stream()
                .map(clienteRestMapper::toResponse)
                .toList();
        return ResponseEntity.status(HttpStatus.OK).body(clienteResponses);
    }
}
