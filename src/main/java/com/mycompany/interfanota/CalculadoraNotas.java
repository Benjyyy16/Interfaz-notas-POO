package com.mycompany.interfanota;

/**
 * Reglas de cálculo de notas (escala chilena 1.0 a 7.0).
 */
public final class CalculadoraNotas {

    public static final double NOTA_MINIMA = 1.0;
    public static final double NOTA_MAXIMA = 7.0;

    private CalculadoraNotas() {
    }

    public static double parsearNota(String texto) {
        return Double.parseDouble(texto.trim().replace(',', '.'));
    }

    public static boolean esNotaValida(double nota) {
        return nota >= NOTA_MINIMA && nota <= NOTA_MAXIMA;
    }

    public static double promedio(double... notas) {
        if (notas.length == 0) {
            throw new IllegalArgumentException("Se requiere al menos una nota");
        }
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public static boolean estaAprobado(double promedio) {
        return promedio > 3.9;
    }
}
