package com.alves.pedido.adapters.out.database.h2.mapper;

import com.alves.pedido.adapters.out.database.h2.entities.PagamentoComBoletoEntity;
import com.alves.pedido.adapters.out.database.h2.entities.PagamentoComCartaoEntity;
import com.alves.pedido.adapters.out.database.h2.entities.PagamentoEntity;
import com.alves.pedido.domain.models.Pagamento;
import com.alves.pedido.domain.models.PagamentoComBoleto;
import com.alves.pedido.domain.models.PagamentoComCartao;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

public interface PagamentoInstanciaMapper {

    default PagamentoEntity pagamentoToPagamentoEntity(Pagamento pagamento) {
        if (pagamento instanceof PagamentoComCartao) {
            return pagamentoComCartaoToPagamentoComCartaoEntity((PagamentoComCartao) pagamento);
        } else if (pagamento instanceof PagamentoComBoleto) {
            return pagamentoComBoletoToPagamentoComBoletoEntity((PagamentoComBoleto) pagamento);
        } else if (pagamento == null) {
            return null;
        }
        throw new IllegalArgumentException("Erro de instancia");
    }

    @Named("pagamentoComCartao")
    @Deprecated
    @Mapping(target = "pedido", ignore = true)
    PagamentoComCartaoEntity pagamentoComCartaoToPagamentoComCartaoEntity(PagamentoComCartao pagamentoComCartao);

    @Named("pagamentoComBoleto")
    @Deprecated
    @Mapping(target = "pedido", ignore = true)
    PagamentoComBoletoEntity pagamentoComBoletoToPagamentoComBoletoEntity(PagamentoComBoleto pagamentoComBoleto);


    default Pagamento pagamentoEntityToPagamento(PagamentoEntity pagamentoEntity) {
        if (pagamentoEntity instanceof PagamentoComCartaoEntity) {
            return pagamentoComCartaoEntityToPagamentoComCartao((PagamentoComCartaoEntity) pagamentoEntity);
        } else if (pagamentoEntity instanceof PagamentoComBoletoEntity) {
            return pagamentoComBoletoEntityToPagamentoComBoleto((PagamentoComBoletoEntity) pagamentoEntity);
        } else if (pagamentoEntity == null) {
            return null;
        }
        throw new IllegalArgumentException("Erro de instancia");
    }

    @Named("pagamentoComCartaoEntity")
    @Deprecated
    @Mapping(target = "pedido", ignore = true)
    PagamentoComCartao pagamentoComCartaoEntityToPagamentoComCartao(PagamentoComCartaoEntity pagamentoComCartaoEntity);

    @Named("pagamentoComBoletoEntity")
    @Deprecated
    @Mapping(target = "pedido", ignore = true)
    PagamentoComBoleto pagamentoComBoletoEntityToPagamentoComBoleto(PagamentoComBoletoEntity pagamentoComBoletoEntity);

}
