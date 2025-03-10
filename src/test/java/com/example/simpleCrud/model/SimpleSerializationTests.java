package com.example.simpleCrud.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class SimpleSerializationTests {

    private final SimpleSerialization mock = new SimpleSerialization() {
        @Override
        public String serialize() {
            return "ok";
        }
    };

    @Test
    void methodSerializeMustBeCalled() {
        assertDoesNotThrow(this.mock::serialize);
    }
}
