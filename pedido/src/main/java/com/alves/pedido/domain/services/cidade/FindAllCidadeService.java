package com.alves.pedido.domain.services.cidade;

import com.alves.pedido.application.ports.in.cidade.FindAllCidadeUseCase;
import com.alves.pedido.application.ports.out.cidade.FindAllCidadePort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Cidade;
import lombok.RequiredArgsConstructor;

import java.util.List;

@UseCase
@RequiredArgsConstructor
public class FindAllCidadeService implements FindAllCidadeUseCase {

    private final FindAllCidadePort findAllCidadePort;
    @Override
    public List<Cidade> findAll() {
        return findAllCidadePort.findAll();
    }
}
