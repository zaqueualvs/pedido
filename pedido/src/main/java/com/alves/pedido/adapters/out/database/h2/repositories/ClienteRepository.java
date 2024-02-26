package com.alves.pedido.adapters.out.database.h2.repositories;

import com.alves.pedido.adapters.out.database.h2.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}
