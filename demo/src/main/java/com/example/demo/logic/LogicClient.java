package com.example.demo.logic;

import com.example.demo.model.Client;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class LogicClient {
    private final ClientService clientService;

    @Autowired
    public LogicClient(ClientService clientService) {
        this.clientService = clientService;
    }

    public String addClient(@RequestBody Client client){
        clientService.saveClient(client);
        return "New client is added";
    }

    public List<Client> getClienti(){
        return clientService.getClienti();
    }

    public void deleteClient(int idClient){
        clientService.deleteClient(idClient);
    }


}
