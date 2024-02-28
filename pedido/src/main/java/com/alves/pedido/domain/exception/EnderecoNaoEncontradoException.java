package com.alves.pedido.domain.exception;

public class EnderecoNaoEncontradoException extends EntidadeNaoEncontradaException {
    public EnderecoNaoEncontradoException(String message) {
        super(message);
    }

    public EnderecoNaoEncontradoException(Long id) {
        super(String.format("Não existe um cadastro de endereço com código %d", id));
    }
}
