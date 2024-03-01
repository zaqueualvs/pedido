package com.alves.pedido.adapters.out.database.h2.mapper;

import com.alves.pedido.adapters.out.database.h2.entities.PagamentoComBoletoEntity;
import com.alves.pedido.adapters.out.database.h2.entities.PagamentoComCartaoEntity;
import com.alves.pedido.adapters.out.database.h2.entities.PagamentoEntity;
import com.alves.pedido.adapters.out.database.h2.entities.PedidoEntity;
import com.alves.pedido.domain.models.Pagamento;
import com.alves.pedido.domain.models.PagamentoComBoleto;
import com.alves.pedido.domain.models.PagamentoComCartao;
import com.alves.pedido.domain.models.Pedido;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface PedidoPersistenceMapper extends AbstractPersistenceMapper<Pedido, PedidoEntity>, PagamentoInstanciaMapper {

}
