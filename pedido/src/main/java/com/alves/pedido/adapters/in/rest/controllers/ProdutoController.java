package com.alves.pedido.adapters.in.rest.controllers;

import com.alves.pedido.adapters.in.rest.data.request.ProdutoRequest;
import com.alves.pedido.adapters.in.rest.data.response.ProdutoResponse;
import com.alves.pedido.adapters.in.rest.mapper.ProdutoRestMapper;
import com.alves.pedido.application.ports.in.produto.FindAllProdutoUseCase;
import com.alves.pedido.application.ports.in.produto.SaveProdutoUseCase;
import com.alves.pedido.domain.models.Produto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "produtos")
public class ProdutoController {

    private final FindAllProdutoUseCase findAllProdutoUseCase;
    private final SaveProdutoUseCase saveProdutoUseCase;
    private final ProdutoRestMapper produtoRestMapper;

    @GetMapping
    public ResponseEntity<List<ProdutoResponse>> findAll() {
        List<ProdutoResponse> produtoResponseList = findAllProdutoUseCase.findAll()
                .stream()
                .map(produtoRestMapper::toResponse)
                .toList();
        return ResponseEntity.status(HttpStatus.OK).body(produtoResponseList);
    }

    @PostMapping
    public ResponseEntity<ProdutoResponse> save(@RequestBody @Valid ProdutoRequest produtoRequest) {
        Produto produto = produtoRestMapper.toDomain(produtoRequest);
        produto = saveProdutoUseCase.save(produto);
        ProdutoResponse produtoResponse = produtoRestMapper.toResponse(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoResponse);
    }
}
