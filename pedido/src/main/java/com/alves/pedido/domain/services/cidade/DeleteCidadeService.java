package com.alves.pedido.domain.services.cidade;

import com.alves.pedido.application.ports.in.cidade.DeleteCidadeUseCase;
import com.alves.pedido.application.ports.in.cidade.FindCidadeByIdUseCase;
import com.alves.pedido.application.ports.out.cidade.DeleteCidadePort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Cidade;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class DeleteCidadeService implements DeleteCidadeUseCase {
    private final DeleteCidadePort deleteCidadePort;
    private final FindCidadeByIdUseCase findCidadeByIdUseCase;

    @Override
    public void delete(Long id) {
        Cidade cidade = findCidadeByIdUseCase.findById(id);
        deleteCidadePort.delete(cidade);
    }
}
