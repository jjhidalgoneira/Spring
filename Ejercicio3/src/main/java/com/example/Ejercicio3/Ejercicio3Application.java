package com.example.Ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Ejercicio3Application.class, args);
		SociosRepository repository = context.getBean(SociosRepository.class);

		System.out.println(" Número de socios: " + repository.count());

		//Crear socio
		Socios socio1 = new Socios(null,"Juan José","Hidalgo Neira","12345678A");
		repository.save(socio1);

		System.out.println(" Número de socios: " + repository.count());

		//Recuperar socios
		System.out.println(repository.findAll());

	}

}
