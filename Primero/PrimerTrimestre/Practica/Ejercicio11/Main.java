package Primero.PrimerTrimestre.Practica.Ejercicio11;

// BUCLES

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        bucle3();

    }

    public static void bucle1() {
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i += 5;
        }
        System.out.println("Fin");
    }

    public static void bucle2() {

        int i;

        do {
            System.out.println("Introduzca un número entero: ");
            i = scanner.nextInt();
        } while (i != 0);
        System.out.println("Número introducido: 0 (Saliendo del bucle)");

    }

    public static void bucle3() {
        int i;
        int n = 0;

        System.out.println("Introduzca un número entero: ");
        i = scanner.nextInt();

        while (i != 0)  {
            System.out.println("Introduzca un número entero: ");
            i = scanner.nextInt();
            n++;
        }

        System.out.println("Número introducido: 0 (Saliendo del bucle)");
        System.out.println("Números introducidos en total: " + n);
    }
}