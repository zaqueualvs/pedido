package com.alves.pedido.adapters.in.rest.data.response;

import com.alves.pedido.domain.models.Cliente;
import com.alves.pedido.domain.models.Endereco;
import com.alves.pedido.domain.models.Pagamento;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PedidoResponse {
    private Long id;
    private OffsetDateTime dataPedido;
    //private List<ItemPedido> itemPedidos = new ArrayList<>();
    private EnderecoPedidoResponse enderecoEntrega;
    private PagamentoResponse pagamento;

}
