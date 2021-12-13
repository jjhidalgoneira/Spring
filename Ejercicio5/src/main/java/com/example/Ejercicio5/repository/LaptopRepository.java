package com.example.Ejercicio5.repository;

import com.example.Ejercicio5.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository <Laptop, Long> {

}
