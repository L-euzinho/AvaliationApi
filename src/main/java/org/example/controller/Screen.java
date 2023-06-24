package org.example.controller;

import org.example.entities.Paciente;
import org.example.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class Screen {
    private JTextField nomeField;
    private JTextField telefoneField;
    private JTextField aptidaoField;
    private JButton criarButton;

    @Autowired
    private PacienteRepository repository;

    public Screen() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(800, 500);
        jFrame.setTitle("Aplicações");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        this.nomeField = new JTextField();

        JLabel telefoneLabel = new JLabel("Telefone:");
        this.telefoneField = new JTextField();

        JLabel aptidaoLabel = new JLabel("Aptidão:");
        this.aptidaoField = new JTextField();

        this.criarButton = new JButton("Criar Paciente");

        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(telefoneLabel);
        panel.add(telefoneField);
        panel.add(aptidaoLabel);
        panel.add(aptidaoField);
        panel.add(new JLabel());
        panel.add(criarButton);

        jFrame.add(panel);

        criarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarPaciente();
            }
        });
    }

    private void criarPaciente() {
        String nome = nomeField.getText();
        String telefone = telefoneField.getText();
        String aptidao = aptidaoField.getText();

        Paciente paciente = new Paciente(nome, telefone, aptidao);
        repository.save(paciente);

        JOptionPane.showMessageDialog(null, "Paciente criado com sucesso!");
    }
}