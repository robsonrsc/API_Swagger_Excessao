package DIO.Gerenciando_API2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @GetMapping

    public String welcome(){

        return "Welcome to my first API using Spring Boot" +
                "" +
                "Bem vindo a minha Primeira API Spring Boot";
    }

}
