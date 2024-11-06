package Primero.PrimerTrimestre.Control;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection") // Para evitar warnings de palabras no reconocidas por el diccionario

// RAIMUNDO PALMA MÉNDEZ 1ºDAW

/*  CONTROL 06/11/2024 - PROGRAMACIÓN

El programa debe permitir al usuario la introducción de una serie de nombres de estados, sus
habitantes y los resultados de las elecciones de los grandes partidos norteamericanos: Partido
Republicano (Donald Trump), Partido Demócrata (Kamala Harris), Partido Libertario (Jo Jorgensen)
y Partido Verde (Howie Hawkins), de la siguiente forma:

Para cada estado se introducirá su nombre y después el número de habitantes (long). Tras el
número de habitantes, los resultados que han obtenido los partidos; si el estado tiene menos de
15.000.000 habitantes, sólo se introducirán los datos de los Demócratas y los Republicanos. Si el estado
tiene al menos 15.000.000, se introducirán los resultados de Demócratas, Republicanos, Libertarios y
Verdes, en ese orden. Todos los datos numéricos introducidos serán de tipo long.

Tras los datos de un estado se pasará a pedir el nombre del siguiente y sus datos, hasta que el
nombre de estado sea “fin”, entonces se mostrarán los datos que calculará el programa. (0,5 puntos la
petición correcta de datos; junto con la valoración global del programa: código correcto, indentado y
comentado; la claridad de código y su eficiencia y la inexistencia de código o variables superfluas).

Los resultados que se deben mostrar al finalizar la introducción de datos son:

a) (1 puntos) Promedio de votos del partido Verde, en aquellos estados donde se han introducido datos.
b) (2 puntos) Nombre del estado donde el partido Republicano ha sacado más votos de ventaja al partido Demócrata, y esa diferencia de votos.
c) (2 puntos) Nombre del estado con menor participación, es decir, con menor número de votos con respecto a su población, y ese porcentaje.
d) (2 puntos) Número de estados donde los Demócratas se han llevado más de la mitad de los votos.
e) (2,5 puntos) Nombre de los tres estados con más habitantes, ordenado de mayor a menor número de habitantes
*/

public class Control1 {

    public static final long MIN_HABITANTES = 15000000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializamos las variables
        String nombreEstado, estadoMayorHabitantes1="", estadoMayorHabitantes2="", estadoMayorHabitantes3="",nombreEstadoMenorParticipacion="", nombreEstadoVentajaRepu = "";
        long numeroMayorHabitantes1=0, numeroMayorHabitantes2=0, numeroMayorHabitantes3=0;
        long diferenciaVotosRepu = 0, mayorDiferenciaVotosRepu = 0;
        long numHabitantes, resultDemo, resultRepu, resultLiber, resultVerde, totalDemo = 0, totalRepu = 0, totalLiber = 0, totalVerde = 0, votosTotales=0, votosTotalesEstado=0;
        int votosEstadoVerde = 0, numeroEstadosMayorDemocratas = 0;
        float porcentajeMenorParticipacion = 0;
        long promedioVotosVerde = 0, votosTotalesEstadoMenorParticipacion=0, diferenciaVotosHabitantes, diferenciaVotosHabitantesMax=Long.MIN_VALUE;




        //Pedimos el nombre del Estado
        System.out.print("Nombre del estado: ");
        nombreEstado = scanner.nextLine();

        while (!nombreEstado.equalsIgnoreCase("fin")) {

            // REINICIAMOS
            votosTotalesEstado = 0;

            //Pedimos el número de habitantes del Estado
            System.out.print("Número de habitantes: ");
            numHabitantes = Long.parseLong(scanner.nextLine());

            // DETECTAMOS y ORDENAMOS de mayor a menor los estados con más habitantes
            if (numHabitantes > numeroMayorHabitantes1) {
                numeroMayorHabitantes3 = numeroMayorHabitantes2;
                estadoMayorHabitantes3 = estadoMayorHabitantes2;

                numeroMayorHabitantes2 = numeroMayorHabitantes1;
                estadoMayorHabitantes2 = estadoMayorHabitantes1;

                numeroMayorHabitantes1 = numHabitantes;
                estadoMayorHabitantes1 = nombreEstado;

            } else if (numHabitantes > numeroMayorHabitantes2) {
                numeroMayorHabitantes3 = numeroMayorHabitantes2;
                estadoMayorHabitantes3 = estadoMayorHabitantes2;

                numeroMayorHabitantes2 = numHabitantes;
                estadoMayorHabitantes2 = nombreEstado;
            } else if (numHabitantes > numeroMayorHabitantes3) {
                numeroMayorHabitantes3 = numHabitantes;
                estadoMayorHabitantes3 = nombreEstado;
            }


            // SI EL NÚMERO DE HABITANTES ES MENOR A 15.000.000
            if (numHabitantes < MIN_HABITANTES) {
                //Pedimos los resultados del partido DEMÓCRATA y REPUBLICANO
                System.out.print("Resultado partido demócrata: ");
                resultDemo = Long.parseLong(scanner.nextLine());
                totalDemo += resultDemo;

                votosTotales += totalDemo;


                System.out.print("Resultado partido republicáno: ");
                resultRepu = Long.parseLong(scanner.nextLine());
                totalRepu += resultRepu;

                votosTotales += totalRepu;

                votosTotalesEstado = resultDemo + resultRepu;


                if (resultRepu > resultDemo) {
                    diferenciaVotosRepu = resultRepu - resultDemo;

                    if (mayorDiferenciaVotosRepu < diferenciaVotosRepu) {
                        nombreEstadoVentajaRepu = nombreEstado;
                        mayorDiferenciaVotosRepu = diferenciaVotosRepu;
                    }
                }

            } else {
                //Pedimos los resultados de TODOS los partidos
                System.out.print("Resultado partido demócrata: ");
                resultDemo = Long.parseLong(scanner.nextLine());
                totalDemo += resultDemo;

                votosTotales += totalDemo;


                System.out.print("Resultado partido republicáno: ");
                resultRepu = Long.parseLong(scanner.nextLine());
                totalRepu += resultRepu;

                votosTotales += totalRepu;

                if (resultRepu > resultDemo) {
                    diferenciaVotosRepu = resultRepu - resultDemo;

                    if (mayorDiferenciaVotosRepu < diferenciaVotosRepu) {
                        nombreEstadoVentajaRepu = nombreEstado;
                        mayorDiferenciaVotosRepu = diferenciaVotosRepu;
                    }
                }

                System.out.print("Resultado partido libertario: ");
                resultLiber = Long.parseLong(scanner.nextLine());
                totalLiber += resultLiber;

                votosTotales += totalLiber;


                System.out.print("Resultado partido verde: ");
                resultVerde = Long.parseLong(scanner.nextLine());
                totalVerde += resultVerde;

                votosTotales += totalVerde;
                votosEstadoVerde++;

                votosTotalesEstado = resultDemo + resultRepu + resultLiber + resultVerde;

            }


            // ESTADO CON MENOR PARTICIPACION
            if (numHabitantes > votosTotalesEstado) {
                diferenciaVotosHabitantes = numHabitantes - votosTotalesEstado;
                if (diferenciaVotosHabitantes > diferenciaVotosHabitantesMax) {
                    diferenciaVotosHabitantesMax = diferenciaVotosHabitantes;
                    votosTotalesEstadoMenorParticipacion = votosTotalesEstado;

                    nombreEstadoMenorParticipacion = nombreEstado;
                    porcentajeMenorParticipacion = ((float)votosTotalesEstadoMenorParticipacion / numeroMayorHabitantes1) * 100;
                }
            }


            // NÚMERO de estados donde los DEMÓCRATAS se han llevado más del 50% de los votos totales.
            if (resultDemo > (votosTotalesEstado/2) ) {
                numeroEstadosMayorDemocratas++;
            }


            //Pedimos el nombre del Estado de nuevo
            System.out.print("Nombre del estado: ");
            nombreEstado = scanner.nextLine();

        }

        // Conseguimos el promedio (o media) de votos del partido VERDE
        promedioVotosVerde = totalVerde / votosEstadoVerde;

        // Determinamos cuales son los tres estados con más habitantes en una sola variable STRING
        String estadosMayorHabitantes = estadoMayorHabitantes1 + ", " + estadoMayorHabitantes2 + " y " + estadoMayorHabitantes3;


        // ========================
        // Mostramos los resultados
        // ========================

        System.out.println("A. Promedio de votos del partido VERDE: "+promedioVotosVerde);
        System.out.println("B. En el estado "+nombreEstadoVentajaRepu+" el partido Republicano ha obtenido "+mayorDiferenciaVotosRepu+" más de ventaja.");
        // Con "printf" podemos imprimir variables directamente con %s y %.2f%% (significa que la primera es un STRING y la segunda un FLOAT con 2 decimales y que muestra el símbolo %
        System.out.printf("C. El estado con menor participación ha sido %s con un %.2f%% de participación.\n", nombreEstadoMenorParticipacion, porcentajeMenorParticipacion);
        System.out.println("D. Los Demócratas se han llevado más de la mitad de los votos en "+numeroEstadosMayorDemocratas+" estados.");
        System.out.println("E. Los tres estados con más habitantes son: "+estadosMayorHabitantes);
    }
}
