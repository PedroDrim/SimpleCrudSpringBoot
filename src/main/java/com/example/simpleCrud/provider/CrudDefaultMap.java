package com.example.simpleCrud.provider;

import com.example.simpleCrud.model.SimpleClient;
import com.example.simpleCrud.model.SimpleCrud;
import com.example.simpleCrud.model.SimpleDeserialization;
import com.example.simpleCrud.model.exceptions.DatabaseException;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe responsavel por gerenciar um simples CRUD em Map java
 * @see SimpleCrud
 * @see SimpleClient
 */
public class CrudDefaultMap implements SimpleCrud<String, SimpleClient> {

    /**
     * Desserializador a ser utilizado
     * @see SimpleDeserialization
     */
    private final SimpleDeserialization<SimpleClient> clientSimpleDeserialization;

    /**
     * Mapa que servira de banco de dados em memoria
     */
    private Map<String, String> database;

    /**
     * Construtor publico da classe
     * @param clientDeserialization Referencia do desserializador a ser utilizado
     */
    public CrudDefaultMap(SimpleDeserialization<SimpleClient> clientDeserialization) {
        this.clientSimpleDeserialization = clientDeserialization;
        this.database = new HashMap<>();
    }

    /**
     * Reinicia o banco de dados
     */
    public void reset() {
        this.database = new HashMap<>();
    }

    /**
     * Obtem o dado com base no identificador
     * @param id Identificador do objeto a ser buscado
     * @throws DatabaseException Excecao do banco de dados
     * @return Objeto desejado
     */
    @Override
    public SimpleClient getData(String id) {
        if (!this.database.containsKey(id))
            throw new DatabaseException("Identificador nao encontrado no banco de dados");

        String simpleClient = this.database.get(id);
        return this.clientSimpleDeserialization.deserialize(simpleClient);
    }

    /**
     * Insere um novo objeto do banco de dados
     * @param object Novo objeto a ser inserido
     * @throws DatabaseException Excecao do banco de dados
     */
    @Override
    public void putData(SimpleClient object) {
        if (object == null)
            throw new DatabaseException("Valor vazio");

        this.database.put(object.cadastroId(), object.serialize());
    }

    /**
     * Insere um novo objeto do banco de dados
     * @param id Identificador do objeto a ser buscado
     * @throws DatabaseException Excecao do banco de dados
     */
    @Override
    public void deleteData(String id) {
        if (!this.database.containsKey(id))
            throw new DatabaseException("Identificador nao encontrado no banco de dados");

        this.database.remove(id);
    }
}
