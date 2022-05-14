package com.example.demo.service;

import com.example.demo.model.Administrator;

import java.util.List;

/**
 * interfata in care se declara metodele care se vor putea apela pe tabelul administratori
 */
public interface AdminService {

    /**
     *
     * @return lista admini
     */
    List<Administrator> getAdmini();

    /**
     *
     * @param admin
     * @return Administrator
     */

    public Administrator saveAdmin(Administrator  admin);

    /**
     *
     * @param idAdmin
     */
    public void deleteAdmin(int idAdmin);
}
