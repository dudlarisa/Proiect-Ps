package com.example.demo.service;

import com.example.demo.model.Agent;

import java.util.List;

/**
 *interfata in care se declara metodele care se vor putea apela pe tabelul agenti
 */
public interface AgentService {

    /**
     *
     * @return lista agenti
     */
    List<Agent> getAgenti();

    /**
     *
     * @param agent
     * @return Agent
     */

    public Agent saveAgent(Agent  agent);

    /**
     *
     * @param idAgent
     */

    public void deleteAgent(int idAgent);
}
