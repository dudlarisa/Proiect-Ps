package com.example.demo.logic;

import com.example.demo.model.Anunt;
import com.example.demo.service.AnuntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class LogicAnunt {
    private final AnuntService anuntService;

    @Autowired
    public LogicAnunt(AnuntService anuntService) {
        this.anuntService = anuntService;
    }

    public String addAnunt(@RequestBody Anunt anunt){
        anuntService.saveAnunt(anunt);
        return "New announcement is added";
    }

    public List<Anunt> getAnunturi(){
        return anuntService.getAnunturi();
    }

    public void deleteAnunt(int idAnunt){
        anuntService.deleteAnunt(idAnunt);
    }


}
