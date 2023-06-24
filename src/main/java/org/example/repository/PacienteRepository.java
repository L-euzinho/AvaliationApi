package org.example.repository;

import org.example.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> { }
//interface que atribui as operações Jpa com os pacientes