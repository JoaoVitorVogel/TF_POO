package org.example.InterfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class JanelaPrincipal extends JFrame{
    
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
        botaoCriarTrem.addActionListener(evento -> {
            JanelaCriaTrem janelaCriaTrem = new JanelaCriaTrem();
            janelaCriaTrem.setSize(400, 300);
            janelaCriaTrem.setLocationRelativeTo(null);
            janelaCriaTrem.setVisible(true);
        });

        // Monta painel
        JPanel painel = new JPanel(new GridLayout(5,2));
        painel.add(botaoVerGaragens);
        painel.add(botaoCriarTrem);

        add(painel);
    }
}
