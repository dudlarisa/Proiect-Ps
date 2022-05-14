package com.example.demo.repository;

import com.example.demo.model.Administrator;
import com.example.demo.model.BasicUser;
import com.example.demo.model.EnumUser;
import com.example.demo.model.FactoryUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class AnuntRepositoryTests {

    //@Mock
    //BasicUser basicUser1;
    //BasicUser basicUser2;

    /**
     *
     */
    @Test
    public void createAdminTest(){

        FactoryUser userFactory = new FactoryUser("Popa","Raul","0729304567","poparaul@gmail.com","poparaul","raulp");
        BasicUser basicUser1 = userFactory.createUser(EnumUser.Administrator);
        Administrator admin = new Administrator("Popa","Raul","0729304567","poparaul@gmail.com","poparaul","raulp");
        assertEquals( admin.getUsername(), basicUser1.getUsername());
        assertEquals( admin.getEmail(), basicUser1.getEmail());
        assertEquals (admin.getNume(), basicUser1.getNume());
        assertEquals( admin.getPrenume(), basicUser1.getPrenume());
        assertEquals( admin.getPassword(), basicUser1.getPassword());
        assertEquals( admin.getTelefon(), basicUser1.getTelefon());

    }

}
