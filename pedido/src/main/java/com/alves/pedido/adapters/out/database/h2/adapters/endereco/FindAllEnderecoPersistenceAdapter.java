package com.alves.pedido.adapters.out.database.h2.adapters.endereco;

import com.alves.pedido.adapters.out.database.h2.mapper.EnderecoPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.EnderecoRepository;
import com.alves.pedido.application.ports.out.endereco.FindAllEnderecoPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Endereco;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@PersistenceAdapter
@RequiredArgsConstructor
public class FindAllEnderecoPersistenceAdapter implements FindAllEnderecoPort {

    private final EnderecoRepository enderecoRepository;
    private final EnderecoPersistenceMapper enderecoPersistenceMapper;

    @Override
    public List<Endereco> findAll() {
        return enderecoRepository.findAll()
                .stream()
                .map(enderecoPersistenceMapper::toDomain)
                .collect(Collectors.toList());
    }
}
