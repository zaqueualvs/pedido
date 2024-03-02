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
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "pagamento")
public abstract class PagamentoEntity {

    @Id
    private Long id;
    private Integer estadoPagamento;
    @OneToOne
    @JoinColumn(name = "pedido_id")
    @MapsId
    private PedidoEntity pedido;

    public EstadoPagamento getEstadoPagamento() {
        return EstadoPagamento.toEnum(estadoPagamento);
    }

    public void setEstadoPagamento(EstadoPagamento estadoPagamento) {
        this.estadoPagamento = estadoPagamento.getCod();
    }
}
