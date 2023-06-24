package org.example;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.example.controller.Screen;

import javax.swing.*;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Screen();
            }
        });

        SpringApplication.run(Main.class,args);

    }

    @Bean//é chamado para mostrar a menssagem de inicialização
    public CommandLineRunner initialization(){
        return args -> {
            System.out.println("Helo World, Running...");
        };

    }
}