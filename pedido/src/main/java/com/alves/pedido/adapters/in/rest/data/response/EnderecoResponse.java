package com.alves.pedido.adapters.in.rest.data.response;

import com.alves.pedido.domain.models.Cidade;
import com.alves.pedido.domain.models.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EnderecoResponse implements Serializable {

    private Long id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private ClienteEnderecoResponse cliente;
    private CidadeResponse cidade;
}
