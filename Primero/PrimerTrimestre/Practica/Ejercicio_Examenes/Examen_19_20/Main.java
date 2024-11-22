package Primero.PrimerTrimestre.Practica.Ejercicio_Examenes.Examen_19_20;

import java.util.Scanner;

// REVISAR BUCLES Y SCANNER

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays para almacenar los datos
        String[] equiposLocal = new String[100];
        String[] equiposVisitante = new String[100];
        int[] golesLocal = new int[100];
        int[] golesVisitante = new int[100];
        int partidosIngresados = 0;

        // Arrays para equipos y puntos
        String[] equipos = new String[20];
        int[] puntos = new int[20];
        int totalEquipos = 0;

        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1- Introducir resultado de un partido.");
            System.out.println("2- Mostrar todos los partidos introducidos.");
            System.out.println("3- Mostrar el equipo ganador de la liga.");
            System.out.println("4- Mostrar el porcentaje de partidos en los que perdió el equipo local.");
            System.out.println("5- Introducir nombre de equipo y mostrar los resultados de todos sus partidos.");
            System.out.println("6- Finalizar.");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            if (opcion == 1) {
                // Introducir resultado
                System.out.print("Nombre del equipo local: ");
                equiposLocal[partidosIngresados] = scanner.nextLine();
                System.out.print("Nombre del equipo visitante: ");
                equiposVisitante[partidosIngresados] = scanner.nextLine();
                System.out.print("Goles del equipo local: ");
                golesLocal[partidosIngresados] = scanner.nextInt();
                System.out.print("Goles del equipo visitante: ");
                golesVisitante[partidosIngresados] = scanner.nextInt();
                scanner.nextLine(); // Consumir salto de línea
                partidosIngresados++;

                System.out.println("Datos almacenados.");
            } else if (opcion == 2) {
                // Mostrar partidos
                if (partidosIngresados == 0) {
                    System.out.println("No se han introducido partidos.");
                } else {
                    System.out.println("\nPartidos introducidos:");
                    for (int i = 0; i < partidosIngresados; i++) {
                        System.out.println(equiposLocal[i] + " " + golesLocal[i] + " - " + golesVisitante[i] + " " + equiposVisitante[i]);
                    }
                }
            } else if (opcion == 3) {
                // Calcular puntos y mostrar ganador
                for (int i = 0; i < partidosIngresados; i++) {
                    String local = equiposLocal[i];
                    String visitante = equiposVisitante[i];
                    int golesL = golesLocal[i];
                    int golesV = golesVisitante[i];

                    // Local
                    int indiceLocal = -1;
                    for (int j = 0; j < totalEquipos; j++) {
                        if (equipos[j].equals(local)) {
                            indiceLocal = j;
                            break;
                        }
                    }
                    if (indiceLocal == -1) {
                        equipos[totalEquipos] = local;
                        puntos[totalEquipos] = 0;
                        indiceLocal = totalEquipos;
                        totalEquipos++;
                    }

                    // Visitante
                    int indiceVisitante = -1;
                    for (int j = 0; j < totalEquipos; j++) {
                        if (equipos[j].equals(visitante)) {
                            indiceVisitante = j;
                            break;
                        }
                    }
                    if (indiceVisitante == -1) {
                        equipos[totalEquipos] = visitante;
                        puntos[totalEquipos] = 0;
                        indiceVisitante = totalEquipos;
                        totalEquipos++;
                    }

                    // Sumar puntos
                    if (golesL > golesV) {
                        puntos[indiceLocal] += 3;
                    } else if (golesL < golesV) {
                        puntos[indiceVisitante] += 3;
                    } else {
                        puntos[indiceLocal] += 1;
                        puntos[indiceVisitante] += 1;
                    }
                }

                int maxPuntos = -1;
                String ganador = "";
                for (int i = 0; i < totalEquipos; i++) {
                    if (puntos[i] > maxPuntos) {
                        maxPuntos = puntos[i];
                        ganador = equipos[i];
                    }
                }

                System.out.println("El equipo ganador de la liga es " + ganador + " con " + maxPuntos + " puntos.");
            } else if (opcion == 4) {
                // Calcular porcentaje de derrotas del equipo local
                if (partidosIngresados == 0) {
                    System.out.println("No se han introducido partidos.");
                } else {
                    int derrotasLocal = 0;
                    for (int i = 0; i < partidosIngresados; i++) {
                        if (golesLocal[i] < golesVisitante[i]) {
                            derrotasLocal++;
                        }
                    }
                    double porcentaje = (double) derrotasLocal / partidosIngresados * 100;
                    System.out.printf("Porcentaje de partidos en los que perdió el equipo local: %.2f%%\n", porcentaje);
                }
            } else if (opcion == 5) {
                // Mostrar partidos de un equipo
                System.out.print("Ingrese el nombre del equipo: ");
                String equipo = scanner.nextLine();
                boolean encontrado = false;

                for (int i = 0; i < partidosIngresados; i++) {
                    if (equiposLocal[i].equals(equipo) || equiposVisitante[i].equals(equipo)) {
                        System.out.println(equiposLocal[i] + " " + golesLocal[i] + " - " + golesVisitante[i] + " " + equiposVisitante[i]);
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.println("No se han encontrado partidos para el equipo " + equipo + ".");
                }
            } else if (opcion != 6) {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);

        System.out.println("Finalizando programa. ¡Adiós!");
        scanner.close();
    }
}