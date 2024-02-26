package com.alves.pedido.adapters.out.database.h2.adapters.cliente;

import com.alves.pedido.adapters.out.database.h2.entities.ClienteEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.ClientePersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.ClienteRepository;
import com.alves.pedido.application.ports.out.cliente.SaveClientePort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Cliente;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class SaveClientePersistenceAdapter implements SaveClientePort {

    private final ClienteRepository clienteRepository;
    private final ClientePersistenceMapper clientePersistenceMapper;

    @Override
    public Cliente save(Cliente cliente) {
        ClienteEntity clienteEntity = clientePersistenceMapper.toEntity(cliente);
        clienteEntity = clienteRepository.save(clienteEntity);
        cliente = clientePersistenceMapper.toDomain(clienteEntity);
        return cliente;
    }
}
