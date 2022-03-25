package com.example.demo.controller;

import com.example.demo.logic.LogicAgent;
import com.example.demo.model.Agent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Dud Larisa
 * @Since 25.03.2022
 * clasa implementeaza controllerul pentru agent
 */
@RestController
@RequestMapping("/api")
public class ControllerAgent {

    @Autowired

    private LogicAgent logicAgent;

    /**
     *metoda inserare agent
     * @param agent
     * @return returneaza un mesaj care indica daca a fost adaugat un nou agent
     */
    @PostMapping("/addAgent")
    public String add(@RequestBody Agent agent){
        logicAgent.addAgent(agent);
        return "New agent is added";
    }

    /**
     *metoda extragere agenti
     * @return lista de agenti
     *
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getAgenti")
    public List<Agent> getAgenti(){
        //  System.out.println(anuntRepository.findAll());
        return logicAgent.getAgenti();
    }

    /**
     *metoda stergere agent
     * @param idAgent
     * @return un mesaj care indica daca agentul a fost sters
     */
    @DeleteMapping("/deleteAgent/{idAgent}")
    public String delete(@PathVariable("idAgent") int idAgent){
        logicAgent.deleteAgent(idAgent);
        return "An agent was deleted";
    }


}
