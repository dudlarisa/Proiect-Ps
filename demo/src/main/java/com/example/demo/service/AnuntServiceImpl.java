package com.example.demo.service;

import com.example.demo.model.Anunt;
import com.example.demo.repository.AnuntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnuntServiceImpl implements AnuntService {

    @Autowired
    AnuntRepository anuntRepository;

    @Override
    public List<Anunt> getAnunturi() {
        return anuntRepository.findAll();
    }

    @Override
    public Anunt saveAnunt(Anunt anunt) {
        return anuntRepository.save(anunt);
    }

    @Override
    public void deleteAnunt(int idAnunt) {

        anuntRepository.deleteById(idAnunt);
    }


}
