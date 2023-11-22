package org.example;
import org.example.InterfaceGrafica.Menu;

public class Main {

    public static void main(String[] ARGS) {
        IniciaGaragens.criaEmpresa();
        Menu telaMenu = new Menu();
        telaMenu.setVisible(true);
        telaMenu.setLocationRelativeTo(null);
    }
}