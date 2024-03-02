package com.alves.pedido.adapters.in.rest.data.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EnderecoPedidoResponse implements Serializable {

    private Long id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private CidadeResponse cidade;
}
