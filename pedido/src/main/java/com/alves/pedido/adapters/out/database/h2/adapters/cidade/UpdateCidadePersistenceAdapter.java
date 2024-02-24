package com.alves.pedido.adapters.out.database.h2.adapters.cidade;

import com.alves.pedido.application.ports.out.cidade.SaveCidadePort;
import com.alves.pedido.application.ports.out.cidade.UpdateCidadePort;
import com.alves.pedido.commons.customannotation.PersistenceAdapter;
import com.alves.pedido.domain.models.Cidade;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class UpdateCidadePersistenceAdapter implements UpdateCidadePort {

    private final SaveCidadePort saveCidadePort;

    @Override
    public Cidade update(Cidade cidade) {
        return saveCidadePort.save(cidade);
    }
}
