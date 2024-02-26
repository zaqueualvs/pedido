package com.alves.pedido.application.ports.in.produto;

public interface AssociarProdutoCategoriaUseCase {
    void associar(Long produtoId, Long categoriaId);
}
