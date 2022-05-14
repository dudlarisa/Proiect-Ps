package com.example.demo.repository;

import com.example.demo.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *interfata pentru agent, operatii auto-implementate de Spring
 */
public interface AgentRepository extends JpaRepository<Agent, Integer> {
}
