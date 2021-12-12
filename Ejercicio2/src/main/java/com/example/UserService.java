package com.example;

public class UserService {

    // 1. atributos
    NotificationService notificadorObjeto;

    // 2. constructores
    public UserService(NotificationService notificadorObjeto){
        System.out.println("Ejecutando constructor UserService");
        this.notificadorObjeto = notificadorObjeto;
    }
    // 3. metodos
}
