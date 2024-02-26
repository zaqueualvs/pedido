package com.alves.pedido.adapters.in.rest.controllers;

import com.alves.pedido.adapters.in.rest.data.request.CategoriaRequest;
import com.alves.pedido.adapters.in.rest.data.response.CategoriaResponse;
import com.alves.pedido.adapters.in.rest.mapper.CategoriaRestMapper;
import com.alves.pedido.application.ports.in.categoria.FindAllCategoriaUseCase;
import com.alves.pedido.application.ports.in.categoria.SaveCategoriaUseCase;
import com.alves.pedido.domain.models.Categoria;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "categorias")
public class CategoriaController {

    private final FindAllCategoriaUseCase findAllCategoriaUseCase;
    private final SaveCategoriaUseCase saveCategoriaUseCase;
    private final CategoriaRestMapper categoriaRestMapper;

    @GetMapping
    public ResponseEntity<List<CategoriaResponse>> findAll() {
        List<CategoriaResponse> categoriaResponseList = findAllCategoriaUseCase.findAll()
                .stream()
                .map(categoriaRestMapper::toResponse)
                .toList();
        return ResponseEntity.status(HttpStatus.OK).body(categoriaResponseList);
    }

    @PostMapping
    public ResponseEntity<CategoriaResponse> save(@RequestBody @Valid CategoriaRequest categoriaRequest) {
        Categoria categoria = categoriaRestMapper.toDomain(categoriaRequest);
        categoria = saveCategoriaUseCase.save(categoria);
        CategoriaResponse categoriaResponse = categoriaRestMapper.toResponse(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaResponse);
    }
}
