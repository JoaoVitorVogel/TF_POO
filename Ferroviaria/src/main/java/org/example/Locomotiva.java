package org.example;

import java.util.Objects;

public class Locomotiva extends Carro {

    private double pesoMaximo; // inserido no constructor
    private int limiteVagoes = 5;

    protected Locomotiva(int id, double pesoMaximo) {
        super(id);
        this.pesoMaximo = pesoMaximo;
    }

    protected int getId() {
        return id;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    protected Trem getTremAlocado() {
        return tremAlocado;
    }

    protected void setTremAlocado(Trem tremAlocado) {
        this.tremAlocado = tremAlocado;
    }

    protected int getLimiteVagoes() {
        return limiteVagoes;
    }

    @Override
    public String toString() {
        return "L" + Integer.toString(id);
    }

    /*
     * Metodos 'equals' e 'hashCode' sao necessarios para comparar uma locomotiva
     * com outra utilizando
     * seu ID, ao inves de seu pointer na memoria;
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Locomotiva that = (Locomotiva) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
