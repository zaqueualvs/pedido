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
CREATE TABLE endereco
(
    id          BIGINT NOT NULL AUTO_INCREMENT,
    logradouro  VARCHAR(40),
    numero      INT,
    complemento VARCHAR(40),
    bairro      VARCHAR(40),
    cep         VARCHAR(10),
    cidade_id   BIGINT,

    PRIMARY KEY (id),

    CONSTRAINT fk_endereco_cidade
        FOREIGN KEY (cidade_id)
            REFERENCES cidade (id)
);