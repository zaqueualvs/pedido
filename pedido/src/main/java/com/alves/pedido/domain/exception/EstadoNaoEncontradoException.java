package com.alves.pedido.domain.exception;

public class EstadoNaoEncontradoException extends EntidadeNaoEncontradaException {
    public EstadoNaoEncontradoException(String message) {
        super(message);
    }

    public EstadoNaoEncontradoException(Long id) {
        super(String.format("Não existe um cadastro de estado com código %d", id));
    }
}
