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
                janelaGaragens.setSize(500, 300);
                janelaGaragens.setLocationRelativeTo(null);
                janelaGaragens.setVisible(true);
            }
        );

        // Opção criar trem
        JButton botaoCriarTrem = new JButton("Criar trem");
        botaoCriarTrem.addActionListener(evento -> {
                JanelaCriaTrem janelaCriaTrem = new JanelaCriaTrem();
                janelaCriaTrem.setSize(500, 300);
                janelaCriaTrem.setLocationRelativeTo(null);
                janelaCriaTrem.setVisible(true);
            }
        );

         // Opção editar um trem
        JButton botaoEditarTrem = new JButton("Editar o trem");
        botaoEditarTrem.addActionListener(evento -> {
                JanelaEditTrem janelaEditTrem = new JanelaEditTrem();
                janelaEditTrem.setSize(500, 300);
                janelaEditTrem.setLocationRelativeTo(null);
                janelaEditTrem.setVisible(true);
            }
        );

        // Desfazer o trem
        JButton botaoDesfazOTrem = new JButton("Desfazer o trem");
        botaoDesfazOTrem.addActionListener(evento -> {
                JanelaDesfazTrem janelaDesfazTrem = new JanelaDesfazTrem();
                janelaDesfazTrem.setSize(500, 300);
                janelaDesfazTrem.setLocationRelativeTo(null);
                janelaDesfazTrem.setVisible(true);
            }
        );

        // Salvar alterações
        JButton botaoSalvar = new JButton("Salvar e sair");
        botaoSalvar.addActionListener(evento -> {
            //
            }
        );

        // Monta painel
        JPanel painel = new JPanel(new GridLayout(5,2));
        painel.add(botaoVerGaragens);
        painel.add(botaoCriarTrem);
        painel.add(botaoEditarTrem);
        painel.add(botaoDesfazOTrem);
        painel.add(botaoSalvar);
        add(painel);
    
    }
}
