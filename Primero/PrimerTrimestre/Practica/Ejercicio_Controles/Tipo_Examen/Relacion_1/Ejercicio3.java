package Primero.PrimerTrimestre.Practica.Ejercicio_Controles.Tipo_Examen.Relacion_1;

import java.util.Scanner;

/*
Una empresa fabrica motores de automóviles. Se pretende contabilizar las unidades
fabricadas cada mes. Para ello, disponemos del número de motores que se ha fabricado
cada día. Realizar un programa en Java que:

- Pida el número del mes que se va a introducir (sólo se van a introducir datos de un mes).

- Para cada día de ese mes debe pedir el número de piezas que se ha fabricado.
Sabemos que en un día nunca se van a fabricar más de 1000 piezas. No todos los
meses tienen igual número de días; consideramos febrero con 28 días.

- Debe mostrarse al final: Qué día se fabricaron más piezas. Cuál fue el mínimo de
piezas fabricadas. Cuántos motores se han fabricado en el mes. Si algún día se ha
fabricado menos de 300 piezas, debe indicarse al final con el mensaje: “Existen días
por debajo del mínimo”.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número del mes
        System.out.print("Introduce el número del mes (1-12): ");
        int mes = scanner.nextInt();

        // Determinar el número de días del mes
        int numDias;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDias = 31;
                break;
            case 4: case 6: case 9: case 11:
                numDias = 30;
                break;
            case 2:
                numDias = 28; // Consideramos febrero con 28 días
                break;
            default:
                System.out.println("Mes no válido. Debe estar entre 1 y 12.");
                scanner.close();
                return; // Salir del programa si el mes es inválido
        }

        // Variables para almacenar datos sobre la producción
        int totalMotoresFabricados = 0;
        int diaMaxPiezas = 0;
        int maxPiezas = Integer.MIN_VALUE;
        int minPiezas = Integer.MAX_VALUE;
        boolean existenDiasMinimos = false;

        // Solicitar el número de piezas fabricadas por cada día del mes
        for (int dia = 1; dia <= numDias; dia++) {
            int piezasFabricadas;
            do {
                System.out.print("Introduce el número de piezas fabricadas el día " + dia + " (máximo 1000): ");
                piezasFabricadas = scanner.nextInt();
            } while (piezasFabricadas < 0 || piezasFabricadas > 1000);

            // Acumular el total de piezas fabricadas
            totalMotoresFabricados += piezasFabricadas;

            // Actualizar el máximo y el día de máxima producción
            if (piezasFabricadas > maxPiezas) {
                maxPiezas = piezasFabricadas;
                diaMaxPiezas = dia;
            }

            // Actualizar el mínimo de piezas fabricadas
            if (piezasFabricadas < minPiezas) {
                minPiezas = piezasFabricadas;
            }

            // Comprobar si algún día se fabricaron menos de 300 piezas
            if (piezasFabricadas < 300) {
                existenDiasMinimos = true;
            }
        }

        // Mostrar resultados
        System.out.println("\nDía con mayor producción: Día " + diaMaxPiezas + " con " + maxPiezas + " piezas fabricadas.");
        System.out.println("Mínimo de piezas fabricadas en un día: " + minPiezas);
        System.out.println("Total de motores fabricados en el mes: " + totalMotoresFabricados);

        if (existenDiasMinimos) {
            System.out.println("Existen días por debajo del mínimo (menos de 300 piezas).");
        }

        // Cerrar el scanner
        scanner.close();
    }
}

