package com.alves.pedido.adapters.in.rest.data.response;

import com.alves.pedido.domain.models.enums.TipoCliente;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ClientePedidoResponse implements Serializable {
    private Long id;
    private String nome;
    private String email;
    private String cnpjOuCpf;
    private TipoCliente tipoCliente;
    private Set<TelefoneResponse> telefones = new HashSet<>();

    @JsonIgnore
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public String getTipoDoCliente() {
        return tipoCliente.getTipo();
    }
}
