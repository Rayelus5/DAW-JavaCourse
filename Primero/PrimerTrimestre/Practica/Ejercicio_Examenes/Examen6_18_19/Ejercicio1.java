package Primero.PrimerTrimestre.Practica.Ejercicio_Examenes.Examen6_18_19;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar los resultados requeridos
        String claseConMayorAprobados = "";
        int maxAprobados = 0;

        String tutorConMenorSuspensos = "";
        double menorPorcentajeSuspensos = 100.0;

        int clasesMasAprobadosQueSuspensos = 0;
        int totalAlumnosCentro = 0;
        int totalAprobadosExamenFinalCentro = 0;
        boolean tresPrimerosAprobados = false;

        // Ingreso de datos para cada clase
        while (true) {
            System.out.print("Ingrese el nombre de la clase (o 'fin' para terminar): ");
            String nombreClase = scanner.nextLine();
            if (nombreClase.equalsIgnoreCase("fin")) break;

            System.out.print("Ingrese el nombre del tutor: ");
            String nombreTutor = scanner.nextLine();

            // Variables para la clase actual
            int numAlumnos = 0;
            int aprobadosGlobalClase = 0;
            int suspensosGlobalClase = 0;
            int aprobadosExamenFinalClase = 0;
            boolean primerosTresAprobadosControl = true;

            // Ingreso de datos para cada alumno en la clase
            for (int i = 1; ; i++) {
                System.out.print("Ingrese el nombre del alumno (o 'fin' para terminar): ");
                String nombreAlumno = scanner.nextLine();
                if (nombreAlumno.equalsIgnoreCase("fin")) break;

                System.out.print("Ingrese la nota del control: ");
                int notaControl = scanner.nextInt();

                System.out.print("Ingrese la nota del examen final: ");
                int notaExamenFinal = scanner.nextInt();

                System.out.print("Ingrese la nota de clase: ");
                int notaClase = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer de entrada

                numAlumnos++;
                totalAlumnosCentro++;

                // Calcular la nota global
                double notaGlobal = 0.6 * notaExamenFinal + 0.3 * notaControl + 0.1 * notaClase;

                // Evaluar aprobados y suspensos
                if (notaGlobal >= 5) {
                    aprobadosGlobalClase++;
                } else {
                    suspensosGlobalClase++;
                }

                if (notaExamenFinal >= 5) {
                    aprobadosExamenFinalClase++;
                    totalAprobadosExamenFinalCentro++;
                }

                // Revisar si los tres primeros alumnos aprobaron el control
                if (i <= 3 && notaControl < 5) {
                    primerosTresAprobadosControl = false;
                }
            }

            // Actualizar resultados según los datos de la clase actual
            if (aprobadosGlobalClase > maxAprobados) {
                maxAprobados = aprobadosGlobalClase;
                claseConMayorAprobados = nombreClase;
            }

            double porcentajeSuspensosClase = (numAlumnos > 0) ? (double) suspensosGlobalClase / numAlumnos * 100 : 100;
            if (porcentajeSuspensosClase < menorPorcentajeSuspensos) {
                menorPorcentajeSuspensos = porcentajeSuspensosClase;
                tutorConMenorSuspensos = nombreTutor;
            }

            if (aprobadosGlobalClase > suspensosGlobalClase) {
                clasesMasAprobadosQueSuspensos++;
            }

            if (numAlumnos >= 3 && primerosTresAprobadosControl) {
                tresPrimerosAprobados = true;
            }
        }

        // Cálculo final para el porcentaje de alumnos aprobados en el examen final
        double porcentajeAprobadosExamenFinalCentro = (totalAlumnosCentro > 0) ? (double) totalAprobadosExamenFinalCentro / totalAlumnosCentro * 100 : 0;

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("a) Clase con mayor número de alumnos aprobados globalmente: " + claseConMayorAprobados);
        System.out.println("b) Tutor con menor porcentaje de suspensos globales: " + tutorConMenorSuspensos + " (" + menorPorcentajeSuspensos + "%)");
        System.out.println("c) Número de clases con más aprobados que suspensos: " + clasesMasAprobadosQueSuspensos);
        System.out.println("d) Porcentaje de alumnos con nota aprobada en el examen final: " + porcentajeAprobadosExamenFinalCentro + "%");
        if (tresPrimerosAprobados) {
            System.out.println("e) Hay una clase donde los tres primeros alumnos tienen la nota del control aprobada.");
        } else {
            System.out.println("e) No hay ninguna clase donde los tres primeros alumnos tengan la nota del control aprobada.");
        }

        scanner.close();
    }
}