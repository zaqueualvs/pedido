package com.alves.pedido.adapters.out.database.h2.entities;

import com.alves.pedido.domain.models.enums.EstadoPagamento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "pagamento")
@Entity
public abstract class PagamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private EstadoPagamento estadoPagamento;
    @OneToOne(mappedBy = "pagamento")
    private PedidoEntity pedidoEntity;
}
