package org.example.InterfaceGrafica;

import java.awt.*;

import javax.swing.*;

import org.example.Garagem;

public class JanelaCriaTrem extends JFrame{
    
    public JanelaCriaTrem(){
        super("Criar trem");

        // Lista de locomotivas
        JLabel textoLocomotivas = new JLabel("Lista de locomotivas na garagem");
        JLabel listaLocomotivas = new JLabel(Garagem.toStringLocomotivas());

        // Lista de vagoes
        JLabel textoVagoes = new JLabel("Lista de vagões na garagem");
        JLabel listaVagoes = new JLabel(Garagem.toStringVagoes());


        JTextField campoIdTrem = new JTextField(30);
        JButton botaoConfirma = new JButton("Criar trem");
        botaoConfirma.addActionListener(evento -> {
            String textoId = campoIdTrem.getText();
            int idTrem = Integer.parseInt(textoId);
            Garagem.cadastrarTrem(idTrem);
        });

        JPanel painel = new JPanel(new GridLayout(6,2));
        painel.add(textoLocomotivas);
        painel.add(listaLocomotivas);
        painel.add(textoVagoes);
        painel.add(listaVagoes);
        painel.add(campoIdTrem);
        painel.add(botaoConfirma);

        add(painel);
    }
}
