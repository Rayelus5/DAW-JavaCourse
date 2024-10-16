package Primero.PrimerTrimestre.Practica.Ejercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Cómo leer un carácter

        String cadena;
        char caracter;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una cadena: ");
        cadena = sc.nextLine();

        caracter = cadena.charAt(2);
        System.out.println("Cadena leida: " + cadena);
        System.out.println("Caracter en la posicion 2 (0,1,2): " + caracter);

        System.out.println("Cadena del revés: ");
        for (int i = cadena.length() - 1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }
    }
}
