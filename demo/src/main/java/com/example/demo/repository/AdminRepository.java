package com.example.demo.repository;

import com.example.demo.model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *interfata pentru admin, operatii auto-implementate de Spring
 */
public interface AdminRepository extends JpaRepository<Administrator, Integer>{
}
