INSERT INTO categoria(nome)
VALUES ('Informática'),
       ('Escritório');

INSERT INTO produto(nome, preco)
VALUES ('Computador', 2000.00),
       ('Impressora', 800.00),
       ('Mouse', 80.00);

INSERT INTO produto_categoria(categoria_id, produto_id)
VALUES (1, 1),
       (1, 2),
       (1, 3),
       (2, 2);