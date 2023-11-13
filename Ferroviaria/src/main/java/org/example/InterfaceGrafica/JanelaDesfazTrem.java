package org.example.InterfaceGrafica;
import javax.swing.*;
import java.awt.*;
public class JanelaDesfazTrem extends JFrame{
    public JanelaDesfazTrem(){
        super("Exclusão do trem");
        JLabel textoDesfazTrem = new JLabel("Digite o ID do trem que deseja excluir");
        JTextField campoDesfazTrem = new JTextField(30);
        JButton botaoConfirma = new JButton("Confirme a exclusão do trem indicado");

        JPanel painel = new JPanel(new GridLayout(6,2));
        painel.add(textoDesfazTrem);
        painel.add(campoDesfazTrem);
        painel.add(botaoConfirma);
        add(painel);
    
    }
}
