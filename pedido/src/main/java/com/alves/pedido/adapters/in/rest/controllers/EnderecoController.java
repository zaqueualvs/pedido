package com.alves.pedido.adapters.in.rest.controllers;

import com.alves.pedido.adapters.in.rest.data.response.EnderecoResponse;
import com.alves.pedido.adapters.in.rest.mapper.EnderecoRestMapper;
import com.alves.pedido.application.ports.in.endereco.FindAllEnderecoUseCase;
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
@RequestMapping(value = "enderecos")
public class EnderecoController {
    private final FindAllEnderecoUseCase findAllEnderecoUseCase;
    private final EnderecoRestMapper enderecoRestMapper;

    @GetMapping
    public ResponseEntity<List<EnderecoResponse>> findAll() {
        List<EnderecoResponse> enderecoResponses = findAllEnderecoUseCase.findAll()
                .stream()
                .map(enderecoRestMapper::toResponse)
                .toList();

        return ResponseEntity.status(HttpStatus.OK).body(enderecoResponses);
    }
}
