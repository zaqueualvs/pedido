package com.alves.pedido.adapters.out.database.h2.repositories;

import com.alves.pedido.adapters.out.database.h2.entities.CidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<CidadeEntity, Long> {
}
