package com.alves.pedido.adapters.in.rest.controllers;

import com.alves.pedido.adapters.in.rest.data.response.CidadeResponse;
import com.alves.pedido.adapters.in.rest.mapper.CidadeRestMapper;
import com.alves.pedido.application.ports.in.cidade.FindAllCidadeUseCase;
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
@RequestMapping(value = "cidades")
public class CidadeController {

    private final FindAllCidadeUseCase findAllCidadeUseCase;
    private final CidadeRestMapper cidadeRestMapper;

    @GetMapping
    public ResponseEntity<List<CidadeResponse>> findAll() {
        List<CidadeResponse> cidadeResponses = findAllCidadeUseCase.findAll()
                .stream()
                .map(cidadeRestMapper::toResponse)
                .collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.OK).body(cidadeResponses);
    }
}
