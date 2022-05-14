package com.example.demo.logic;

import com.example.demo.model.Anunt;
import com.example.demo.service.AnuntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 *
 */
@Controller
public class LogicAnunt {
    private final AnuntService anuntService;

    @Autowired
    public LogicAnunt(AnuntService anuntService) {
        this.anuntService = anuntService;
    }

    /**
     *
     * @param anunt
     * @return
     */
    public String addAnunt(@RequestBody Anunt anunt){
        anuntService.saveAnunt(anunt);
        return "New announcement is added";
    }

    /**
     *
     * @return
     */
    public List<Anunt> getAnunturi(){
        return anuntService.getAnunturi();
    }

    /**
     *
     * @param idAnunt
     */
    public void deleteAnunt(int idAnunt){
        anuntService.deleteAnunt(idAnunt);
    }

    /**
     *
     * @param idAnunt
     * @return
     */
    public Anunt getAnuntById(int idAnunt){
       return anuntService.getAnuntById(idAnunt);
    }

    /**
     *
     * @param tip
     * @return
     */
    public List<Anunt> getAnunturiByTipProprietate(String tip){
        return anuntService.getAnunturiByTipProprietate(tip);
    }

    /**
     *
     * @param tip
     * @return
     */
    public List<Anunt> getAnunturiByTipAnunt(String tip){
        return anuntService.getAnunturiByTipAnunt(tip);
    }

    /**
     *
     * @param locatie
     * @return
     */
    public List<Anunt> getAnunturiByLocation(String locatie){
        return anuntService.getAnunturiByLocation(locatie);
    }

    /**
     *
     * @param nrCamere
     * @return
     */
    public List<Anunt> getAnunturiByNrCamere(int nrCamere){
        return anuntService.getAnunturiByNrCamere(nrCamere);
    }

    /**
     *
     * @param pret
     * @return
     */
    public List<Anunt> getAnunturiByPret(int pret){
        return anuntService.getAnunturiByPret(pret);
    }


}
