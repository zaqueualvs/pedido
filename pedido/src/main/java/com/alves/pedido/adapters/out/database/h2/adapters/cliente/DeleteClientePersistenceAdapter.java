package com.alves.pedido.adapters.out.database.h2.adapters.cliente;

import com.alves.pedido.adapters.out.database.h2.entities.ClienteEntity;
import com.alves.pedido.adapters.out.database.h2.mapper.ClientePersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.ClienteRepository;
import com.alves.pedido.application.ports.out.cliente.DeleteClientePort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Cliente;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class DeleteClientePersistenceAdapter implements DeleteClientePort {

    private final ClienteRepository clienteRepository;
    private final ClientePersistenceMapper clientePersistenceMapper;

    @Override
    public void delete(Cliente cliente) {
        ClienteEntity clienteEntity = clientePersistenceMapper.toEntity(cliente);
        clienteRepository.delete(clienteEntity);
    }
}
