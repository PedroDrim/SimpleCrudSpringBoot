package com.example.simpleCrud.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SimpleCrudTests {

    private final SimpleCrud<String, Integer> mock = new SimpleCrud<String, Integer>() {
        @Override
        public Integer getData(String id) {
            return 0;
        }

        @Override
        public void putData(Integer object) {}

        @Override
        public void deleteData(String id) {}
    };

    @Test
    void methodGetDataMustBeCalled() {
        assertDoesNotThrow(() -> this.mock.getData("ID1"));
    }

    @Test
    void methodPutDataMustBeCalled() {
        assertDoesNotThrow(() -> this.mock.putData(0));
    }

    @Test
    void methodDeleteDataMustBeCalled() {
        assertDoesNotThrow(() -> this.mock.deleteData("ID1"));
    }
}
