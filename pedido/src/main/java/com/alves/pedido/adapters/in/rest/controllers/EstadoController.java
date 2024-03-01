package com.alves.pedido.adapters.in.rest.controllers;

import com.alves.pedido.adapters.in.rest.data.response.EstadoResponse;
import com.alves.pedido.adapters.in.rest.mapper.EstadoRestMapper;
import com.alves.pedido.application.ports.in.estado.FindAllEstadoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "estados")
public class EstadoController {

    private final FindAllEstadoUseCase findAllEstadoUseCase;
    private final EstadoRestMapper estadoRestMapper;

    @GetMapping
    public ResponseEntity<List<EstadoResponse>> findAll() {
        List<EstadoResponse> estadoResponses = findAllEstadoUseCase.findAll()
                .stream()
                .map(estadoRestMapper::toResponse)
                .collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.OK).body(estadoResponses);
    }
}
