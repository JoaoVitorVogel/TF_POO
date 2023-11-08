package org.example;

public abstract class Carro {
    protected Trem tremAlocado;
    protected int id;

    protected Carro(int id) {
        this.id = id;
    }

    protected Trem getTremAlocado() {
        return tremAlocado;
    }

    protected void setTremAlocado(Trem tremAlocado) {
        this.tremAlocado = tremAlocado;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }
}
