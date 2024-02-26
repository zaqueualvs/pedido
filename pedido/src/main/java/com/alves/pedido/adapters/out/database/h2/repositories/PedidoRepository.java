package com.alves.pedido.adapters.out.database.h2.repositories;

import com.alves.pedido.adapters.out.database.h2.entities.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {
}
