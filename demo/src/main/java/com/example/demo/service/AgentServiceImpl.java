package com.example.demo.service;

import com.example.demo.model.Agent;
import com.example.demo.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgentServiceImpl implements AgentService {

    @Autowired
    AgentRepository agentRepository;

    @Override
    public List<Agent> getAgenti() {
        return agentRepository.findAll();
    }

    @Override
    public Agent saveAgent(Agent agent) {
        return agentRepository.save(agent);
    }

    @Override
    public void deleteAgent(int idAgent) {

        agentRepository.deleteById(idAgent);
    }


}