package Primero.PrimerTrimestre.Practica.EjemplosTablas;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")

public class Ejemplo5 {

    public static final int TAM = 20;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] tNum = new int[TAM];
        int cont = 0, n;

        System.out.print("Número: ");
        n = Integer.parseInt(scanner.nextLine());

        while ((n != 0) && (cont != TAM)) {
            tNum[cont++] = n;
            // cont++;

            /*

            POST INCREMENTO
            ----------------
             b = a++;
             ---
             b = a;
             a++;
             (Se utiliza el valor y luego se incrementa)

            /////////////////

            PRE INCREMENTO
            ----------------
             b = ++a;
             ---
             a++;
             b = a;
             (Se incrementa y luego se usa el valor)

            */

            System.out.print("Número: ");
            n = Integer.parseInt(scanner.nextLine());
        }

        for (int i=0; i < cont; i++) {
            System.out.println("Posición " + (i+1) + " contenido: " + tNum[i]);
        }
    }
}

