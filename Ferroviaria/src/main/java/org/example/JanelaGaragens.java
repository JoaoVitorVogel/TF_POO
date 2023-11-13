package org.example;

import javax.swing.*;
import java.awt.*;

public class JanelaGaragens extends JFrame{
    
    public JanelaGaragens(){
        super("Garagens");

        // Lista de locomotivas
        JLabel textoLocomotivas = new JLabel("Lista de locomotivas na garagem");
        JLabel listaLocomotivas = new JLabel(Garagem.toStringLocomotivas());

        // Lista de vagoes
        JLabel textoVagoes = new JLabel("Lista de vagões na garagem");
        JLabel listaVagoes = new JLabel(Garagem.toStringVagoes());
        
        // Lista de trens
        JLabel textoTrens = new JLabel("Lista de trens na garagem");
        JLabel listaTrens = new JLabel(Garagem.toStringTrens());
        

        JPanel painel = new JPanel(new GridLayout(6,2));
        painel.add(textoLocomotivas);
        painel.add(listaLocomotivas);
        painel.add(textoVagoes);
        painel.add(listaVagoes);
        painel.add(textoTrens);
        painel.add(listaTrens);

        add(painel);
    }
}
