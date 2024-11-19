package Primero.PrimerTrimestre.Practica.Ejercicio_Controles.Examen2_22_23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables necesarias
        String nombreCiudad, nombreBatallonMax = "", ciudadBatallonMax = "", ciudadSegunda = "", ciudadOcupadaMasTarde = "";
        long habitantes;
        int efectivosBatallon, numCiudadesUcranianasMenos950k = 0, totalCiudades = 0, ciudadesUcranianas = 0, maxEfectivos = 0, mesOcupacion, mesOcupacionMasTarde = 2;
        char ocupadaPor;

        System.out.print("Introduce el nombre de la ciudad (o 'fin' para terminar): ");
        nombreCiudad = scanner.nextLine();

        // Ciclo de entrada de datos
        while (!nombreCiudad.equalsIgnoreCase("fin")) {

            totalCiudades++;  // Incremento del total de ciudades introducidas

            // Guardar el nombre de la segunda ciudad introducida
            if (totalCiudades == 2) {
                ciudadSegunda = nombreCiudad;
            }

            System.out.print("Introduce el número de habitantes: ");
            habitantes = Long.parseLong(scanner.nextLine());

            if (habitantes > 1000000) {

                System.out.print("Introduce el número de batallones: ");
                int numBatallones = Integer.parseInt(scanner.nextLine());

                for (int i = 0; i < numBatallones; i++) {
                    System.out.print("Introduce el nombre del batallón: ");
                    String nombreBatallon = scanner.nextLine();

                    System.out.print("Introduce el número de efectivos del batallón: ");
                    efectivosBatallon = Integer.parseInt(scanner.nextLine());

                    if (efectivosBatallon > maxEfectivos) {
                        maxEfectivos = efectivosBatallon;
                        nombreBatallonMax = nombreBatallon;
                        ciudadBatallonMax = nombreCiudad;
                    }
                }

                System.out.print("Introduce el bando que ocupa la ciudad ('R' para Rusia, 'U' para Ucrania): ");
                ocupadaPor = scanner.nextLine().charAt(0);

                if (ocupadaPor == 'U') {
                    ciudadesUcranianas++;
                }

                System.out.print("Introduce el mes de ocupación (2-11): ");
                mesOcupacion = Integer.parseInt(scanner.nextLine());

                if (mesOcupacion > mesOcupacionMasTarde) {
                    mesOcupacionMasTarde = mesOcupacion;
                    ciudadOcupadaMasTarde = nombreCiudad;
                }

            } else {  // Si tiene menos de 1 millón de habitantes

                System.out.print("Introduce el bando que ocupa la ciudad ('R' para Rusia, 'U' para Ucrania): ");
                ocupadaPor = scanner.nextLine().charAt(0);

                if (ocupadaPor == 'U') {
                    numCiudadesUcranianasMenos950k++;
                    ciudadesUcranianas++;
                }

                System.out.print("Introduce el mes de ocupación (2-11): ");
                mesOcupacion = Integer.parseInt(scanner.nextLine());

                if (mesOcupacion > mesOcupacionMasTarde) {
                    mesOcupacionMasTarde = mesOcupacion;
                    ciudadOcupadaMasTarde = nombreCiudad;
                }
            }

            System.out.print("Introduce el nombre de la ciudad (o 'fin' para terminar): ");
            nombreCiudad = scanner.nextLine();
        }

        // Cálculo del porcentaje de ciudades ocupadas por Ucrania
        double porcentajeCiudadesUcranianas = ((double) ciudadesUcranianas / totalCiudades) * 100;

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("a) Número de ciudades ucranianas con menos de 950.000 habitantes: " + numCiudadesUcranianasMenos950k);
        System.out.printf("b) Porcentaje de ciudades ocupadas por el bando Ucraniano: %.2f%%\n", porcentajeCiudadesUcranianas);
        System.out.println("c) Nombre del batallón con más componentes: " + nombreBatallonMax + ", y estaba en " + ciudadBatallonMax);
        System.out.println("d) Nombre de la segunda ciudad introducida: " + ciudadSegunda);
        System.out.println("e) Nombre de la ciudad ocupada más tarde: " + ciudadOcupadaMasTarde);

        scanner.close();
    }
}
