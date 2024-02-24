package com.alves.pedido.adapters.out.database.h2.adapters.endereco;

import com.alves.pedido.adapters.out.database.h2.entities.EnderecoEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.EnderecoPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.EnderecoRepository;
import com.alves.pedido.application.ports.out.endereco.SaveEnderecoPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Endereco;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class SaveEnderecoPersistenceAdapter implements SaveEnderecoPort {

    private final EnderecoRepository enderecoRepository;
    private final EnderecoPersistenceMapper enderecoPersistenceMapper;

    @Override
    public Endereco save(Endereco endereco) {
        EnderecoEntity enderecoEntity = enderecoPersistenceMapper.toEntity(endereco);
        enderecoEntity = enderecoRepository.save(enderecoEntity);
        endereco = enderecoPersistenceMapper.toDomain(enderecoEntity);
        return endereco;
    }
}
