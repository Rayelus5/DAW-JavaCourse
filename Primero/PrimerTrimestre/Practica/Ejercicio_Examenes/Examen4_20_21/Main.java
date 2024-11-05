package Primero.PrimerTrimestre.Practica.Ejercicio_Examenes.Examen4_20_21;

import java.util.Scanner;

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
        int cilindradaGasolinaMin = Integer.MAX_VALUE;
        int sucursalesConKilometrajeAlto = 0;
        int sucursalesMasGasolinaQueDiesel = 0;
        int sumaCilindrada;
        int sumaKilometros;
        int conteoGasolina;
        int conteoDiesel;

        System.out.print("Cod Sucursal (fin para finalizar) : ");
        codigoSucursal = scanner.nextLine();

        while (!codigoSucursal.equalsIgnoreCase("fin")) {

            // Leer el número de vehículos de la sucursal
            int numVehiculos = Integer.parseInt(scanner.nextLine());

            sumaCilindrada = 0;
            sumaKilometros = 0;
            conteoGasolina = 0;
            conteoDiesel = 0;

            for (int i = 0; i < numVehiculos; i++) {
                matricula = scanner.nextLine();
                tipoCombustible = scanner.nextLine().charAt(0);
                cilindrada = Integer.parseInt(scanner.nextLine());
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
