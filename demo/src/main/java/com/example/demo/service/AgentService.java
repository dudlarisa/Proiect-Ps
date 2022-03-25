package com.example.demo.service;

import com.example.demo.model.Agent;

import java.util.List;

/**
 *
 */
public interface AgentService {

    List<Agent> getAgenti();

    public Agent saveAgent(Agent  agent);

    public void deleteAgent(int idAgent);
}
