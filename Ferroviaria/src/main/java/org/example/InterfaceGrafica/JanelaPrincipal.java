package org.example.InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JanelaPrincipal extends JFrame implements ActionListener{
    
    public JanelaPrincipal() {
        super("Sistema de trens");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Opção ver garagens
        JButton botaoVerGaragens = new JButton("Ver garagens");
        botaoVerGaragens.addActionListener(evento -> {
            JanelaGaragens janelaGaragens = new JanelaGaragens();
            janelaGaragens.setSize(400, 300);
            janelaGaragens.setLocationRelativeTo(null);
            janelaGaragens.setVisible(true);
        });

        // Opção criar trem
        JButton botaoCriarTrem = new JButton("Criar trem");
        botaoCriarTrem.addActionListener(this);
        add(botaoCriarTrem);






















        
         // Opção editar um trem
        JButton botaoEditarTrem = new JButton("Editar o trem");
        botaoEditarTrem.addActionListener(evento -> {
            JanelaEditTrem janelaEditTrem = new JanelaEditTrem();
            janelaEditTrem.setSize(400, 300);
            janelaEditTrem.setLocationRelativeTo(null);
            janelaEditTrem.setVisible(true);
        });
        add(botaoEditarTrem);


        JPanel painel = new JPanel(new GridLayout(5,2));
        painel.add(botaoVerGaragens);
        painel.add(botaoCriarTrem);
        painel.add(botaoEditarTrem);
        add(painel);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Criar trem")){
            criarTrem();
        }
    }

    public void criarTrem() {
        JOptionPane.showMessageDialog(this, "Hello");
    }
}
