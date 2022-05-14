package com.example.demo.service;

import com.example.demo.model.Anunt;

import java.util.List;
import java.util.Optional;

/**
 * interfata in care se declara metodele care se vor putea apela pe tabelul anunturi
 */
public interface AnuntService {

    /**
     *
     * @return lista anunturi
     */
    List<Anunt> getAnunturi();

    /**
     *
     * @param anunt
     * @return anunt
     */
    Anunt saveAnunt(Anunt anunt);

    /**
     *
     * @param idAnunt
     */
    void deleteAnunt(int idAnunt);

    /**
     *
     * @param idAnunt
     * @return
     */
    Anunt getAnuntById(int idAnunt);

    /**
     *
     * @param id
     * @param pret
     */
    void updatePret(int id, int pret);

    /**
     * metoda pentru filtrarea anunturilor dupa locatie
     * @param locatie
     * @return lista anunturi
     */
    List<Anunt> getAnunturiByLocation(String locatie);

    /**
     * metoda pentru filtrarea anunturilor dupa tipul locuintei
     * @param tip
     * @return lista anunturi
     */
    List<Anunt> getAnunturiByTipProprietate(String tip);

    /**
     * metoda pentru filtrarea anunturilor dupa tipul anuntului
     * @param tip
     * @return lista anunturi
     */
    List<Anunt> getAnunturiByTipAnunt(String tip);
    /**
     * metoda pentru filtrarea anunturilor dupa nr de camere
     * @param nrCamere
     * @return lista anunturi
     */
    List<Anunt> getAnunturiByNrCamere(int nrCamere);

    /**
     * metoda pentru filtrarea anunturilor dupa pret
     * @param pret
     * @return lista anunturi
     */
    List<Anunt> getAnunturiByPret(int pret);


}
