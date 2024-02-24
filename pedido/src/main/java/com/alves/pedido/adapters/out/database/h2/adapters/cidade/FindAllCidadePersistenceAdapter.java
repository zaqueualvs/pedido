package com.alves.pedido.adapters.out.database.h2.adapters.cidade;

import com.alves.pedido.adapters.out.database.h2.mapper.CidadePersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.CidadeRepository;
import com.alves.pedido.application.ports.out.cidade.FindAllCidadePort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Cidade;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@PersistenceAdapter
@RequiredArgsConstructor
public class FindAllCidadePersistenceAdapter implements FindAllCidadePort {

    private final CidadeRepository cidadeRepository;
    private final CidadePersistenceMapper cidadePersistenceMapper;

    @Override
    public List<Cidade> findAll() {
        return cidadeRepository.findAll()
                .stream()
                .map(cidadePersistenceMapper::toDomain)
                .collect(Collectors.toList());
    }
}
