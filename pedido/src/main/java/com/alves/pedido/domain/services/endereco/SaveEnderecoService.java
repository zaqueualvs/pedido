package com.alves.pedido.domain.services.endereco;

import com.alves.pedido.application.ports.in.endereco.SaveEnderecoUseCase;
import com.alves.pedido.application.ports.out.endereco.SaveEnderecoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Endereco;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class SaveEnderecoService implements SaveEnderecoUseCase {

    private final SaveEnderecoPort saveEnderecoPort;

    @Override
    public Endereco save(Endereco endereco) {
        return saveEnderecoPort.save(endereco);
    }
}
