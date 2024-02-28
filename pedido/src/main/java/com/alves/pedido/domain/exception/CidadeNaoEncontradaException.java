package com.alves.pedido.domain.exception;

public class CidadeNaoEncontradaException extends EntidadeNaoEncontradaException {
    public CidadeNaoEncontradaException(String message) {
        super(message);
    }

    public CidadeNaoEncontradaException(Long id) {
        super(String.format("Não existe um cadastro de cidade com código %d", id));
    }
}
