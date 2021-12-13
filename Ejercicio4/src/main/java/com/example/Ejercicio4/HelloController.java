package com.example.Ejercicio4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   @GetMapping("/hola")
    public String saludo() {
        return "Hola a todo el mundo, BUENAS !! Un cordial saludo!!";
    }
}
