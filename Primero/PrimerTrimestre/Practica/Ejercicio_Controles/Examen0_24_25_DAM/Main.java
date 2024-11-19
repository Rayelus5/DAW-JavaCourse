package Primero.PrimerTrimestre.Practica.Ejercicio_Controles.Examen0_24_25_DAM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables generales
        int totalRobots = 0;
        boolean nasaPresente = false, esaPresente = false, jaxaPresente = false;
        double maxTemperatura = Double.NEGATIVE_INFINITY;
        double minPresionMedia = Double.POSITIVE_INFINITY;
        double menorRadiacion1 = Double.POSITIVE_INFINITY, menorRadiacion2 = Double.POSITIVE_INFINITY;
        String robotMaxTemperatura = "", robotMinPresionMedia = "";
        int misionMaxTemperatura = 0;

        // Variables para misiones
        int totalDiasMisiones = 0, numMisiones = 0, misionesMasDe5Dias = 0;
        int longitudPlanetaMasLargo = 0, misionesPlanetaMasLargo = 0;

        System.out.print("Ingrese el número total de robots: ");
        totalRobots = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < totalRobots; i++) {
            // Información del robot
            System.out.print("Ingrese el nombre del robot: ");
            String nombreRobot = scanner.nextLine();
            System.out.print("Ingrese el nombre del planeta que visita: ");
            String nombrePlaneta = scanner.nextLine();

            // Determinar la marca del robot
            char marca = nombreRobot.charAt(0);
            if (marca == 'N') nasaPresente = true;
            if (marca == 'E') esaPresente = true;
            if (marca == 'J') jaxaPresente = true;

            // Actualizar planeta más largo
            if (nombrePlaneta.length() > longitudPlanetaMasLargo) {
                longitudPlanetaMasLargo = nombrePlaneta.length();
                misionesPlanetaMasLargo = 0;
            }


            // Misiones del robot
            int misionID = 1;

            System.out.print("Ingrese el número de días de registro para la misión " + misionID + " (-1 para terminar): ");
            int diasMision = Integer.parseInt(scanner.nextLine());

            while (diasMision != -1) {

                // Contar la misión
                numMisiones++;
                totalDiasMisiones += diasMision;
                if (diasMision > 5) misionesMasDe5Dias++;

                if (nombrePlaneta.length() == longitudPlanetaMasLargo) {
                    misionesPlanetaMasLargo++;
                }

                // Registro de la misión
                double sumaTemperatura = 0, sumaPresion = 0, sumaRadiacion = 0;


                for (int dia = 1; dia <= diasMision; dia++) {
                    float temperatura, presion, radiacion;

                    System.out.print("Ingrese la temperatura del día " + dia + ": ");
                    temperatura = Float.parseFloat(scanner.nextLine());
                    System.out.print("Ingrese la presión atmosférica del día " + dia + ": ");
                    presion = Float.parseFloat(scanner.nextLine());
                    System.out.print("Ingrese el nivel de radiación del día " + dia + ": ");
                    radiacion = Float.parseFloat(scanner.nextLine());

                    sumaTemperatura += temperatura;
                    sumaPresion += presion;
                    sumaRadiacion += radiacion;

                    // Actualizar temperatura máxima
                    if (temperatura > maxTemperatura) {
                        maxTemperatura = temperatura;
                        robotMaxTemperatura = nombreRobot;
                        misionMaxTemperatura = misionID;
                    }

                    // Actualizar radiaciones menores
                    if (radiacion < menorRadiacion1) {
                        menorRadiacion2 = menorRadiacion1;
                        menorRadiacion1 = radiacion;
                    } else if (radiacion < menorRadiacion2) {
                        menorRadiacion2 = radiacion;
                    }
                }

                // Calcular presión media y actualizar si es la menor
                double presionMedia = sumaPresion / diasMision;
                if (presionMedia < minPresionMedia) {
                    minPresionMedia = presionMedia;
                    robotMinPresionMedia = nombreRobot;
                }

                misionID++;

                System.out.print("Ingrese el número de días de registro para la misión " + misionID + " (-1 para terminar): ");
                diasMision = Integer.parseInt(scanner.nextLine());
            }
        }

        // Calcular estadísticas finales
        double promedioDiasMision = numMisiones == 0 ? 0 : (double) totalDiasMisiones / numMisiones;

        boolean tresMarcas = nasaPresente && esaPresente && jaxaPresente;

        double porcentajeMisionesMasDe5Dias = numMisiones == 0 ? 0 : ((double) misionesMasDe5Dias / numMisiones) * 100;

        // Mostrar resultados
        System.out.println("\nEstadísticas de las misiones:");
        System.out.printf("A. Promedio de días de duración de una misión: %.2f\n", promedioDiasMision);
        System.out.printf("B. Ha habido robots de las tres marcas: %s\n", tresMarcas ? "Sí" : "No");
        System.out.printf("C. Temperatura máxima registrada: %.2f°C en la misión %d del robot %s\n", maxTemperatura, misionMaxTemperatura, robotMaxTemperatura);
        System.out.printf("D. Robot que registró la menor presión media: %s\n", robotMinPresionMedia);
        System.out.printf("E. Dos valores menores de radiación registrados: %.2f, %.2f\n", menorRadiacion1, menorRadiacion2);
        System.out.printf("F. Porcentaje de misiones de más de 5 días: %.2f%%\n", porcentajeMisionesMasDe5Dias);
        System.out.printf("G. Número de misiones en el planeta con el nombre más largo: %d\n", misionesPlanetaMasLargo);

    }
}