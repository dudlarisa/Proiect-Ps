package com.example.demo.service;

import com.example.demo.model.*;


import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.ClientRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


/**
 * teste metode admin
 */
@SpringBootTest
public class AdminServiceTests {

    @Mock
    private AdminRepository adminRepository;

    @InjectMocks
    AdminServiceImpl adminService;

    /**
     * setup before test
     */
    @Before
    public void setup() {
        adminService = new AdminServiceImpl();
        adminService.adminRepository = adminRepository;
    }

    /**
     * test metoda getAdmini
     */
    @Test
    public void getAdminiTest() {
        List<Administrator> res = new ArrayList<>();
        when(adminRepository.findAll()).thenReturn(res);

        List<Administrator> currentResult = adminService.getAdmini();

        verify(adminRepository, times(1)).findAll();
        assertEquals(res, currentResult);

    }

    /**
     * teste add admin
     */
    @Test
    public void addAdminTest() {
        Administrator admin = new Administrator("Popa", "Mihai", "0758644329", "popmihai@yahoo.com", "mihp", "popa");
        admin.setIdUser(1);
        Administrator adm=null;
        when(adminRepository.save(admin)).thenReturn(adm);

        Administrator result = adminService.saveAdmin(admin);

        verify(adminRepository, times(1)).save(admin);
        assertEquals(adm, result);
        //assertThat(result.getIdAgent()).isEqualTo(anunt.getIdAgent());
    }

}