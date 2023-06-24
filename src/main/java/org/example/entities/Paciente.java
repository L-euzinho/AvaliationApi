package org.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_pacientes")//cria tabela de pacientes com seus atributos
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    private String nome;


    private String Telefone;

    private String aptidao;

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAptidao() {
        return aptidao;
    }

    public void setAptidao(String aptidao) {
        this.aptidao = aptidao;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
}