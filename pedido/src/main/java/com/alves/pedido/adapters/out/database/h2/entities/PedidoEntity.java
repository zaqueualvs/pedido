package com.alves.pedido.adapters.out.database.h2.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@Setter
@Getter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "pedido")
public class PedidoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private OffsetDateTime dataPedido;
    @ManyToOne
    private EnderecoEntity enderecoEntrega;
    @OneToOne(cascade = CascadeType.ALL)
    private PagamentoEntity pagamento;
    @ManyToOne
    private ClienteEntity cliente;
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<ItemPedidoEntity> itemPedidos = new ArrayList<>();

    public PedidoEntity(Long id,
                        OffsetDateTime dataPedido,
                        EnderecoEntity enderecoEntrega,
                        ClienteEntity cliente) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.enderecoEntrega = enderecoEntrega;
        this.cliente = cliente;
    }
}
