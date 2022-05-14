package com.example.demo.service;

import com.example.demo.logic.LogicAnunt;
import com.example.demo.logic.LogicClient;
import com.example.demo.model.*;
import com.example.demo.repository.AgentRepository;
import com.example.demo.repository.AnuntRepository;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


/**
 * teste metode agent
 */
@SpringBootTest
public class AgentServiceTests {

    @Mock
    private AgentRepository agentRepository;

    @InjectMocks
    AgentServiceImpl agentService;

    /**
     * setup inainte de test
     */
    @Before
    public void setup() {
        agentService = new AgentServiceImpl();
        agentService.agentRepository = agentRepository;
    }

    /**
     * test getAgenti
     */
    @Test
    public void getAgentiTest() {
        List<Agent> res = new ArrayList<>();
        when(agentRepository.findAll()).thenReturn(res);

        List<Agent> currentResult = agentService.getAgenti();

        verify(agentRepository, times(1)).findAll();
        assertEquals(res, currentResult);

    }


    /**
     * test addAgent
     */
    @Test
    public void addAgentTest(){
        Agent agent = new Agent("Popa","Mihai","0758644329","popmihai@yahoo.com","mihp","popa");
        agent.setIdUser(1);

        when(agentRepository.save(any())).thenReturn(agent);

        Agent result = agentService.saveAgent(agent);

        verify(agentRepository, times(1)).save((any()));
        assertEquals(agent, result);
        //assertThat(result.getIdAgent()).isEqualTo(anunt.getIdAgent());
    }









}
