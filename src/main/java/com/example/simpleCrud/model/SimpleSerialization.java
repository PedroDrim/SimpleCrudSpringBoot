package com.example.simpleCrud.model;

/**
 * Interface para abstracao de uma serializacao simples
 */
public interface SimpleSerialization {
    /**
     * Serializa o objeto em uma String
     * @return String contendo o objeto serializado
     */
    String serialize();
}
