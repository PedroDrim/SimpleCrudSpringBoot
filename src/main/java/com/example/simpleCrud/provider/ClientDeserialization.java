package com.example.simpleCrud.provider;

import com.example.simpleCrud.model.SimpleClient;
import com.example.simpleCrud.model.SimpleDeserialization;
import com.example.simpleCrud.model.exceptions.DeserializationException;

/**
 * Classe responsavel por desserializar uma string em um SimpleClient
 * @see SimpleClient
 * @see SimpleDeserialization
 */
public class ClientDeserialization implements SimpleDeserialization<SimpleClient> {

    /**
     * Desserializa uma string em um SimpleClient
     * @param value String a ser desserializado
     * @return Objeto desserializado
     */
    @Override
    public SimpleClient deserialize(String value) {
        String[] values = value.split(";");
        if(values.length != 2)
            throw new DeserializationException("Erro ao desserializar o objeto");

        return new SimpleClient(values[0], values[1]);
    }
}
