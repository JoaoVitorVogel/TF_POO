package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GaragemTest {
    @Test
    public void example(){

        Garagem.cadastrarVagao(1, 200);
        Vagao v = Garagem.getVagao(1);

        double actual = v.getCapacidadeCarga();
        double expected = 200;
        assertEquals(expected, actual);
    }
}
