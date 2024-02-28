package com.alves.pedido.domain.exception;

public abstract class EntidadeNaoEncontradaException extends DomainException{


    public EntidadeNaoEncontradaException(String message) {
        super(message);
    }
}
