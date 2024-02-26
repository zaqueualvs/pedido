package com.alves.pedido.adapters.out.database.h2.entities;

import com.alves.pedido.domain.models.enums.TipoCliente;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "cliente")
public class ClienteEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cnpjOuCpf;
    private TipoCliente tipoCliente;
    @OneToOne
    private EnderecoEntity endereco;
    @ElementCollection
    @CollectionTable(name = "cliente_telefone",
            joinColumns = @JoinColumn(name = "cliente_id"))
    private Set<TelefoneEntity> telefones = new HashSet<>();
    @OneToMany(mappedBy = "cliente")
    private List<PedidoEntity> pedidos = new ArrayList<>();

    public ClienteEntity(Long id,
                         String nome,
                         String email,
                         String cnpjOuCpf,
                         TipoCliente tipoCliente,
                         EnderecoEntity endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cnpjOuCpf = cnpjOuCpf;
        this.tipoCliente = tipoCliente;
        this.endereco = endereco;
    }
}
