package Primero.PrimerTrimestre.Ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edadInt;
        String edadString;

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Su edad: ");
        edadString = sc.nextLine();
        // TAMBIÉN SE PUEDE USAR:  sc.nextInt();

        edadInt = Integer.parseInt(edadString);

        System.out.println("El año que viene tendrá: " + (++edadInt) + " años.");
    }
}
