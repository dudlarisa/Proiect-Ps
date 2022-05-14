package com.example.demo.controller;

import com.example.demo.logic.LogicAdmin;
import com.example.demo.model.Administrator;

import com.example.demo.model.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * clasa implementeaza controllerul pentru administrator
 * @Author Dud Larisa
 * @Since 25.03.2022
 *
 */
@RestController
@RequestMapping("/api")
public class ControllerAdmin{

    @Autowired

    private LogicAdmin logicAdmin;

    /**
     * metoda adaugare admin
     * @param admin
     * @return returneaza un mesaj care indica daca a fost adaugat un nou admin
     */
    @PostMapping("/addAdmin")
    public String add(@RequestBody Administrator admin){
        logicAdmin.addAdmin(admin);
        return "New admin is added in db";
    }

    /**
     *metoda extragere admini
     * @return lista de admini
     *
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getAdmini")
    public List<Administrator> getAdmini(){
        return logicAdmin.getAdmini();
    }

    /**
     *metoda stergere admin
     * @param idAdmin
     * @return un mesaj care indica daca adminul a fost sters
     */
    @DeleteMapping("/deleteAdmin/{idAdmin}")
    public String delete(@PathVariable("idAdmin") int idAdmin){
        logicAdmin.deleteAdmin(idAdmin);
        return "An admin was deleted from db";
    }




}