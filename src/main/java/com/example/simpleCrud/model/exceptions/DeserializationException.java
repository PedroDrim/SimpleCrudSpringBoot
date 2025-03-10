package com.example.simpleCrud.model.exceptions;

/**
 * Excecao referente a erros de desserializacao
 */
public class DeserializationException extends RuntimeException {

    /**
     * Construtor publico da classe
     * @param message Mensagem de erro
     */
    public DeserializationException(String message) {
        super(message);
    }
}
