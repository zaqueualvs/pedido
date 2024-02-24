package com.alves.pedido.domain.services.endereco;

import com.alves.pedido.application.ports.in.endereco.FindAllEnderecoUseCase;
import com.alves.pedido.application.ports.out.endereco.FindAllEnderecoPort;
import com.alves.pedido.commons.customannotation.UseCase;
import com.alves.pedido.domain.models.Endereco;
import lombok.RequiredArgsConstructor;

import java.util.List;

@UseCase
@RequiredArgsConstructor
public class FindAllEnderecoService implements FindAllEnderecoUseCase {

    private final FindAllEnderecoPort findAllEnderecoPort;

    @Override
    public List<Endereco> findAll() {
        return findAllEnderecoPort.findAll();
    }
}
