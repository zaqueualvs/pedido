package com.alves.pedido.adapters.out.database.h2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PagamentoComCartaoEntity extends PagamentoEntity {
    private Integer numeroDeParcelas;

}
