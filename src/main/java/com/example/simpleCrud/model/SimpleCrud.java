package com.example.simpleCrud.model;

import com.example.simpleCrud.model.exceptions.DatabaseException;

/**
 * Interfce para abstrair um CRUD simples
 * @param <I> Classe de Identificacao do objeto desejado (O)
 * @param <O> Classe do objeto desejado
 */
public interface SimpleCrud<I, O> {

    /**
     * Obtem o dado com base no identificador
     * @param id Identificador do objeto a ser buscado
     * @return Objeto desejado
     */
    O getData(I id);

    /**
     * Insere um novo objeto do banco de dados
     * @param object Novo objeto a ser inserido
     */
    void putData(O object);

    /**
     * Insere um novo objeto do banco de dados
     * @param id Identificador do objeto a ser buscado
     */
    void deleteData(I id);
}
