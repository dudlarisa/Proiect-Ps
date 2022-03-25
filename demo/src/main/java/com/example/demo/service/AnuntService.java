package com.example.demo.service;

import com.example.demo.model.Anunt;

import java.util.List;
import java.util.Optional;

/**
 *
 */
public interface AnuntService {

    List<Anunt> getAnunturi();

    public Anunt saveAnunt(Anunt anunt);

    public void deleteAnunt(int idAnunt);


}
