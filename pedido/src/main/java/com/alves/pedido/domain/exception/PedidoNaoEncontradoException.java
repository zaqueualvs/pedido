package com.alves.pedido.domain.exception;

public class PedidoNaoEncontradoException extends EntidadeNaoEncontradaException {
    public PedidoNaoEncontradoException(String message) {
        super(message);
    }

    public PedidoNaoEncontradoException(Long id) {
        super(String.format("Não existe um cadastro de pedido com código %d", id));
    }
}
