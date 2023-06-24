package org.example.controller;

import jakarta.persistence.Id;
import org.example.entities.Paciente;
import org.example.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/pacientes")
public class PacienteController {

    @Autowired // escreve so dentro do repositorio
    private  PacienteRepository repository;

    @GetMapping//monstra todos os pacientes
    public List<Paciente> findAll(){
        List<Paciente> result= repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")//acha pacientes por Id
    public Paciente findById(@PathVariable Integer id){
        Paciente result= repository.findById(id).get();
        return result;
    }


    @PostMapping//add um paciente com um arquivo de texto(.jason)
    public Paciente insert(@RequestBody Paciente paciente){
        Paciente result= repository.save(paciente);
        return result;
    }

}