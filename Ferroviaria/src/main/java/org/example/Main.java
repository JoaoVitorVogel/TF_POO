package org.example;

import org.example.InterfaceGrafica.Menu;

public class Main {

    public static void main(String[] ARGS) {
        IniciaGaragens.criaEmpresa();
        new Menu().setVisible(true);
    }

    
}
