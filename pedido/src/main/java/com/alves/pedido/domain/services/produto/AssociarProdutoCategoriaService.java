package com.alves.pedido.domain.services.produto;

import com.alves.pedido.application.ports.in.categoria.FindCategoriaByIdUseCase;
import com.alves.pedido.application.ports.in.produto.AssociarProdutoCategoriaUseCase;
import com.alves.pedido.application.ports.in.produto.FindProdutoByIdUseCase;
import com.alves.pedido.application.ports.in.produto.SaveProdutoUseCase;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Categoria;
import com.alves.pedido.domain.models.Produto;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class AssociarProdutoCategoriaService implements AssociarProdutoCategoriaUseCase {

    private final FindProdutoByIdUseCase findProdutoByIdUseCase;
    private final FindCategoriaByIdUseCase findCategoriaByIdUseCase;
    private final SaveProdutoUseCase saveProdutoUseCase;

    @Override
    public void associar(Long produtoId, Long categoriaId) {
        Produto produto = findProdutoByIdUseCase.findById(produtoId);
        Categoria categoria = findCategoriaByIdUseCase.findById(categoriaId);
        produto.getCategorias().add(categoria);
        saveProdutoUseCase.save(produto);
    }
}
