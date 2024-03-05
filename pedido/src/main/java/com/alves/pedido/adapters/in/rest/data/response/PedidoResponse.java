package com.alves.pedido.adapters.in.rest.data.response;

import com.alves.pedido.domain.models.Cliente;
import com.alves.pedido.domain.models.Endereco;
import com.alves.pedido.domain.models.ItemPedido;
import com.alves.pedido.domain.models.Pagamento;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PedidoResponse implements Serializable {
    private Long id;
    private OffsetDateTime dataPedido;
    private Set<ItemPedidoResponse> itemPedidos = new HashSet<>();
    private EnderecoPedidoResponse enderecoEntrega;
    private PagamentoResponse pagamento;
    private ClientePedidoResponse cliente;
    private BigDecimal precoTotal;
}
