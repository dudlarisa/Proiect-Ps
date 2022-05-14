package com.example.demo.repository;


import com.example.demo.model.Agent;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.abs;

@Repository
public class AgentMockRepo implements  AgentRepo
{
    /**
     * The Agents.
     */
    public List<Agent> agents;

    /**
     * Instantiates a new Agent data repository.
     */
    public AgentMockRepo() {
        agents = new ArrayList<Agent>();
    }

    /**
     * Find all list.
     *
     * @return the list of agents
     */
    public List<Agent> findAll()
    {
        return agents;
    }

    /**
     * Save Agent.
     *
     * @param agent
     * @return the agent
     */
    public Agent save(Agent agent)
    {
        Random rand = new Random();
        agent.setIdUser(abs(rand.nextInt()));
        agents.add(agent);
        return agent;
    }

    /**
     * Delete.
     *
     * @param id the id
     */
    public void deleteById(int id)
    {
        Agent Agent = new Agent();
        for(Agent i : agents)
        {
            if(i.getIdUser() == id)
                Agent = i;
        }
        agents.remove(Agent);
    }

}

