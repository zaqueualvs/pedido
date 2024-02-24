package com.alves.pedido.domain.services.endereco;

import com.alves.pedido.application.ports.in.endereco.UpdateEnderecoUseCase;
import com.alves.pedido.application.ports.out.endereco.UpdateEnderecoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Endereco;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class UpdateEnderecoService implements UpdateEnderecoUseCase {

    private final UpdateEnderecoPort updateEnderecoPort;

    @Override
    public Endereco update(Endereco endereco) {
        return updateEnderecoPort.update(endereco);
    }
}
