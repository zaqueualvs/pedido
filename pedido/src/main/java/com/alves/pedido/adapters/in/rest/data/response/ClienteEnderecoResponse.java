package com.alves.pedido.adapters.in.rest.data.response;

import com.alves.pedido.domain.models.enums.TipoCliente;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@NoArgsConstructor
@Setter
@Getter
public class ClienteEnderecoResponse implements Serializable {
    private Long id;
    private String nome;
    private String email;
    private String cnpjOuCpf;
    private TipoCliente tipoCliente;
    private Set<TelefoneResponse> telefones = new HashSet<>();

    public ClienteEnderecoResponse(Long id, String nome, String email, String cnpjOuCpf, TipoCliente tipoCliente) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cnpjOuCpf = cnpjOuCpf;
        this.tipoCliente = tipoCliente;
    }

    @JsonIgnore
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public String getTipoDoCliente() {
        return tipoCliente.getTipo();
    }
}
