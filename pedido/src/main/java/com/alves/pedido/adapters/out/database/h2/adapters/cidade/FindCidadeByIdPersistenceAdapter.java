package com.alves.pedido.adapters.out.database.h2.adapters.cidade;

import com.alves.pedido.adapters.out.database.h2.entities.CidadeEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.CidadePersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.CidadeRepository;
import com.alves.pedido.application.ports.out.cidade.FindCidadeByIdPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Cidade;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@PersistenceAdapter
@RequiredArgsConstructor
public class FindCidadeByIdPersistenceAdapter implements FindCidadeByIdPort {

    private final CidadeRepository cidadeRepository;
    private final CidadePersistenceMapper cidadePersistenceMapper;

    @Override
    public Optional<Cidade> findById(Long id) {
        Optional<CidadeEntity> cidadeEntityO = cidadeRepository.findById(id);
        if (cidadeEntityO.isEmpty()) {
            return Optional.empty();
        }
        Cidade cidade = cidadePersistenceMapper.toDomain(cidadeEntityO.get());
        return Optional.of(cidade);
    }
}
