package com.alves.pedido.adapters.out.database.h2.adapters.cidade;

import com.alves.pedido.adapters.out.database.h2.entities.CidadeEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.CidadePersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.CidadeRepository;
import com.alves.pedido.application.ports.out.cidade.DeleteCidadePort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Cidade;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class DeleteCidadePersistenceAdapter implements DeleteCidadePort {

    private final CidadeRepository cidadeRepository;
    private final CidadePersistenceMapper cidadePersistenceMapper;
    @Override
    public void delete(Cidade cidade) {
        CidadeEntity cidadeEntity = cidadePersistenceMapper.toEntity(cidade);
        cidadeRepository.delete(cidadeEntity);
    }
}
