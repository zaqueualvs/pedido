package com.alves.pedido.adapters.out.database.h2.adapters.endereco;

import com.alves.pedido.application.ports.out.endereco.SaveEnderecoPort;
import com.alves.pedido.application.ports.out.endereco.UpdateEnderecoPort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Endereco;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class UpdateEnderecoPersistenceAdapter implements UpdateEnderecoPort {

    private final SaveEnderecoPort saveEnderecoPort;

    @Override
    public Endereco update(Endereco endereco) {
        return saveEnderecoPort.save(endereco);
    }
}
