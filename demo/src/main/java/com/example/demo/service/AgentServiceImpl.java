package com.example.demo.service;

import com.example.demo.model.Agent;
import com.example.demo.repository.AgentRepo;
import com.example.demo.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * clasa care implementeaza logica metodelor din interfata agentului
 */
@Service
public class AgentServiceImpl implements AgentService {

    @Autowired
    AgentRepository agentRepository;


    /**
     * metoda care extrage toti agentii din tabel si returneaza o lista cu acestia
     * @return lista agenti
     */
    @Override
    public List<Agent> getAgenti() {
        return agentRepository.findAll();
    }

    /**
     * metoda care insereaza in tabel un agent nou
     * @param agent
     * @return agent
     */
    @Override
    public Agent saveAgent(Agent agent) {
        return agentRepository.save(agent);
    }

    /**
     * metoda care sterge dupa id un agent
     * @param idAgent
     */
    @Override
    public void deleteAgent(int idAgent) {

        agentRepository.deleteById(idAgent);
    }


}