package Primero.PrimerTrimestre.Practica.Ejercicio8;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")

public class Main {
    public static void main(String[] args) {
        /*
        *
        * ===ESTRUCTURA DE IF===
        *
        * if (<expresión lógica>) {
        *    <bloque de instrucciones>
        * }
        *
        */

        int age;
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Introduzca su edad: ");
        age = Integer.parseInt(sc.nextLine());

        if (age >= 18) {
            System.out.println("Es usted mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");
        }

        System.out.println("El programa ha finalizado");

    }
}