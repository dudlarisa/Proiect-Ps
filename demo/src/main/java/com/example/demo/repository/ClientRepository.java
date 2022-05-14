package com.example.demo.repository;


import com.example.demo.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * interfata pentru client, operatii auto-implementate de Spring
 */
public interface ClientRepository extends JpaRepository<Client, Integer>{
}
