package com.example.simpleCrud.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class SimpleClientTests {

    @Test
    void mustBeInstanciable() {
        SimpleClient instance = new SimpleClient("ID1", "Testador");
        assertNotNull(instance);
    }

    @Test
    void mustBeAbleToGetCadastroId() {
        String value = "ID1";
        SimpleClient instance = new SimpleClient(value, "Testador");
        assertEquals(instance.cadastroId(), value);
    }

    @Test
    void mustBeAbleToGetNomeCliente() {
        String value = "Testador";
        SimpleClient instance = new SimpleClient("ID1", value);
        assertEquals(instance.nomeCliente(), value);
    }
}
