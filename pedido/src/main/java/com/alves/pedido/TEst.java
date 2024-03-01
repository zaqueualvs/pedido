package com.alves.pedido;

import com.alves.pedido.application.ports.in.cliente.FindClienteByIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class TEst implements CommandLineRunner {
    private final FindClienteByIdUseCase findClienteByIdUseCase;
    @Override
    public void run(String... args) throws Exception {
        //System.out.println(findClienteByIdUseCase.findById(1l));
    }
}
