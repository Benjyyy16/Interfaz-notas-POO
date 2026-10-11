package com.mycompany.interfanota;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraNotasTest {

    @Test
    void parseaPuntoYComa() {
        assertEquals(5.5, CalculadoraNotas.parsearNota("5.5"));
        assertEquals(5.5, CalculadoraNotas.parsearNota(" 5,5 "));
    }

    @Test
    void rechazaTextoNoNumerico() {
        assertThrows(NumberFormatException.class, () -> CalculadoraNotas.parsearNota("abc"));
        assertThrows(NumberFormatException.class, () -> CalculadoraNotas.parsearNota(""));
    }

    @Test
    void validaRangoUnoASiete() {
        assertTrue(CalculadoraNotas.esNotaValida(1.0));
        assertTrue(CalculadoraNotas.esNotaValida(7.0));
        assertFalse(CalculadoraNotas.esNotaValida(0.9));
        assertFalse(CalculadoraNotas.esNotaValida(7.1));
    }

    @Test
    void calculaPromedio() {
        assertEquals(5.0, CalculadoraNotas.promedio(4.0, 5.0, 6.0, 5.0), 1e-9);
        assertThrows(IllegalArgumentException.class, CalculadoraNotas::promedio);
    }

    @Test
    void apruebaSobreTresNueve() {
        assertTrue(CalculadoraNotas.estaAprobado(4.0));
        assertFalse(CalculadoraNotas.estaAprobado(3.9));
    }
}
