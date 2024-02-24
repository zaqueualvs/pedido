package com.alves.pedido.domain.exception;

public abstract class EntidadeNãoEncontradaException extends DomainException{


    public EntidadeNãoEncontradaException(String message) {
        super(message);
    }
}
