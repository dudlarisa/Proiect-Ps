package com.example.demo.logic;

import com.example.demo.model.Agent;
import com.example.demo.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 *
 */
@Controller
public class LogicAgent {
    private final AgentService agentService;

    @Autowired
    public LogicAgent(AgentService agentService) {
        this.agentService = agentService;
    }

    /**
     *
     * @param agent
     * @return
     */
    public String addAgent(@RequestBody Agent agent){
        agentService.saveAgent(agent);
        return "New agent is added";
    }

    /**
     *
     * @return
     */
    public List<Agent> getAgenti(){
        return agentService.getAgenti();
    }

    /**
     *
     * @param idAgent
     */
    public void deleteAgent(int idAgent){
        agentService.deleteAgent(idAgent);
    }


}
