package com.alves.pedido.adapters.in.rest.data.request;

import com.alves.pedido.domain.models.enums.TipoCliente;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Setter
@Getter
public class ClienteRequest implements Serializable {
    private String nome;
    private String email;
    private String cnpjOuCpf;
    private TipoCliente tipoCliente;

    public ClienteRequest(String nome, String email, String cnpjOuCpf, Integer tipoCliente) {
        this.nome = nome;
        this.email = email;
        this.cnpjOuCpf = cnpjOuCpf;
        this.tipoCliente = TipoCliente.toEnum(tipoCliente);
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Integer tipoCliente) {
        this.tipoCliente = TipoCliente.toEnum(tipoCliente);
    }

}
