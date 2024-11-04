package Primero.PrimerTrimestre.Practica.RelacionEjercicios3;

import java.util.Scanner;

public class Ejercicio1 {

    public static final int TAM = 30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[TAM];

        // Paso 1: Cargar la tabla con datos ingresados por el usuario
        System.out.println("Ingrese 30 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Paso 2: Determinar el orden
        boolean creciente = true;
        boolean decreciente = true;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeros[i - 1]) {
                decreciente = false;
            } else if (numeros[i] < numeros[i - 1]) {
                creciente = false;
            }
        }

        // Paso 3: Imprimir el resultado
        if (creciente) {
            System.out.println("La tabla está ordenada de forma creciente.");
        } else if (decreciente) {
            System.out.println("La tabla está ordenada de forma decreciente.");
        } else {
            System.out.println("La tabla está desordenada.");
        }

    }
}
