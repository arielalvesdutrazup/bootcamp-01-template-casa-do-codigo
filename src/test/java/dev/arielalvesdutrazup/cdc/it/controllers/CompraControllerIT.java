package dev.arielalvesdutrazup.cdc.it.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.fail;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
@AutoConfigureTestDatabase
@ActiveProfiles("test")
public class CompraControllerIT {

    @Test
    public void fecharCompra_deveRetornar200() {
        fail("Não implementado!");
    }

    @Test
    public void fecharCompra_comDadosInvalidos_deveRetornar400() {
        fail("Não implementado!");
    }
}
