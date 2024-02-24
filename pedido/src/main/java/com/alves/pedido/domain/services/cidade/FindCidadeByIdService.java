package com.alves.pedido.domain.services.cidade;

import com.alves.pedido.application.ports.in.cidade.FindCidadeByIdUseCase;
import com.alves.pedido.application.ports.out.cidade.FindCidadeByIdPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.exception.CidadeNaoEncontradaException;
import com.alves.pedido.domain.models.Cidade;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class FindCidadeByIdService implements FindCidadeByIdUseCase {

    private final FindCidadeByIdPort findCidadeByIdPort;

    @Override
    public Cidade findById(Long id) {
        return findCidadeByIdPort.findById(id).orElseThrow(
                () -> new CidadeNaoEncontradaException(id)
        );
    }
}
