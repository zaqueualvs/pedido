package com.alves.pedido.domain.exception;

public class CategoriaNaoEncontradaException extends EntidadeNaoEncontradaException {
    public CategoriaNaoEncontradaException(String message) {
        super(message);
    }

    public CategoriaNaoEncontradaException(Long id) {
        super(String.format("Não existe um cadastro de categoria com código %d", id));
    }
}
