package com.example.demo.model;

/**
 * interfata utilizata pentru implementarea Factory Pattern
 */
public interface BasicUser {
    /**
     *
     * @return integer
     */
    int getIdUser();

    /**
     *
     * @param idUser
     */
    void setIdUser(int idUser);

    /**
     *
     * @return String
     */
     String getNume();

    /**
     *
     * @param nume
     */
     void setNume(String nume);

    /**
     *
     * @return String
     */
     String getPrenume();

    /**
     *
     * @param prenume
     */
    void setPrenume(String prenume);

    /**
     *
     * @return String
     */
     String getTelefon();

    /**
     *
     * @param telefon
     */
     void setTelefon(String telefon);

    /**
     *
     * @return String
     */
     String getEmail();

    /**
     *
     * @param email
     */
     void setEmail(String email);

    /**
     *
     * @return String
     */
     String getUsername();

    /**
     *
     * @param username
     */
     void setUsername(String username);

    /**
     *
     * @return String
     */
     String getPassword();

    /**
     *
     * @param password
     */
     void setPassword(String password);

}
