package com.example.demo.repository;

import com.example.demo.model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 */
public interface AdminRepository extends JpaRepository<Administrator, Integer>{
}
