package com.alves.pedido.adapters.out.database.h2.adapters.cliente;

import com.alves.pedido.adapters.out.database.h2.mapper.ClientePersistenceMapper;
import com.alves.pedido.adapters.out.database.h2.repositories.ClienteRepository;
import com.alves.pedido.application.ports.out.cliente.FindAllClientePort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Cliente;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@PersistenceAdapter
@RequiredArgsConstructor
public class FindAllClientePersistenceAdapter implements FindAllClientePort {

    private final ClienteRepository clienteRepository;
    private final ClientePersistenceMapper clientePersistenceMapper;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll()
                .stream()
                .map(clientePersistenceMapper::toDomain)
                .collect(Collectors.toList());
    }
}
