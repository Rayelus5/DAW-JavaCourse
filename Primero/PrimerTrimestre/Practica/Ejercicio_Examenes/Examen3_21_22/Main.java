package Primero.PrimerTrimestre.Practica.Ejercicio_Examenes.Examen3_21_22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String localidad, nombrePromocion, nombrePrimeraProteccionOficial = "", nombreUltimaProteccionOficial = "";
        String localidadMenorPromedio = "", localidadMayorProporcion = "", nombrePromocionMasIngresos = "";
        float sumaSubvenciones = 0, sumaSuperficieNoProteccion = 0;
        int totalViviendasNoProteccion = 0, totalPromocionesConSubvenciones = 0;

        float mayorProporcionViviendasProteccion = 0, mayorIngresoBruto = 0;
        int menorNumeroPromedioViviendas = Integer.MAX_VALUE, numeroTotalLocalidades = 0;

        while (true) {
            System.out.print("Introduce el nombre de la localidad (o 'fin' para terminar): ");

            localidad = sc.nextLine();
            if (localidad.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Introduce el número de promociones en esta localidad: ");
            int numeroPromociones = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer

            int totalViviendasLocalidad = 0;
            int totalViviendasProteccionLocalidad = 0;
            int totalPromocionesProteccion = 0;
            float subvencionLocalidad = 0;

            for (int i = 0; i < numeroPromociones; i++) {
                System.out.print("Introduce el nombre de la promoción: ");
                nombrePromocion = sc.nextLine();

                System.out.print("¿Es de Protección Oficial? (S/N): ");
                char proteccionOficial = sc.nextLine().charAt(0);

                while(((proteccionOficial != 'S') && (proteccionOficial != 's')) && ((proteccionOficial != 'N') && (proteccionOficial != 'n'))) {
                    System.out.print("¿Es de Protección Oficial? (S/N): ");
                    proteccionOficial = sc.nextLine().charAt(0);
                }

                System.out.print("Introduce el número de viviendas de la promoción: ");
                int numeroViviendas = sc.nextInt();


                String metrosCuadradosStr = sc.nextLine().replaceAll(",", ".");
                // Validamos que no sea una cadena vacía
                while (metrosCuadradosStr.isEmpty()) {
                    System.out.print("Introduce los m2 de una vivienda: ");
                    metrosCuadradosStr = sc.nextLine().replaceAll(",", ".");
                }

                float metrosCuadrados = Float.parseFloat(metrosCuadradosStr);


                System.out.print("Introduce el precio de una vivienda: ");
                float precioVivienda = sc.nextFloat();
                sc.nextLine();  // Limpiar el buffer

                float ingresosBrutos = numeroViviendas * precioVivienda;

                // Comprobación de ingresos brutos
                if (ingresosBrutos > mayorIngresoBruto) {
                    mayorIngresoBruto = ingresosBrutos;
                    nombrePromocionMasIngresos = nombrePromocion;
                }

                // Comprobaciones de protección oficial
                if (proteccionOficial == 'S' || proteccionOficial == 's') {
                    System.out.print("Introduce el importe subvencionado: ");
                    float importeSubvencionado = sc.nextFloat();
                    sc.nextLine();  // Limpiar el buffer

                    subvencionLocalidad += importeSubvencionado;
                    totalPromocionesProteccion++;
                    totalViviendasProteccionLocalidad += numeroViviendas;

                    if (totalPromocionesConSubvenciones == 0) {
                        nombrePrimeraProteccionOficial = nombrePromocion;
                    }
                    nombreUltimaProteccionOficial = nombrePromocion;

                    totalPromocionesConSubvenciones++;
                    sumaSubvenciones += importeSubvencionado;
                } else {
                    sumaSuperficieNoProteccion += (float)(metrosCuadrados * numeroViviendas);
                    totalViviendasNoProteccion += numeroViviendas;
                }

                totalViviendasLocalidad += numeroViviendas;
            }

            // Cálculo de promedio de viviendas en la localidad
            int promedioViviendasLocalidad = totalViviendasLocalidad / numeroPromociones;
            if (promedioViviendasLocalidad < menorNumeroPromedioViviendas) {
                menorNumeroPromedioViviendas = promedioViviendasLocalidad;
                localidadMenorPromedio = localidad;
            }

            // Cálculo de proporción de viviendas de protección oficial en la localidad
            if (totalViviendasProteccionLocalidad > 0) {
                float proporcionProteccionOficial = (totalViviendasProteccionLocalidad * 100.0f) / totalViviendasLocalidad;
                if (proporcionProteccionOficial > mayorProporcionViviendasProteccion) {
                    mayorProporcionViviendasProteccion = proporcionProteccionOficial;
                    localidadMayorProporcion = localidad;
                }
            }

            numeroTotalLocalidades++;
        }

        // Resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("a) Primera promoción de Protección Oficial: " + nombrePrimeraProteccionOficial);
        System.out.println("   Última promoción de Protección Oficial: " + nombreUltimaProteccionOficial);

        System.out.println("b) Localidad con menor número medio de viviendas por promoción: " + localidadMenorPromedio);
        System.out.println("   Media: " + menorNumeroPromedioViviendas);

        System.out.println("c) Promoción que generará más ingresos brutos: " + nombrePromocionMasIngresos);

        System.out.println("d) Localidad con mayor proporción de viviendas de Protección Oficial: " + localidadMayorProporcion);
        System.out.println("   Proporción: " + mayorProporcionViviendasProteccion + "%");

        if (totalViviendasNoProteccion > 0) {
            float mediaSuperficieNoProteccion = sumaSuperficieNoProteccion / totalViviendasNoProteccion;
            System.out.println("e) Superficie media de todas las viviendas no de Protección Oficial: " + mediaSuperficieNoProteccion + " m2");
        } else {
            System.out.println("e) No hay viviendas que no sean de Protección Oficial.");
        }

        if (totalPromocionesConSubvenciones >= 3) {
            float mediaSubvenciones = sumaSubvenciones / totalPromocionesConSubvenciones;
            System.out.println("f) Media de los importes subvencionados en promociones de localidades con al menos tres promociones: " + mediaSubvenciones);
        } else {
            System.out.println("f) No hay localidades con al menos tres promociones.");
        }

        sc.close();
    }
}
