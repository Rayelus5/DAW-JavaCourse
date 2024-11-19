package Primero.PrimerTrimestre.Practica.Ejercicio_Controles.Examen6_18_19;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")

/*

En la Oficina de Estudios Académicos Hermanos Machado (OEAHM),
se pretende estudiar una serie de datos sobre las notas de los alumnos de varias clases. Para ello se debe
realizar un programa en Java que permita la introducción de datos, y posteriormente muestre unos
resultados.

El programa debe permitir al usuario la introducción de una serie de clases y sus alumnos y notas,
de la siguiente forma:
Para cada clase, se introducirá en primer lugar su nombre (se sabrá que se desea terminar de
introducir datos cuando el nombre de la misma sea "fin") y a continuación el nombre del tutor. Después
se introducirán los datos de los alumnos de esa clase, de la forma: nombre del alumno, nota obtenida en
el control, nota obtenida en el examen final y nota de clase (son números enteros). La serie de alumnos
de una clase terminará cuando el nombre sea "fin". Para calcular la nota global de un alumno se hace el
60% del examen final, el 30% del control y el 10% de la nota de clase. (1 punto la petición correcta de
datos).

Los resultados que se deben mostrar al finalizar la introducción de datos son:

a) (1 punto) Nombre de la clase con mayor número neto de alumnos con la nota global aprobada.

b) (1,5 puntos) Nombre del tutor de la clase con menor porcentaje de suspensos (nota global), y
ese porcentaje.

c) (1 punto) Número de clases en las que el número de aprobados (nota global) es mayor que el
de suspensos.

d) (1 punto) Porcentaje de alumnos del centro con la nota del examen final (no la global, sino la
del examen final) aprobada.

e) (1,5 puntos) Si hubiera alguna clase en la que los tres primeros alumnos introducidos tienen la
nota del control aprobada (no la global), se debe indicar con un mensaje.

*/

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar los resultados requeridos
        String nombreClase;
        String nombreAlumno;
        String claseConMayorAprobados = "";
        int maxAprobados = 0;

        String tutorConMenorSuspensos = "";
        double menorPorcentajeSuspensos = 100.0;

        int clasesMasAprobadosQueSuspensos = 0;
        int totalAlumnosCentro = 0;
        int totalAprobadosExamenFinalCentro = 0;
        boolean tresPrimerosAprobados = false;

        int notaClase, notaControl, notaExamenFinal;


        System.out.print("Ingrese el nombre de la clase (o 'fin' para terminar): ");
        nombreClase = scanner.nextLine();

        // Ingreso de datos para cada clase
        while (!nombreClase.equalsIgnoreCase("fin")) {

            // Variables para la clase actual
            int numAlumnos = 0;
            int aprobadosGlobalClase = 0;
            int suspensosGlobalClase = 0;
            int aprobadosExamenFinalClase = 0;
            boolean primerosTresAprobadosControl = true;

            System.out.print("Ingrese el nombre del tutor: ");
            String nombreTutor = scanner.nextLine();

            System.out.print("Ingrese el nombre del alumno (o 'fin' para terminar): ");
            nombreAlumno = scanner.nextLine();

            // Ingreso de datos para cada alumno en la clase
            for (int i = 1; !nombreAlumno.equalsIgnoreCase("fin") ; i++) {

                System.out.print("Ingrese la nota del control: ");
                notaControl = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese la nota del examen final: ");
                notaExamenFinal = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese la nota de clase: ");
                notaClase = Integer.parseInt(scanner.nextLine());


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

                System.out.print("Ingrese el nombre del alumno (o 'fin' para terminar): ");
                nombreAlumno = scanner.nextLine();

            } //FIN FOR


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

            System.out.print("Ingrese el nombre de la clase (o 'fin' para terminar): ");
            nombreClase = scanner.nextLine();
        } //FIN WHILE

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