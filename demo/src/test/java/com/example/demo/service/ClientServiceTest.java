package com.example.demo.service;

import com.example.demo.logic.LogicAnunt;
import com.example.demo.logic.LogicClient;
import com.example.demo.model.*;
import com.example.demo.repository.AgentRepository;
import com.example.demo.repository.AnuntRepository;

import com.example.demo.repository.ClientRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;



@SpringBootTest
public class ClientServiceTest {

    @Mock
    private ClientRepository clientRepository;

    @InjectMocks
    ClientServiceImpl clientService;

    @Before
    public void setup() {
        clientService = new ClientServiceImpl();
        clientService.clientRepository = clientRepository;
    }

    @Test
    public void getClientiTest() {
        List<Client> res = new ArrayList<>();
        when(clientRepository.findAll()).thenReturn(res);

        List<Client> currentResult = clientService.getClienti();

        verify(clientRepository, times(1)).findAll();
        assertEquals(res, currentResult);

    }


    @Test
    public void addAgentTest() {
        Client client = new Client("Popa", "Mihai", "0758644329", "popmihai@yahoo.com", "mihp", "popa");
        client.setIdUser(1);
        Client cl=null;
        when(clientRepository.save(client)).thenReturn(cl);

        Client result = clientService.saveClient(client);

        verify(clientRepository, times(1)).save(client);
        assertEquals(cl, result);
        //assertThat(result.getIdAgent()).isEqualTo(anunt.getIdAgent());
    }

}