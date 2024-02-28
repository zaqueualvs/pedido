package com.alves.pedido.commons.exceptionhandle;

import lombok.Getter;

@Getter
public enum ProblemType {
    RECURSO_NAO_ENCONTRADO("/recurso-nao-encontrado", "Recurso não encontrado"),
    DADOS_INVALIDOS("/dados-invalido", "Dados invalidos"),
    MENSAGEM_INCOMPREENSIVEL("/mensagem-incompreensivlel", "Mensagem incompreensivel"),
    PARAMETRO_INVALIDO("/paramentro-invalido", "Paramentro invalido"),
    ERRO_DE_SISTEMA("/erro-de-sistem", "Erro de sistema");

    private String title;
    private String uri;

    ProblemType(String path, String title) {
        this.title = title;
        this.uri = "https://pedidio.com.br" + path;
    }
}
