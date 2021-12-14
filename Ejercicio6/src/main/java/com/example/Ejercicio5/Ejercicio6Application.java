package com.example.Ejercicio5;

import com.example.Ejercicio5.entities.Laptop;
import com.example.Ejercicio5.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio6Application {

	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(Ejercicio6Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		//CRUD
		//crear laptops
		Laptop L1 = new Laptop (null,"Packard Bell","Easy Note Hera G",15,240,8);
		Laptop L2 = new Laptop (null,"Asus","554L",15,240,8);
		Laptop L3 = new Laptop (null,"Medion","Erazer",15,240,16);
		repository.save(L1);
		repository.save(L2);
		repository.save(L3);

	}

}
