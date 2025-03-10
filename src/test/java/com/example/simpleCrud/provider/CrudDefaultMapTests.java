package com.example.simpleCrud.provider;

import com.example.simpleCrud.model.SimpleClient;
import com.example.simpleCrud.model.SimpleDeserialization;
import com.example.simpleCrud.model.SimpleSerialization;
import com.example.simpleCrud.model.exceptions.DatabaseException;
import com.example.simpleCrud.model.exceptions.DeserializationException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
public class CrudDefaultMapTests {

    private static CrudDefaultMap instance;

    @BeforeAll
    static void initMap() {
        SimpleDeserialization<SimpleClient> simpleSerialization = new ClientDeserialization();
        instance = new CrudDefaultMap(simpleSerialization);
    }

    @BeforeEach
    void clearMap() {
        instance.reset();
    }

    @Test
    void mustBeInstanciable() {
        assertNotNull(instance);
    }

    @Test
    void methodResetMustBeCalled() {
        assertDoesNotThrow(() -> instance.reset());
    }

    @Test
    void methodGetData() {
        String id = "ID1";
        SimpleClient client = new SimpleClient(id, "Teste");
        instance.putData(client);

        SimpleClient newClient = instance.getData(id);
        assertEquals(client, newClient);
    }

    @Test
    void methodGetDataMustThrowException() {
        assertThrows(DatabaseException.class, () -> {
            String id = "ID1";
            SimpleClient newClient = instance.getData(id);
        });
    }

    @Test
    void methodPutData() {
        String id = "ID1";
        SimpleClient client = new SimpleClient(id, "Teste");
        assertDoesNotThrow(() -> instance.putData(client));
    }

    @Test
    void methodPutDataMustThrowException() {
        assertThrows(DatabaseException.class, () -> instance.putData(null));
    }

    @Test
    void methodDeleteData() {
        String id = "ID1";
        SimpleClient client = new SimpleClient(id, "Teste");
        instance.putData(client);

        assertDoesNotThrow(() -> instance.deleteData(id));
    }

    @Test
    void methodDeleteDataMustThrowException() {
        String id = "ID1";
        assertThrows(DatabaseException.class, () -> instance.deleteData(id));
    }
}
