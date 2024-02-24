package com.alves.pedido.domain.services.endereco;

import com.alves.pedido.application.ports.in.endereco.FindEnderecoByIdUseCase;
import com.alves.pedido.application.ports.out.endereco.FindEnderecoByIdPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.exception.EnderecoNaoEncontradoException;
import com.alves.pedido.domain.models.Endereco;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class FindEnderecoByIdService implements FindEnderecoByIdUseCase {

    private final FindEnderecoByIdPort findEnderecoByIdPort;

    @Override
    public Endereco findById(Long id) {
        return findEnderecoByIdPort.findById(id).orElseThrow(
                () -> new EnderecoNaoEncontradoException(id)
        );
    }
}
