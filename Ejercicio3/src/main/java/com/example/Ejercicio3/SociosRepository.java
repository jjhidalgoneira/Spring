package com.example.Ejercicio3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SociosRepository extends JpaRepository <Socios,Long> {
}
