package com.alves.pedido.domain.services.endereco;

import com.alves.pedido.application.ports.in.endereco.DeleteEnderecoUseCase;
import com.alves.pedido.application.ports.in.endereco.FindEnderecoByIdUseCase;
import com.alves.pedido.application.ports.out.endereco.DeleteEnderecoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Endereco;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class DeleteEnderecoService implements DeleteEnderecoUseCase {

    private final DeleteEnderecoPort deleteEnderecoPort;
    private final FindEnderecoByIdUseCase findEnderecoByIdUseCase;

    @Override
    public void delete(Long id) {
        Endereco endereco = findEnderecoByIdUseCase.findById(id);
        deleteEnderecoPort.delete(endereco);
    }
}
