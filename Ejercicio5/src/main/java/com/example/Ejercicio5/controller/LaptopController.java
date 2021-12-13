package com.example.Ejercicio5.controller;

import com.example.Ejercicio5.entities.Laptop;
import com.example.Ejercicio5.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }
    //CRUD sobre la entidad Laptop

    //Retrieve: devolver una lista de laptops
    @GetMapping("/lista")
    public List<Laptop> findAll(){
     return laptopRepository.findAll();
    }

    //public String lista(){
    //    return("lista");


}
