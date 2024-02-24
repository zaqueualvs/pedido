package com.alves.pedido.domain.services.cidade;

import com.alves.pedido.application.ports.in.cidade.SaveCidadeUseCase;
import com.alves.pedido.application.ports.out.cidade.SaveCidadePort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Cidade;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class SaveCidadeService implements SaveCidadeUseCase {
    private final SaveCidadePort saveCidadePort;

    @Override
    public Cidade save(Cidade cidade) {
        return saveCidadePort.save(cidade);
    }
}
