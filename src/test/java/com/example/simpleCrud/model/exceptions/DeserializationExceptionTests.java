package com.example.simpleCrud.model.exceptions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class DeserializationExceptionTests {

    @Test
    void mustBeTrowable() {
        assertThrows(DeserializationException.class, () -> {
            throw new DeserializationException("Mensagem de teste");
        });
    }

    @Test
    void mustBeInstanciable() {
        DeserializationException exception = new DeserializationException("Mensagem de teste");
        assertNotNull(exception);
    }
}
