package com.example.demo.controller;


import com.example.demo.logic.LogicAnunt;
import com.example.demo.model.Anunt;
import com.example.demo.repository.AnuntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * clasa care implementeaza controllerul pentru anunturi
 * @Author Dud Larisa
 * @Since 25.03.2022
 *
 */
@RestController
@RequestMapping("/api")
public class ControllerAnunt {

    @Autowired
    //private AnuntRepository anuntRepository;
    private LogicAnunt logicAnunt;

    /**
     * metoda adaugare anunt
     * @param anunt
     * @return returneaza un mesaj care indica daca a fost adaugat un nou anunt
     */
    @PostMapping("/addAnunt")
    public String add(@RequestBody Anunt anunt){
        logicAnunt.addAnunt(anunt);
        return "New announcement is added in db";
    }

    /**
     * metoda extragere anunturi
     * @return lista de anunturi
     */

    @RequestMapping(method = RequestMethod.GET, value = "/getAnunturi")
    public List<Anunt> getAnunturi(){
        return logicAnunt.getAnunturi();
    }

    /**
     * metoda filtrare anunturi dupa numarul de camere
     * @param nrCamere
     * @return lista de anunturi
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getAnunturi/nrCamere/{nrCamere}")
    public List<Anunt> getAnunturiByNrCamere(@PathVariable("nrCamere") int nrCamere){
        return logicAnunt.getAnunturiByNrCamere(nrCamere);
    }

    /**
     *metoda filtrare anunturi dupa tipul proprietatii
     * @param tip
     * @return lista de anunturi
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getAnunturi/tipProprietate/{tip}")
    public List<Anunt> getAnunturiByTipProp(@PathVariable("tip") String tip){
        return logicAnunt.getAnunturiByTipProprietate(tip);
    }

    /**
     *metoda filtrare anunturi dupa pret
     * @param pret
     * @return lista de anunturi
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getAnunturi/pret/{pret}")
    public List<Anunt> getAnunturiByPret(@PathVariable("pret") int pret){
        return logicAnunt.getAnunturiByPret(pret);
    }

    /**
     *metoda filtrare anunturi dupa tipul anuntului
     * @param tip
     * @return lista de anunturi
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getAnunturi/tipAnunt/{tip}")
    public List<Anunt> getAnunturiByTipAnunt(@PathVariable("tip") String tip){
        return logicAnunt.getAnunturiByTipAnunt(tip);
    }

    /**
     *metoda filtrare anunturi dupa locatie
     * @param locatie
     * @return lista de anunturi
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getAnunturi/locatie/{locatie}")
    public List<Anunt> getAnunturiByLocation(@PathVariable("locatie") String locatie){
        return logicAnunt.getAnunturiByLocation(locatie);
    }

    /**
     * metoda stergere anunt
     * @param idAnunt
     * @return un mesaj care indica daca anuntul a fost sters
     */
    @DeleteMapping("/deleteAnunt/{idAnunt}")
    public String delete(@PathVariable("idAnunt") int idAnunt){
        logicAnunt.deleteAnunt(idAnunt);
        return "An announcement was deleted from db";
    }


}
