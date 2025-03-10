package com.example.simpleCrud.service;

import com.example.simpleCrud.model.SimpleClient;
import com.example.simpleCrud.model.SimpleDeserialization;
import com.example.simpleCrud.model.exceptions.DatabaseException;
import com.example.simpleCrud.provider.ClientDeserialization;
import com.example.simpleCrud.provider.CrudDefaultMap;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

/**
 * Service responsavel por gerenciar as rotas
 */
@RestController
public class DatabaseController {

    private final CrudDefaultMap crudManager;

    public DatabaseController() {
        SimpleDeserialization<SimpleClient> simpleDeserialization = new ClientDeserialization();
        this.crudManager = new CrudDefaultMap(simpleDeserialization);
    }

    /**
     * Metodo http GET /client
     * @param clientId  Identificador do cliente a ser verificado
     * @throws DatabaseException Excessao de request
     * @return Cliente selecionado
     */
    @GetMapping("/client")
    public SimpleClient getCLient(@RequestBody String clientId) throws DatabaseException {
        try {
            clientId = clientId.replaceAll("\"", "");
            return this.crudManager.getData(clientId);
        } catch (DatabaseException e) {
            throw new ResponseStatusException(HttpStatusCode.valueOf(400));
        }
    }

    /**
     * Metodo http POST /client
     * @param newClient Cliente a ser adicionado
     * @throws DatabaseException Excessao de request
     */
    @PostMapping("/client")
    public void postClient(@RequestBody SimpleClient newClient) throws DatabaseException {
        try {
            this.crudManager.putData(newClient);
        } catch (DatabaseException e) {
            throw new ResponseStatusException(HttpStatusCode.valueOf(400));
        }
    }

    /**
     * Metodo http DELETE /client
     * @param clientId Identificador do cliente a ser removido
     * @throws DatabaseException Excessao de request
     */
    @DeleteMapping("/client")
    public void deleteClient(@RequestBody String clientId) throws DatabaseException {
        clientId = clientId.replaceAll("\"", "");
        this.crudManager.deleteData(clientId);
    }
}