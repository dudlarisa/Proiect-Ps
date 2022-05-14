package com.example.demo.exemplu;

import static com.example.demo.exemplu.User.*;

public class FactoryUser {

    public BasicUser makeUser(User usertype){
        if(usertype==angajat){

            return new Angajat("Buzila", "Andra");
        }else
        if(usertype==vizitator){
            return new Vizitator("Dud","Larisa");
        }else
        if(usertype==extern){
            return new Extern("Pop","Mihai");
        }
        else
        return null;
    }
}
