CREATE TABLE categoria
(
    id   BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(40),

    PRIMARY KEY (id)
);
CREATE TABLE produto
(
    id    BIGINT NOT NULL AUTO_INCREMENT,
    nome  VARCHAR(40),
    preco NUMBER(10, 2),

    PRIMARY KEY (id)
);

CREATE TABLE produto_categoria
(
    produto_id   BIGINT,
    categoria_id BIGINT,

    CONSTRAINT fk_produto_categoria_produto
        FOREIGN KEY (produto_id)
            REFERENCES produto (id),
    CONSTRAINT fk_produto_categoria_categoria
        FOREIGN KEY (categoria_id)
            REFERENCES categoria (id)
);

CREATE TABLE estado
(
    id   BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(40),

    PRIMARY KEY (id)
);

CREATE TABLE cidade
(
    id        BIGINT NOT NULL AUTO_INCREMENT,
    nome      VARCHAR(40),
    estado_id BIGINT,

    PRIMARY KEY (id),

    CONSTRAINT fk_cidade_estado
        FOREIGN KEY (estado_id)
            REFERENCES estado (id)
);

CREATE TABLE cliente
(
    id           BIGINT NOT NULL AUTO_INCREMENT,
    nome         VARCHAR(40),
    email        VARCHAR(40),
    cnpj_ou_cpf  VARCHAR(40),
    tipo_cliente INT,

    PRIMARY KEY (id)
);

CREATE TABLE cliente_telefone
(
    cliente_id BIGINT,
    telefone   VARCHAR(16),

    CONSTRAINT fk_cliente_telefone_cliente
        FOREIGN KEY (cliente_id)
            REFERENCES cliente (id)
);

CREATE TABLE endereco
(
    id          BIGINT NOT NULL AUTO_INCREMENT,
    logradouro  VARCHAR(40),
    numero      INT,
    complemento VARCHAR(40),
    bairro      VARCHAR(40),
    cep         VARCHAR(10),
    cliente_id  BIGINT,
    cidade_id   BIGINT,

    PRIMARY KEY (id),

    CONSTRAINT fk_endereco_cidade
        FOREIGN KEY (cidade_id)
            REFERENCES cidade (id),
    CONSTRAINT fk_endereco_cliente
        FOREIGN KEY (cliente_id)
            REFERENCES cliente (id)
);

CREATE TABLE pedido
(
    id                  BIGINT NOT NULL AUTO_INCREMENT,
    data_pedido         TIMESTAMP WITH TIME ZONE,
    cliente_id          BIGINT,
    endereco_entrega_id BIGINT,

    PRIMARY KEY (id),
    CONSTRAINT fk_pedido_cliente
        FOREIGN KEY (cliente_id)
            REFERENCES cliente (id),
    CONSTRAINT fk_pedido_endereco
        FOREIGN KEY (endereco_entrega_id)
            REFERENCES endereco (id)
);
CREATE TABLE pagamento
(
    pedido_id        BIGINT,
    estado_pagamento INT,

    PRIMARY KEY (pedido_id)
);

CREATE TABLE pagamento_com_cartao
(
    pedido_id          BIGINT,
    numero_de_parcelas INT,

    PRIMARY KEY (pedido_id)
);

CREATE TABLE pagamento_com_boleto
(
    pedido_id       BIGINT,
    data_vencimento TIMESTAMP WITH TIME ZONE,
    data_pagamento  TIMESTAMP WITH TIME ZONE,

    PRIMARY KEY (pedido_id)
);

CREATE TABLE item_pedido
(
    pedido_id  BIGINT NOT NULL,
    produto_id BIGINT NOT NULL,
    desconto   DECIMAL(5, 2),
    quantidade INTEGER,
    preco      DECIMAL(10, 2),

    CONSTRAINT fk_item_pedido_pedido
        FOREIGN KEY (pedido_id)
            REFERENCES pedido (id),
    CONSTRAINT fk_item_pedido_produto
        FOREIGN KEY (produto_id)
            REFERENCES produto (id)
)