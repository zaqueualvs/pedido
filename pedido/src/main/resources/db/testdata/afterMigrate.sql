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

INSERT INTO estado(nome)
VALUES ('Minas Gerais'),
       ('São Paulo');

INSERT INTO cidade(nome, estado_id)
VALUES ('Uberlãndia', 1),
       ('São Paulo', 2),
       ('Campinas', 2);

INSERT INTO cliente(nome, email, cnpj_ou_cpf, tipo_cliente)
VALUES ('Maria Silva', 'maria@gmail.com', 36378912377, 1);

INSERT INTO cliente_telefone(cliente_id, telefone)
VALUES (1, 27363323),
       (1, 75869512);

INSERT INTO endereco(logradouro, numero, complemento, bairro, cep, cliente_id, cidade_id)
VALUES ('Rua Flores', 300, 'Apto 303', 'Jardim', 38220834, 1, 1),
       ('Avenida Matos', 105, 'Sala 800', 'Centro', 38777012, 1, 2);

INSERT INTO pedido(data_pedido, cliente_id, endereco_entrega_id)
VALUES ('2017-09-30 10.30.00+03', 1, 1),
       ('2017-10-10 09.10.00+03', 1, 2);

INSERT INTO pagamento(pedido_id, estado_pagamento)
VALUES (1, 2),
       (2, 1);

INSERT INTO pagamento_com_cartao(pedido_id, numero_de_parcelas)
VALUES (1, 6);

INSERT INTO pagamento_com_boleto(pedido_id, data_pagamento)
VALUES (2, '2017-10-20 09.00.00+03')