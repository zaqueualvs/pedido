package com.alves.pedido.adapters.out.database.h2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "pagamento_com_cartao")
public class PagamentoComCartaoEntity extends PagamentoEntity {
    private Integer numeroDeParcelas;

}
