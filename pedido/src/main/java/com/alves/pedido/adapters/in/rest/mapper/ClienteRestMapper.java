package com.alves.pedido.adapters.in.rest.mapper;

import com.alves.pedido.adapters.in.rest.data.request.ClienteRequest;
import com.alves.pedido.adapters.in.rest.data.response.ClienteResponse;
import com.alves.pedido.adapters.in.rest.data.response.PagamentoComBoletoResponse;
import com.alves.pedido.adapters.in.rest.data.response.PagamentoComCartaoResponse;
import com.alves.pedido.adapters.in.rest.data.response.PagamentoResponse;
import com.alves.pedido.domain.models.Cliente;
import com.alves.pedido.domain.models.Pagamento;
import com.alves.pedido.domain.models.PagamentoComBoleto;
import com.alves.pedido.domain.models.PagamentoComCartao;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface ClienteRestMapper extends AbstractRestAdapterMapper<Cliente, ClienteRequest, ClienteResponse> {

    default PagamentoResponse pagamentoEntityToPagamento(Pagamento pagamento) {
        if (pagamento instanceof PagamentoComCartao) {
            return pagamentoComCartaoToPagamentoComCartaoResponse((PagamentoComCartao) pagamento);
        } else if (pagamento instanceof PagamentoComBoleto) {
            return pagamentoComBoletoToPagamentoComBoletoResponse((PagamentoComBoleto) pagamento);
        } else if (pagamento == null) {
            return null;
        }
        throw new IllegalArgumentException("Erro de instancia");
    }

    @Named("pagamentoComCartaoEntity")
    @Deprecated
    PagamentoComCartaoResponse pagamentoComCartaoToPagamentoComCartaoResponse(PagamentoComCartao pagamentoComCartao);

    @Named("pagamentoComBoletoEntity")
    @Deprecated
    PagamentoComBoletoResponse pagamentoComBoletoToPagamentoComBoletoResponse(PagamentoComBoleto pagamentoComBoleto);

}
