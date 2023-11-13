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


        JLabel textoCriar = new JLabel("Digite um ID para o nove trem");
        
        
        Garagem.cadastrarTrem(1);








        JPanel painel = new JPanel(new GridLayout(6,2));
        painel.add(textoLocomotivas);
        painel.add(listaLocomotivas);
        painel.add(textoVagoes);
        painel.add(listaVagoes);

        add(painel);
    }
}
