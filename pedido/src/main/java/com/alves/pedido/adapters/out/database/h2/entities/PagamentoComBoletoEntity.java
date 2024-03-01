package com.alves.pedido.adapters.out.database.h2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "pagamento_com_boleto")
public class PagamentoComBoletoEntity extends PagamentoEntity {
    private OffsetDateTime dataVencimento;
    private OffsetDateTime dataPagamento;

}
