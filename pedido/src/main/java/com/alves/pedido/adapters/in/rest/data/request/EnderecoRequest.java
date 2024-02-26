package com.alves.pedido.adapters.in.rest.data.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EnderecoRequest implements Serializable {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
}
