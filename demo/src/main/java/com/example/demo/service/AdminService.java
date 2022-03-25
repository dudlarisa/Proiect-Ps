package com.example.demo.service;

import com.example.demo.model.Administrator;

import java.util.List;

/**
 *
 */
public interface AdminService {

    List<Administrator> getAdmini();

    public Administrator saveAdmin(Administrator  admin);

    public void deleteAdmin(int idAdmin);
}
