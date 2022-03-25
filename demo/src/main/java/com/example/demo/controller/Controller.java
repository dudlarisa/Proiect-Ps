package com.example.demo.controller;


import com.example.demo.logic.LogicAnunt;
import com.example.demo.model.Anunt;
import com.example.demo.repository.AnuntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Dud Larisa
 * @Since 25.03.2022
 * clasa care implementeaza controllerul pentru anunturi
 */
@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    //private AnuntRepository anuntRepository;
    private LogicAnunt logicAnunt;

    /**
     *metoda adaugare anunt
     * @param anunt
     * @return returneaza un mesaj care indica daca a fost adaugat un nou anunt
     */
    @PostMapping("/addAnunt")
    public String add(@RequestBody Anunt anunt){
        logicAnunt.addAnunt(anunt);
        return "New announcement is added in db";
    }

    /**
     *metoda extragere anunturi
     * @return lista de anunturi
     */

    @RequestMapping(method = RequestMethod.GET, value = "/getAnunturi")
    public List<Anunt> getAnunturi(){
        return logicAnunt.getAnunturi();
    }

    /**
     *
     *metoda stergere anunt
     * @param idAnunt
     * @return un mesaj care indica daca anuntul a fost sters
     */
    @DeleteMapping("/deleteAnunt/{idAnunt}")
    public String delete(@PathVariable("idAnunt") int idAnunt){
        logicAnunt.deleteAnunt(idAnunt);
        return "An announcement was deleted from db";
    }


}
