package com.example.demo.service;

import com.example.demo.model.Administrator;
import com.example.demo.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * clasa care implementeaza logica metodelor din interfata administratorului
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    /**
     * metoda care extrage toti administratorii din tabel si returneaza o lista cu acestia
     * @return lista de administratori
     */
    @Override
    public List<Administrator> getAdmini() {
        return adminRepository.findAll();
    }

    /**
     * metoda care insereaza in tabel un administrator nou
     * @param admin
     * @return
     */
    @Override
    public Administrator saveAdmin(Administrator admin) {
        return adminRepository.save(admin);
    }

    /**
     * metoda care sterge dupa id un administrator
     * @param idAdmin
     */
    @Override
    public void deleteAdmin(int idAdmin) {

        adminRepository.deleteById(idAdmin);
    }


}