package com.alves.pedido.adapters.in.rest.controllers;

import com.alves.pedido.application.ports.in.produto.AssociarProdutoCategoriaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "produtos/{produtoId}/categoria")
public class ProdutoCategoriaController {

    private final AssociarProdutoCategoriaUseCase associarProdutoCategoriaUseCase;

    @PutMapping("/{categoriaId}")
    public ResponseEntity associar(@PathVariable Long produtoId,
                                   @PathVariable Long categoriaId) {
        associarProdutoCategoriaUseCase.associar(produtoId, categoriaId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
