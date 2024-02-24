package com.alves.pedido.adapters.out.database.h2.adapters.cidade;

import com.alves.pedido.adapters.out.database.h2.entities.CidadeEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.CidadePersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.CidadeRepository;
import com.alves.pedido.application.ports.out.cidade.SaveCidadePort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Cidade;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class SaveCidadePersistenceAdapter implements SaveCidadePort {

    private final CidadeRepository cidadeRepository;
    private final CidadePersistenceMapper cidadePersistenceMapper;

    @Override
    public Cidade save(Cidade cidade) {
        CidadeEntity cidadeEntity = cidadePersistenceMapper.toEntity(cidade);
        cidadeEntity = cidadeRepository.save(cidadeEntity);
        cidade = cidadePersistenceMapper.toDomain(cidadeEntity);
        return cidade;
    }
}
