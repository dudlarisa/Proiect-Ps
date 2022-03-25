package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "anunturi")
/**
 * clasa pentru obiectele din tabelul anunturi
 */
public class Anunt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_anunt")
    private int idAnunt;

    @Column(name = "id_agent")
    private int idAgent;

    @Column(name = "tip_anunt")
    private String tipAnunt;

    @Column(name = "tip_proprietate")
    private String tipProprietate;

    @Column(name = "locatie")
    private String locatie;

    @Column(name = "nr_camere")
    private int nrCamere;

    @Column(name = "suprafata")
    private int suprafata;

    @Column(name = "pret")
    private int pret;

    public Anunt(){

    }

    public Anunt(int idAgent, String tipAnunt,String tipProprietate, String locatie, int nrCamere, int suprafata, int pret){
        this.idAgent=idAgent;
        this.tipAnunt=tipAnunt;
        this.tipProprietate=tipProprietate;
        this.locatie=locatie;
        this.nrCamere=nrCamere;
        this.suprafata=suprafata;
        this.pret=pret;
    }

    public int getIdAnunt() {
        return idAnunt;
    }

    public int getIdAgent() {
        return idAgent;
    }

    public String getTipAnunt() {
        return tipAnunt;
    }

    public String getTipProprietate() {
        return tipProprietate;
    }

    public String getLocatie() {
        return locatie;
    }

    public int getNrCamere() {
        return nrCamere;
    }

    public int getSuprafata() {
        return suprafata;
    }

    public int getPret() {
        return pret;
    }

    public void setIdAnunt(int idAnunt) {
        this.idAnunt = idAnunt;
    }

    public void setIdAgent(int idAgent) {
        this.idAgent = idAgent;
    }

    public void setTipAnunt(String tipAnunt) {
        this.tipAnunt = tipAnunt;
    }

    public void setTipProprietate(String tipProprietate) {
        this.tipProprietate = tipProprietate;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public void setNrCamere(int nrCamere) {
        this.nrCamere = nrCamere;
    }

    public void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
}
