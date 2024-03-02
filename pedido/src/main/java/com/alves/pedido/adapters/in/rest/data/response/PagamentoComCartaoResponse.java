package com.alves.pedido.adapters.in.rest.data.response;

import com.alves.pedido.domain.models.Pedido;
import com.alves.pedido.domain.models.enums.EstadoPagamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PagamentoComCartaoResponse extends PagamentoResponse {
    private Integer numeroDeParcelas;
}
