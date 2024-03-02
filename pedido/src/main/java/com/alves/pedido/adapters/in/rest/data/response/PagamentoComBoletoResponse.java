package com.alves.pedido.adapters.in.rest.data.response;

import com.alves.pedido.domain.models.Pedido;
import com.alves.pedido.domain.models.enums.EstadoPagamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PagamentoComBoletoResponse extends PagamentoResponse {
    private OffsetDateTime dataVencimento;
    private OffsetDateTime dataPagamento;
}
