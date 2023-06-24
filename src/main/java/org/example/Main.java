package org.example;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class,args);

    }

    @Bean//é chamado para mostrar a mensagem de inicialização
    public CommandLineRunner initialization(){
        return args -> {
            System.out.println("Helo World, Running...");

        };

    }
}