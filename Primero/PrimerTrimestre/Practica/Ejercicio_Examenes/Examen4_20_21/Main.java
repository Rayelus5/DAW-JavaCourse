package Primero.PrimerTrimestre.Practica.Ejercicio_Examenes.Examen4_20_21;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")

/**
 * En la empresa de alquiler de coches "Cars for Rent Hermanos Machado"
 * ( CRHM), se pretende contabilizar una serie de datos sobre los vehículos de alquiler de los que dispone.
 * Para ello se debe realizar un programa en Java que permita la introducción de datos, y posteriormente
 * muestre unos resultados.
 * El programa debe permitir al usuario la introducción de una serie de datos de sucursales y
 * vehículos, de la siguiente forma:
 * Para cada sucursal, se introducirá en primer lugar el código de la sucursal (una cadena
 * alfanumérica). Se sabrá que se desea terminar de introducir datos cuando el código de la sucursal sea
 * "fin".
 *
 * Para cada sucursal, se introducirá primero el número de vehículos que hay en la sucursal, y a
 * continuación, para cada vehículo de esa sucursal se introducirá la matrícula ( cadena alfanumérica), el
 * tipo de combustible ('G' o 'D'), la cilindrada del vehículo (un número entero) y los kilómetros que tiene
 * (número entero). Cuando se acabe con los vehículos de una sucursal, se pasará a la siguiente. (1 punto
 * la petición correcta de datos; 1 punto la valoración global del programa: código correcto, indentado y
 * comentado; la claridad de código y su eficiencia y la inexistencia de código o variables superfluas).
 *
 * Los resultados que se deben mostrar al finalizar la introducción de datos son:
 *
 * a) (2 puntos) Código de la sucursal con mayor media de cilindrada de sus vehículos, y esa media.
 * b) (2 puntos) Matrícula del coche de gasolina con menor cilindrada de toda la empresa.
 * e) (2 puntos) En cuántas sucursales con más de 3 vehículos la media de kilometraje de sus coches supera los 70.000 kms.
 * d) (2 puntos) En cuántas sucursales hay más vehículos de gasolina que diésel.
 *
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String codigoSucursal;
        String matricula;
        char tipoCombustible;
        int cilindrada;
        int kilometros;
        String codigoSucursalMayorMediaCilindrada = "";
        String matriculaGasolinaMinCilindrada = "";
        double mayorMediaCilindrada = 0;
        int cilindradaGasolinaMin = 10000;
        int sucursalesConKilometrajeAlto = 0;
        int sucursalesMasGasolinaQueDiesel = 0;
        int sumaCilindrada;
        int sumaKilometros;
        int conteoGasolina;
        int conteoDiesel;
        int numVehiculos;

        System.out.print("Cod Sucursal (fin para finalizar): ");
        codigoSucursal = scanner.nextLine();

        while (!codigoSucursal.equalsIgnoreCase("fin")) {

            // Leer el número de vehículos de la sucursal
            System.out.print("Número de vehículos: ");
            numVehiculos = Integer.parseInt(scanner.nextLine());

            //REINICIAR VALORES PARA LA SUCURSAL
            sumaCilindrada = 0;
            sumaKilometros = 0;
            conteoGasolina = 0;
            conteoDiesel = 0;

            for (int i = 0; i < numVehiculos; i++) {
                System.out.print("Matrícula: ");
                matricula = scanner.nextLine();

                System.out.print("Tipo Combustible: ");
                tipoCombustible = scanner.nextLine().toUpperCase().charAt(0);

                System.out.print("Cilindrada: ");
                cilindrada = Integer.parseInt(scanner.nextLine());

                System.out.print("Kilómetros: ");
                kilometros = Integer.parseInt(scanner.nextLine());

                // Acumular datos de cilindrada y kilometraje
                sumaCilindrada += cilindrada;
                sumaKilometros += kilometros;

                // Contabilizar tipos de combustible
                if (tipoCombustible == 'G') {
                    conteoGasolina++;
                    if (cilindrada < cilindradaGasolinaMin) {
                        cilindradaGasolinaMin = cilindrada;
                        matriculaGasolinaMinCilindrada = matricula;
                    }
                } else if (tipoCombustible == 'D') {
                    conteoDiesel++;
                }
            }

            // Calcular media de cilindrada para la sucursal actual
            double mediaCilindrada = (double) sumaCilindrada / numVehiculos;
            if (mediaCilindrada > mayorMediaCilindrada) {
                mayorMediaCilindrada = mediaCilindrada;
                codigoSucursalMayorMediaCilindrada = codigoSucursal;
            }

            // Calcular media de kilometraje y verificar condiciones para sucursales con más de 3 vehículos
            double mediaKilometraje = (double) sumaKilometros / numVehiculos;
            if (numVehiculos > 3 && mediaKilometraje > 70000) {
                sucursalesConKilometrajeAlto++;
            }

            // Contabilizar sucursales con más vehículos de gasolina que de diésel
            if (conteoGasolina > conteoDiesel) {
                sucursalesMasGasolinaQueDiesel++;
            }

            System.out.print("Cod Sucursal (fin para finalizar): ");
            codigoSucursal = scanner.nextLine();
        }

        // Mostrar resultados finales
        System.out.println("a) Sucursal con mayor media de cilindrada: " + codigoSucursalMayorMediaCilindrada + " con media de " + mayorMediaCilindrada);
        System.out.println("b) Matrícula del coche de gasolina con menor cilindrada: " + matriculaGasolinaMinCilindrada);
        System.out.println("c) Sucursales con más de 3 vehículos y media de kilometraje superior a 70,000 km: " + sucursalesConKilometrajeAlto);
        System.out.println("d) Sucursales con más vehículos de gasolina que de diésel: " + sucursalesMasGasolinaQueDiesel);

    }
}
