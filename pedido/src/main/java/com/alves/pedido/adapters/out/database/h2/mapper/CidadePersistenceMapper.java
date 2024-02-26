package com.alves.pedido.adapters.out.database.h2.mapper;

import com.alves.pedido.adapters.out.database.h2.entities.CidadeEntity;
import com.alves.pedido.adapters.out.database.h2.entities.EstadoEntity;
import com.alves.pedido.domain.models.Cidade;
import com.alves.pedido.domain.models.Estado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CidadePersistenceMapper extends AbstractPersistenceMapper<Cidade, CidadeEntity> {

    @Deprecated
    @Mapping(target = "cidades", ignore = true)
    Estado estadoEntityToEstado(EstadoEntity estadoEntity);

    @Deprecated
    @Mapping(target = "cidades", ignore = true)
    EstadoEntity estadoToEstadoEntity(Estado estado);
}
