package com.alves.pedido.adapters.out.database.h2.adapters.endereco;

import com.alves.pedido.adapters.out.database.h2.entities.EnderecoEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.EnderecoPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.EnderecoRepository;
import com.alves.pedido.application.ports.out.endereco.FindEnderecoByIdPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Endereco;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@PersistenceAdapter
@RequiredArgsConstructor
public class FindEnderecoByIdPersistenceAdapter implements FindEnderecoByIdPort {

    private final EnderecoRepository enderecoRepository;
    private final EnderecoPersistenceMapper enderecoPersistenceMapper;

    @Override
    public Optional<Endereco> findById(Long id) {
        Optional<EnderecoEntity> enderecoEntityO = enderecoRepository.findById(id);
        if (enderecoEntityO.isEmpty()) {
            return Optional.empty();
        }
        Endereco endereco = enderecoPersistenceMapper.toDomain(enderecoEntityO.get());
        return Optional.of(endereco);
    }
}
