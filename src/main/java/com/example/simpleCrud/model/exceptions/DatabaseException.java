package com.example.simpleCrud.model.exceptions;

/**
 * Excecao referente a erros do banco de dados
 */
public class DatabaseException extends RuntimeException {

    /**
     * Construtor publico da classe
     * @param message Mensagem de erro
     */
    public DatabaseException(String message) {
        super(message);
    }
}
