package com.example.simpleCrud.model;

/**
 * Classe de dados de um cliente simples
 * @param cadastroId Identificador do usuario
 * @param nomeCliente Nome do cliente
 * @see SimpleSerialization
 */
public record SimpleClient(String cadastroId, String nomeCliente) implements SimpleSerialization {

    /**
     * Serializa o objeto em uma String
     * @return String contendo o objeto serializado
     */
    @Override
    public String serialize() {
        StringBuilder builder = new StringBuilder();
        builder.append(cadastroId).append(';'). append(nomeCliente);
        return builder.toString();
    }
}