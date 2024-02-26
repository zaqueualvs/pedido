package com.alves.pedido.adapters.out.database.h2.adapters.cliente;

import com.alves.pedido.adapters.out.database.h2.entities.ClienteEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.ClientePersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.ClienteRepository;
import com.alves.pedido.application.ports.out.cliente.FindClienteByIdPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Cliente;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@PersistenceAdapter
@RequiredArgsConstructor
public class FindClienteByIdPersistenceAdapter implements FindClienteByIdPort {

    private final ClienteRepository clienteRepository;
    private final ClientePersistenceMapper clientePersistenceMapper;

    @Override
    public Optional<Cliente> findById(Long id) {
        Optional<ClienteEntity> clienteEntityO = clienteRepository.findById(id);
        if (clienteEntityO.isEmpty()) {
            return Optional.empty();
        }
        Cliente cliente = clientePersistenceMapper.toDomain(clienteEntityO.get());
        return Optional.of(cliente);
    }
}
