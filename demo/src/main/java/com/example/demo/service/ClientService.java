package com.example.demo.service;

import com.example.demo.model.Client;

import java.util.List;


/**
 *interfata in care se declara metodele care se vor putea apela pe tabelul clienti
 */
public interface ClientService {

    /**
     *
     * @return lista clienti
     */
    List<Client> getClienti();

    /**
     *
     * @param client
     * @return Client
     */

    public Client saveClient(Client client);

    /**
     *
     * @param idClient
     */

    public void deleteClient(int idClient);
}
