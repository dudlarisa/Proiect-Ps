package com.example.demo.logic;

import com.example.demo.model.Administrator;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 *
 */
@Controller
public class LogicAdmin {
    private final AdminService adminService;

    @Autowired
    /**
     *
     */
    public LogicAdmin(AdminService adminService) {
        this.adminService = adminService;
    }

    /**
     *
     * @param admin
     * @return
     */
    public String addAdmin(@RequestBody Administrator admin){
        adminService.saveAdmin(admin);
        return "New admin is added";
    }

    /**
     *
     * @return
     */

    public List<Administrator> getAdmini(){
        return adminService.getAdmini();
    }

    public void deleteAdmin(int idAdmin){
        adminService.deleteAdmin(idAdmin);
    }


}