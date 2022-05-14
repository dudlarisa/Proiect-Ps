package com.example.demo.repository;

import com.example.demo.model.Agent;

import java.util.List;

public interface AgentRepo {

    List<Agent> findAll();
    Agent save(Agent agent);
    void deleteById(int id);
}
