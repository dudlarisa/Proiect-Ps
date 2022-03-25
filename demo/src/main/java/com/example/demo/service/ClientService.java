package com.example.demo.service;

import com.example.demo.model.Client;

import java.util.List;


/**
 *
 */
public interface ClientService {

    List<Client> getClienti();

    public Client saveClient(Client client);

    public void deleteClient(int idClient);
}
