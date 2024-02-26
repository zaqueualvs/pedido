package com.alves.pedido.adapters.out.database.h2.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Embeddable
public class TelefoneEntity {
    private String numero;
}
