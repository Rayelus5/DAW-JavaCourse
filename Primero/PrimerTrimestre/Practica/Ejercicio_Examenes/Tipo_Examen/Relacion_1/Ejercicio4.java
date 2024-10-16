package Primero.PrimerTrimestre.Practica.Ejercicio_Examenes.Tipo_Examen.Relacion_1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de región
        System.out.print("Introduce el número de la región (1-4): ");
        int region = scanner.nextInt();

        // Determinar el número de provincias según la región
        int numProvincias = 0;
        switch (region) {
            case 1:
                numProvincias = 10;
                break;
            case 2:
                numProvincias = 4;
                break;
            case 3:
                numProvincias = 6;
                break;
            case 4:
                numProvincias = 1;
                break;
            default:
                System.out.println("Región no válida. Debe estar entre 1 y 4.");
                scanner.close();
                return; // Salir del programa si la región es inválida
        }

        // Variables para almacenar datos sobre los votos y abstenciones
        String provinciaMaxA = "";
        String provinciaMaxB = "";
        int maxVotosA = Integer.MIN_VALUE;
        int maxVotosB = Integer.MIN_VALUE;
        int totalVotos = 0;
        int totalAbstenciones = 0;
        boolean altaAbstencion = false;

        // Consumir el salto de línea pendiente
        scanner.nextLine();

        // Solicitar los datos para cada provincia de la región seleccionada
        for (int i = 1; i <= numProvincias; i++) {
            System.out.print("Introduce el nombre de la provincia " + i + ": ");
            String nombreProvincia = scanner.nextLine();

            System.out.print("Introduce el número de votos para el partido A en " + nombreProvincia + ": ");
            int votosA = scanner.nextInt();

            System.out.print("Introduce el número de votos para el partido B en " + nombreProvincia + ": ");
            int votosB = scanner.nextInt();

            System.out.print("Introduce el número de abstenciones en " + nombreProvincia + ": ");
            int abstenciones = scanner.nextInt();

            // Acumular los votos totales y abstenciones
            totalVotos += (votosA + votosB);
            totalAbstenciones += abstenciones;

            // Determinar la provincia con más votos para el partido A
            if (votosA > maxVotosA) {
                maxVotosA = votosA;
                provinciaMaxA = nombreProvincia;
            }

            // Determinar la provincia con más votos para el partido B
            if (votosB > maxVotosB) {
                maxVotosB = votosB;
                provinciaMaxB = nombreProvincia;
            }

            // Verificar si hay alta abstención (más de 100,000)
            if (abstenciones > 100000) {
                altaAbstencion = true;
            }

            // Consumir la línea restante para evitar problemas con el scanner
            scanner.nextLine();
        }

        // Calcular los porcentajes
        int totalVotosYAbstenciones = totalVotos + totalAbstenciones;
        double porcentajeVotos = (totalVotosYAbstenciones > 0) ? ((double) totalVotos / totalVotosYAbstenciones) * 100 : 0;
        double porcentajeAbstencion = (totalVotosYAbstenciones > 0) ? ((double) totalAbstenciones / totalVotosYAbstenciones) * 100 : 0;

        // Mostrar resultados
        System.out.println("\nPorcentaje de votos totales en la región: " + porcentajeVotos + "%");
        System.out.println("Porcentaje de abstenciones en la región: " + porcentajeAbstencion + "%");
        System.out.println("Provincia donde el partido A ha obtenido más votos: " + provinciaMaxA);
        System.out.println("Provincia donde el partido B ha obtenido más votos: " + provinciaMaxB);

        if (altaAbstencion) {
            System.out.println("Alta abstención en alguna provincia (más de 100,000 abstenciones).");
        }

        // Cerrar el scanner
        scanner.close();
    }
}