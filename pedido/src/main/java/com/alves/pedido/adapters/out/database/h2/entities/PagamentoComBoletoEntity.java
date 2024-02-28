package com.alves.pedido.adapters.out.database.h2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PagamentoComBoletoEntity extends PagamentoEntity {
    private OffsetDateTime dataVencimento;
    private OffsetDateTime dataPagamento;

}
