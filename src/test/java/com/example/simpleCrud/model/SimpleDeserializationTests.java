package com.example.simpleCrud.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class SimpleDeserializationTests {

    private final SimpleDeserialization<Integer> mock = new SimpleDeserialization<Integer>() {
        @Override
        public Integer deserialize(String value) {
            return 0;
        }
    };

    @Test
    void methodDeserializeMustBeCalled() {
        assertDoesNotThrow(() -> this.mock.deserialize("Something"));
    }
}
