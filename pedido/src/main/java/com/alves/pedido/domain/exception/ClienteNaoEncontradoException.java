package com.alves.pedido.domain.exception;

public class ClienteNaoEncontradoException extends EntidadeNaoEncontradaException {
    public ClienteNaoEncontradoException(String message) {
        super(message);
    }

    public ClienteNaoEncontradoException(Long id) {
        super(String.format("Não existe um cadastro de cliente com código %d", id));
    }
}
