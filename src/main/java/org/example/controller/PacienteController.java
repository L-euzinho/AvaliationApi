package org.example.controller;

import org.example.entities.Paciente;
import org.example.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/pacientes")
public class PacienteController {

    @Autowired // escreve so dentro do repositorio
    private PacienteRepository repository;

    @GetMapping
    public List<Paciente> findAll(){
        List<Paciente> result= repository.findAll();
        return result;
    }


}