package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "clienti")
/**
 * clasa pentru obiectele din tabelul clienti
 */
public class Client implements BasicUser{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_client")
    private int idClient;

    @Column(name = "nume")
    private String nume;

    @Column(name = "prenume")
    private String prenume;

    @Column(name = "telefon")
    private String telefon;

    @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;


    public Client() {

    }

    public Client(String nume,String prenume, String telefon, String email,  String username, String password){
        this.nume=nume;
        this.prenume=prenume;
        this.telefon=telefon;
        this.email=email;
        this.username=username;
        this.password=password;

    }

    public int getIdUser() {
        return idClient;
    }

    public void setIdUser(int idClient) {
        this.idClient= idClient;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setEmail(String email) {

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}