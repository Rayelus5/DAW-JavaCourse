package Primero.PrimerTrimestre.Practica.RelacionEjercicios3;

import java.util.Scanner;

public class Ejercicio2 {

    public static final int TAM = 30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[TAM];

        // Paso 1: Cargar los primeros 20 elementos
        System.out.println("Ingrese 20 números enteros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Paso 2: Pedir el número a insertar y la posición
        System.out.print("Ingrese el número a insertar: ");
        int numeroAInsertar = scanner.nextInt();

        int posicion;
        do {
            System.out.print("Ingrese la posición (entre 1 y 20) donde insertar el número: ");
            posicion = scanner.nextInt();
        } while (posicion < 1 || posicion > 20);

        // Paso 3: Insertar el número en la posición deseada
        // Convertimos la posición ingresada a índice del arreglo
        int indice = posicion - 1;

        // Desplazar elementos hacia la derecha desde el índice hasta el final de los 20 elementos
        for (int i = 19; i >= indice; i--) {
            numeros[i + 1] = numeros[i];
        }

        // Insertar el nuevo número en la posición deseada
        numeros[indice] = numeroAInsertar;

        // Paso 4: Mostrar el arreglo resultante
        System.out.println("Arreglo después de la inserción:");
        for (int i = 0; i < 21; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
}
