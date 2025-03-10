package com.example.simpleCrud.model.exceptions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class DatabaseExceptionTests {

    @Test
    void mustBeTrowable() {
        assertThrows(DatabaseException.class, () -> {
            throw new DatabaseException("Mensagem de teste");
        });
    }

    @Test
    void mustBeInstanciable() {
        DatabaseException exception = new DatabaseException("Mensagem de teste");
        assertNotNull(exception);
    }
}
