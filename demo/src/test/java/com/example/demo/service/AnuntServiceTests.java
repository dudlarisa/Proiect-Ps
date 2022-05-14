package com.example.demo.service;


import com.example.demo.logic.LogicAnunt;
import com.example.demo.logic.LogicClient;
import com.example.demo.model.*;
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



@SpringBootTest
public class AnuntServiceTests {

    @Mock
    private AnuntRepository anuntRepository;

    @Mock
    LogicClient logicClient;

    @Mock
    LogicAnunt logicAnunt;

    @InjectMocks
    AnuntServiceImpl anuntService;

    @Before
    public void setup() {
        anuntService = new AnuntServiceImpl();
        anuntService.anuntRepository = anuntRepository;
    }

    @Test
    public void getAnunturiTest() {
        List<Anunt> res = new ArrayList<>();
        when(anuntRepository.findAll()).thenReturn(res);

        List<Anunt> currentResult = anuntService.getAnunturi();

        verify(anuntRepository, times(1)).findAll();
        assertEquals(res, currentResult);

    }




    @Test
    public void getAnunturiByNrCamereTest() {
        List<Anunt> res = new ArrayList<>();
        when(anuntRepository.findAll()).thenReturn(res);

        List<Anunt> currentResult = anuntService.getAnunturi();

        verify(anuntRepository, times(1)).findAll();
        assertEquals(res, currentResult);

    }

    @Test
    public void addAnuntTest(){
        Anunt anunt = new Anunt(2,"inchiriere","apartament","Marasti", 2,70, 400);
        anunt.setIdAnunt(1);

        when(anuntRepository.save(any())).thenReturn(anunt);

        Anunt result = anuntService.saveAnunt(anunt);

        verify(anuntRepository, times(1)).save((any()));
        assertEquals(anunt, result);
        //assertThat(result.getIdAgent()).isEqualTo(anunt.getIdAgent());
    }

    @Test
    public void deleteAnuntByIdTest(){
        Anunt anunt = new Anunt(2,"inchiriere","apartament","Marasti", 2,70, 400);
        anunt.setIdAnunt(1);
        anuntService.deleteAnunt(1);

        //assertThat(anunt.get()).isEqualTo("nume");
    }







}
