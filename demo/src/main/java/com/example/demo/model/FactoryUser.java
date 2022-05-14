package com.example.demo.model;

public class FactoryUser {

    private int idUser;
    private String nume;
    private String prenume;
    private String telefon;
    private String email;
    private String username;
    private String password;

    /**
     * constructor
     * @param nume
     * @param prenume
     * @param telefon
     * @param email
     * @param username
     * @param password
     */
    public FactoryUser(String nume, String prenume, String telefon, String email, String username, String password) {

        this.nume=nume;
        this.prenume=prenume;
        this.telefon=telefon;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    /**
     * metoda creaza un user de tipul  valoarii din enum data ca si parametru
     * @param e
     * @return BasicUser
     */
    public BasicUser createUser(EnumUser e) {
        BasicUser user;
        if (e == EnumUser.Administrator) {
            user = new Administrator(nume, prenume, telefon, email, username,password);
            return user;
        } else if (e == EnumUser.Agent) {
            user = new Agent(nume, prenume, telefon, email, username,password);
            return user;
        } else if (e == EnumUser.Client) {
            user = new Client(nume, prenume, telefon, email, username,password);
            return user;
        }
        return null;
    }

}
