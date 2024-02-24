package com.alves.pedido.domain.exception;

public class ProdutoNaoEncontradoException extends EntidadeNãoEncontradaException {
    public ProdutoNaoEncontradoException(String message) {
        super(message);
    }

    public ProdutoNaoEncontradoException(Long id) {
        super(String.format("Não existe um cadastro de produto com código %d", id));
    }
}
