package com.alves.pedido.adapters.out.database.h2.adapters.endereco;

import com.alves.pedido.adapters.out.database.h2.entities.EnderecoEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.EnderecoPersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.EnderecoRepository;
import com.alves.pedido.application.ports.out.endereco.DeleteEnderecoPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Endereco;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class DeleteEnderecoPersistenceAdapter implements DeleteEnderecoPort {

    private final EnderecoRepository enderecoRepository;
    private final EnderecoPersistenceMapper enderecoPersistenceMapper;

    @Override
    public void delete(Endereco endereco) {
        EnderecoEntity enderecoEntity = enderecoPersistenceMapper.toEntity(endereco);
        enderecoRepository.delete(enderecoEntity);
    }
}
