package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        NotificationService saludador = (NotificationService) context.getBean("notificador");
        saludador.saluda();

        UserService us =(UserService) context.getBean("usuario");
        us.notificadorObjeto.saluda();
    }


}
