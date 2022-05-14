package com.example.demo.repository;

import com.example.demo.model.Anunt;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * interfata pentru anunt, operatii auto-implementate de Spring
 */
public interface AnuntRepository extends JpaRepository<Anunt, Integer> {
}
