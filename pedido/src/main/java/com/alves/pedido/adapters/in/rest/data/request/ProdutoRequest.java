package com.alves.pedido.adapters.in.rest.data.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProdutoRequest implements Serializable {
    @NotBlank
    private String nome;
    @NotNull
    private BigDecimal preco;
}
