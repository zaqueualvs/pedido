package com.alves.pedido.adapters.out.database.h2.repositories;

import com.alves.pedido.adapters.out.database.h2.entities.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Integer> {
}
