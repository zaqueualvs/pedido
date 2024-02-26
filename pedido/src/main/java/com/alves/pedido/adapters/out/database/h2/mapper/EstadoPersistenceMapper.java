package com.alves.pedido.adapters.out.database.h2.mapper;

import com.alves.pedido.adapters.out.database.h2.entities.CidadeEntity;
import com.alves.pedido.adapters.out.database.h2.entities.EstadoEntity;
import com.alves.pedido.domain.models.Cidade;
import com.alves.pedido.domain.models.Estado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EstadoPersistenceMapper extends AbstractPersistenceMapper<Estado, EstadoEntity> {

    @Deprecated
    @Mapping(target = "estado", ignore = true)
    Cidade cidadeEntityToCidade(CidadeEntity cidadeEntity);

    @Deprecated
    @Mapping(target = "estado", ignore = true)
    CidadeEntity cidadeToCidadeEntity(Cidade cidade);
}
