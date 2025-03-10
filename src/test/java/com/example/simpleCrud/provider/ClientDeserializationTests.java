package com.example.simpleCrud.provider;

import com.example.simpleCrud.model.SimpleClient;
import com.example.simpleCrud.model.exceptions.DatabaseException;
import com.example.simpleCrud.model.exceptions.DeserializationException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ClientDeserializationTests {

    @Test
    void mustBeInstanciable() {
        ClientDeserialization instance = new ClientDeserialization();
        assertNotNull(instance);
    }

    @Test
    void methodDeserializeMustBeCalled() {
        SimpleClient baseValue = new SimpleClient("ID1", "Teste");
        String serializable = baseValue.serialize();

        ClientDeserialization instance = new ClientDeserialization();
        SimpleClient newValue = instance.deserialize(serializable);
        assertEquals(baseValue, newValue);
    }

    @Test
    void methodDeserializeMustThrowException() {
        assertThrows(DeserializationException.class, () -> {
            ClientDeserialization instance = new ClientDeserialization();
            String serializable = "AlgumaCoisa;RidiculaDemais;ParaSerCorreto";
            SimpleClient newValue = instance.deserialize(serializable);
        });
    }
}
