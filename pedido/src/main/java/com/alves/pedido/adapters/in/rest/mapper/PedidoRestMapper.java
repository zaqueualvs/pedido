package com.alves.pedido.adapters.in.rest.mapper;

import com.alves.pedido.adapters.in.rest.data.request.CategoriaRequest;
import com.alves.pedido.adapters.in.rest.data.request.PedidoRequest;
import com.alves.pedido.adapters.in.rest.data.response.*;
import com.alves.pedido.adapters.out.database.h2.entities.PagamentoComBoletoEntity;
import com.alves.pedido.adapters.out.database.h2.entities.PagamentoComCartaoEntity;
import com.alves.pedido.adapters.out.database.h2.entities.PagamentoEntity;
import com.alves.pedido.domain.models.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface PedidoRestMapper extends AbstractRestAdapterMapper<Pedido, PedidoRequest, PedidoResponse>{

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
