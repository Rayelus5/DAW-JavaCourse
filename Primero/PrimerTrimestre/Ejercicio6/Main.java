package Primero.PrimerTrimestre.Ejercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Pide un valor y datos al usuario
        String nombre, apellido1, apellido2;

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Introduzca su nombre: ");
        nombre = sc.nextLine();

        System.out.println("Introduzca su primer apellido: ");
        apellido1 = sc.nextLine();

        System.out.println("Introduzca su segundo apellido: ");
        apellido2 = sc.nextLine();

        System.out.println("Bienvenido " + nombre + " " + apellido1 + " " + apellido2 + "! ^^");
    }
}
