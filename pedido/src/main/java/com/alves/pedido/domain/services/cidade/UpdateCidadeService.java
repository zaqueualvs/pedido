package com.alves.pedido.domain.services.cidade;

import com.alves.pedido.application.ports.in.cidade.UpdateCidadeUseCase;
import com.alves.pedido.application.ports.out.cidade.UpdateCidadePort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Cidade;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class UpdateCidadeService implements UpdateCidadeUseCase {
    private final UpdateCidadePort updateCidadePort;

    @Override
    public Cidade update(Cidade cidade) {
        return updateCidadePort.update(cidade);
    }
}
