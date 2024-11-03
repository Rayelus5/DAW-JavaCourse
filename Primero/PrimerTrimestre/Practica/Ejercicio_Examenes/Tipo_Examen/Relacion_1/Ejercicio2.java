package Primero.PrimerTrimestre.Practica.Ejercicio_Examenes.Tipo_Examen.Relacion_1;

import java.util.Scanner;

/*
Un grupo de biólogos está realizando un trabajo de campo, tomando medidas de árboles
de un bosque. Una vez tomados los datos, deben introducirlos en un ordenador. Los datos
que han tomado de los árboles son: Tipo del árbol (A o B), diámetro del tronco y altura en
metros. Además, si el árbol es de tipo B, se dispone de la edad del mismo en años.

Realizar un programa en Java que:

- Pida el número de árboles de los que se van a introducir datos.

- Para cada árbol, debe pedir el tipo, diámetro y altura; si es tipo B además, la edad.

- Debe mostrarse al final: Media de las alturas de los árboles. Altura máxima,
mínima, diámetro máximo y mínimo. Media de las edades de árboles del tipo B. Si
existe algún árbol de más de 30 m., debe indicarse al final con el mensaje: “Existen
árboles de más de 30 m.”
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de árboles
        System.out.print("Introduce el número de árboles de los que se van a introducir datos: ");
        int numArboles = scanner.nextInt();

        // Variables para almacenar datos generales de los árboles
        double sumaAlturas = 0;
        double alturaMaxima = Double.MIN_VALUE;
        double alturaMinima = Double.MAX_VALUE;
        double diametroMaximo = Double.MIN_VALUE;
        double diametroMinimo = Double.MAX_VALUE;
        int countTipoB = 0;
        double sumaEdadesTipoB = 0;
        boolean existenArbolesAltos = false;

        // Consumir el salto de línea pendiente
        scanner.nextLine();

        // Solicitar los datos para cada árbol
        for (int i = 1; i <= numArboles; i++) {
            System.out.print("Introduce el tipo de árbol (A o B) para el árbol " + i + ": ");
            String tipoArbol = scanner.nextLine().toUpperCase();

            System.out.print("Introduce el diámetro del tronco en metros: ");
            double diametro = scanner.nextDouble();

            System.out.print("Introduce la altura del árbol en metros: ");
            double altura = scanner.nextDouble();

            // Sumar la altura para calcular la media al final
            sumaAlturas += altura;

            // Actualizar la altura máxima y mínima
            if (altura > alturaMaxima) {
                alturaMaxima = altura;
            }
            if (altura < alturaMinima) {
                alturaMinima = altura;
            }

            // Actualizar el diámetro máximo y mínimo
            if (diametro > diametroMaximo) {
                diametroMaximo = diametro;
            }
            if (diametro < diametroMinimo) {
                diametroMinimo = diametro;
            }

            // Comprobar si el árbol es de tipo B para solicitar la edad
            if (tipoArbol.equals("B")) {
                System.out.print("Introduce la edad del árbol en años: ");
                int edad = scanner.nextInt();
                sumaEdadesTipoB += edad;
                countTipoB++;
            }

            // Verificar si existe algún árbol con más de 30 m de altura
            if (altura > 30) {
                existenArbolesAltos = true;
            }

            // Consumir la línea restante para evitar problemas con el scanner
            scanner.nextLine();
        }

        // Calcular las medias
        double mediaAlturas = sumaAlturas / numArboles;
        double mediaEdadesTipoB = (countTipoB > 0) ? (sumaEdadesTipoB / countTipoB) : 0;

        // Mostrar resultados
        System.out.println("\nMedia de las alturas de los árboles: " + mediaAlturas + " metros");
        System.out.println("Altura máxima: " + alturaMaxima + " metros");
        System.out.println("Altura mínima: " + alturaMinima + " metros");
        System.out.println("Diámetro máximo: " + diametroMaximo + " metros");
        System.out.println("Diámetro mínimo: " + diametroMinimo + " metros");
        if (countTipoB > 0) {
            System.out.println("Media de las edades de los árboles tipo B: " + mediaEdadesTipoB + " años");
        } else {
            System.out.println("No hay árboles tipo B para calcular la media de edades.");
        }

        if (existenArbolesAltos) {
            System.out.println("Existen árboles de más de 30 m.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}