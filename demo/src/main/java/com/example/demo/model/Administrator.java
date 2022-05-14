package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table(name = "administratori")
/**
 * clasa pentru obiectele din tabelul administratori
 */
public class Administrator implements BasicUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_administrator")
    private int idAgent;

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


    public Administrator() {

    }

    public Administrator(String nume,String prenume, String telefon, String email, String username, String password){
        this.nume=nume;
        this.prenume=prenume;
        this.telefon=telefon;
        this.email=email;
        this.username=username;
        this.password=password;

    }

    /**
     *
     * @return id
     */
    public int getIdUser() {
        return idAgent;
    }

    /**
     *
     * @param idAgent
     */
    public void setIdUser(int idAgent) {
        this.idAgent = idAgent;
    }

    /**
     *
     * @return nume
     */
    public String getNume() {
        return nume;
    }

    /**
     *
     * @param nume
     */
    public void setNume(String nume) {
        this.nume = nume;
    }

    /**
     *
     * @return prenume
     */
    public String getPrenume() {
        return prenume;
    }

    /**
     *
     * @param prenume
     */
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    /**
     *
     * @return telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     *
     * @param telefon
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}