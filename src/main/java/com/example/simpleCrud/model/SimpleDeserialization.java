package com.example.simpleCrud.model;

/**
 * Interface de abstracao da desserializacao de um objeto T
 * @param <T> Tipo do objeto a ser desserializado
 */
public interface SimpleDeserialization<T> {

    /**
     * Desserializa uma String para um objeto T
     * @param value String contendo T serializado
     * @return Obteto desserializado
     */
    T deserialize(String value);
}
