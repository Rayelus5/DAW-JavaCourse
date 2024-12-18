package Primero.PrimerTrimestre.Practica.EjemplosTablas;

import java.util.Arrays;

@SuppressWarnings("SpellCheckingInspection") // Para evitar "warnings" de palabras no reconocidas por el diccionario

public class ConjuntoNumeros {
    public static void main(String[] args) {
        int[] conjuntoA = {5, 7, 3, 4};
        int[] conjuntoB = {3, 4, 5, 6, 7};

        System.out.println(isContained(conjuntoA, conjuntoB));
    }

    public static boolean isContained(int[] conjuntoA, int[] conjuntoB) {
        Arrays.sort(conjuntoA);
        Arrays.sort(conjuntoB);

        int i = 0, j = 0;
        while (i < conjuntoA.length && j < conjuntoB.length) {
            if (conjuntoA[i] == conjuntoB[j]) {
                i++;
            }
            j++;
        }

        return i == conjuntoA.length;
    }
}