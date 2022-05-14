package com.example.demo.controller;
import com.example.demo.logic.LogicClient;
import com.example.demo.model.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * clasa implementeaza controllerul pentru client
 * @Author Dud Larisa
 * @Since 25.03.2022
 *
 */
@RestController
@RequestMapping("/api")
public class ControllerClient {

    @Autowired

    private LogicClient logicClient;

    /**
     *
     * @param client
     * @return returneaza un mesaj care indica daca a fost adaugat un nou client
     */
    @PostMapping("/addClient")
    public String add(@RequestBody Client client){
        logicClient.addClient(client);
        return "New client is added in db";
    }

    /**
     *
     * @return lista de clienti
     *
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getClienti")
    public List<Client> getClienti(){
        return logicClient.getClienti();
    }

    /**
     *
     * @param idClient
     * @return un mesaj care indica daca clientul a fost sters din baza de date
     */
    @DeleteMapping("/deleteClient/{idClient}")
    public String delete(@PathVariable("idClient") int idClient){
        logicClient.deleteClient(idClient);
        return "An client was deleted from db";
    }


}