package com.example.demo.service;

import com.example.demo.model.Anunt;
import com.example.demo.repository.AnuntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *clasa care implementeaza logica metodelor din interfata anunturilor
 */
@Service
public class AnuntServiceImpl implements AnuntService {

    @Autowired
    AnuntRepository anuntRepository;

    /**
     *metoda care extrage toate anunturile din tabel si returneaza o lista cu acestea
     * @return lista anunturi
     */
    @Override
    public List<Anunt> getAnunturi() {
        return anuntRepository.findAll();
    }

    /**
     *metoda care insereaza in tabel un anunt nou
     * @param anunt
     * @return anunt
     */
    @Override
    public Anunt saveAnunt(Anunt anunt) {
        return anuntRepository.save(anunt);
    }

    /**
     *metoda care sterge dupa id un anunt
     * @param idAnunt
     */
    @Override
    public void deleteAnunt(int idAnunt) {

        anuntRepository.deleteById(idAnunt);
    }

    /**
     *
     * @param idAnunt
     * @return anunt
     */
    @Override
    public Anunt getAnuntById(int idAnunt) {
        return anuntRepository.findById(idAnunt).get();
    }

    /**
     *
     * @param id
     * @param pret
     */
    @Override
    public void updatePret(int id, int pret) {
        Anunt anunt=anuntRepository.findById(id).get();
        anunt.setPret(pret);
        anuntRepository.save(anunt);
    }

    /**
     *
     * @param locatie
     * @return lista anunturi
     */
    @Override
    public List<Anunt> getAnunturiByLocation(String locatie) {
        List<Anunt> anunturi=new ArrayList<>();
        for(Anunt anunt: anuntRepository.findAll()){
            if(anunt.getLocatie().equals(locatie)){
                anunturi.add(anunt);
            }
        }
        return anunturi;
    }

    /**
     *
     * @param tip
     * @return lista anunturi
     */
    @Override
    public List<Anunt> getAnunturiByTipProprietate(String tip) {
        List<Anunt> anunturi=new ArrayList<>();
        for(Anunt anunt: anuntRepository.findAll()){
            if(anunt.getTipProprietate().equals(tip)){
                anunturi.add(anunt);
            }
        }
        return anunturi;
    }

    /**
     *
     * @param tip
     * @return lista anunturi
     */
    @Override
    public List<Anunt> getAnunturiByTipAnunt(String tip) {
        List<Anunt> anunturi=new ArrayList<>();
        for(Anunt anunt: anuntRepository.findAll()){
            if(anunt.getTipAnunt().equals(tip)){
                anunturi.add(anunt);
            }
        }
        return anunturi;
    }


    /**
     *
     * @param nrCamere
     * @return lista anunturi
     */
    @Override
    public List<Anunt> getAnunturiByNrCamere(int nrCamere) {
        List<Anunt> anunturi=new ArrayList<>();
        for(Anunt anunt: anuntRepository.findAll()){
            if(anunt.getNrCamere()==nrCamere){
                anunturi.add(anunt);
            }
        }
        return anunturi;
    }

    /**
     *
     * @param pret
     * @return lista anunturi
     */
    @Override
    public List<Anunt> getAnunturiByPret(int pret) {
        List<Anunt> anunturi=new ArrayList<>();
        for(Anunt anunt: anuntRepository.findAll()){
            if(anunt.getPret()==pret){
                anunturi.add(anunt);
            }
        }
        return anunturi;
    }


}
