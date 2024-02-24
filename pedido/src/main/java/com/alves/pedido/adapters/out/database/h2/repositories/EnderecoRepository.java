package com.alves.pedido.adapters.out.database.h2.repositories;

import com.alves.pedido.adapters.out.database.h2.entities.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Long> {
}
