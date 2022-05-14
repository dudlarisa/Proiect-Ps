package com.example.demo.service;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * clasa care implementeaza logica metodelor din interfata clientului
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    /**
     * metoda care extrage toti clientii din tabel si returneaza o lista cu acestia
     * @return lista clienti
     */
    @Override
    public List<Client> getClienti() {
        return clientRepository.findAll();
    }

    /**
     * metoda care insereaza in tabel un client nou
     * @param client
     * @return client
     */
    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    /**
     * metoda care sterge dupa id un client
     * @param idClient
     */
    @Override
    public void deleteClient(int idClient) {

        clientRepository.deleteById(idClient);
    }


}