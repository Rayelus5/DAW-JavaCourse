package Primero.PrimerTrimestre.Practica.Ejercicio_Controles.Tipo_Examen.Relacion_1;

import java.util.Scanner;

/*
En un centro educativo, en un determinado nivel existen 4 grupos: A, B, C y D.

El grupo A tiene 25 alumnos, el B tiene 28, el C tiene 31 y el D tiene 29.
Para cada alumno disponemos de las notas del primer, segundo y tercer parcial.
Realizar un programa en Java que:

- Pida la letra del grupo que se va a introducir (sólo se va a introducir un grupo).

- Para ese grupo, pida para cada alumno el nombre, la nota del primer parcial, del segundo y del tercero.

- Debe mostrarse al final: El nombre del alumno con mayor nota media (media de los tres parciales).
Cuántos alumnos tienen la nota media suspensa. Si existe algún alumno con nota mayor o igual que 9,
debe indicarse al final con el mensaje: “Existen sobresalientes”
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos del tamaño de cada grupo
        int numAlumnos = 0;
        String grupo;

        // Solicitar el grupo
        System.out.print("Introduce la letra del grupo (A, B, C, D): ");
        grupo = scanner.nextLine().toUpperCase();

        // Determinar el número de alumnos según el grupo
        switch (grupo) {
            case "A":
                numAlumnos = 25;
                break;
            case "B":
                numAlumnos = 28;
                break;
            case "C":
                numAlumnos = 31;
                break;
            case "D":
                numAlumnos = 29;
                break;
            default:
                System.out.println("Grupo no válido. Debe ser A, B, C o D.");
                scanner.close();
                return; // Salir del programa si el grupo es inválido
        }

        // Arrays para almacenar la información de los alumnos
        String[] nombres = new String[numAlumnos];
        double[] notaMedia = new double[numAlumnos];

        // Variables auxiliares para los cálculos
        double nota1, nota2, nota3;
        int alumnosSuspensos = 0;
        boolean existenSobresalientes = false;
        double mayorNotaMedia = 0;
        String alumnoMejorNota = "";

        // Solicitar los datos de cada alumno
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Introduce el nombre del alumno " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.print("Introduce la nota del primer parcial: ");
            nota1 = scanner.nextDouble();

            System.out.print("Introduce la nota del segundo parcial: ");
            nota2 = scanner.nextDouble();

            System.out.print("Introduce la nota del tercer parcial: ");
            nota3 = scanner.nextDouble();

            // Calcular la nota media del alumno
            notaMedia[i] = (nota1 + nota2 + nota3) / 3.0;

            // Comprobar si la nota media es la mayor hasta ahora
            if (notaMedia[i] > mayorNotaMedia) {
                mayorNotaMedia = notaMedia[i];
                alumnoMejorNota = nombres[i];
            }

            // Contar cuántos alumnos tienen la nota media suspensa (< 5)
            if (notaMedia[i] < 5) {
                alumnosSuspensos++;
            }

            // Comprobar si existe algún sobresaliente (nota media >= 9)
            if (notaMedia[i] >= 9) {
                existenSobresalientes = true;
            }

            // Consumir la línea restante para evitar problemas con el scanner
            scanner.nextLine();
        }

        // Mostrar resultados
        System.out.println("\nEl alumno con la mayor nota media es: " + alumnoMejorNota + " con una media de " + mayorNotaMedia);
        System.out.println("Número de alumnos con nota media suspensa: " + alumnosSuspensos);

        if (existenSobresalientes) {
            System.out.println("Existen sobresalientes");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
