package Primero.PrimerTrimestre.Practica.Ejercicio_Controles.Examen7_17_18;

import java.util.ArrayList;
import java.util.Scanner;

class Jugador {
    String nombre;
    int edad;
    double precioFicha;
    char posicion;
    int golesMarcados; // solo para delanteros
    int penaltisEncajados; // solo para porteros

    public Jugador(String nombre, int edad, double precioFicha, char posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.precioFicha = precioFicha;
        this.posicion = posicion;
        this.golesMarcados = 0;
        this.penaltisEncajados = 0;
    }
}

class Equipo {
    String nombre;
    int puntos;
    ArrayList<Jugador> jugadores;

    public Equipo(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.jugadores = new ArrayList<>();
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Equipo> equipos = new ArrayList<>();

        // Entrada de datos
        while (true) {
            System.out.print("Introduce el nombre del equipo (o 'fin' para terminar): ");
            String nombreEquipo = scanner.nextLine();
            if (nombreEquipo.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Introduce los puntos del equipo: ");
            int puntos = Integer.parseInt(scanner.nextLine());

            System.out.print("Introduce el número de jugadores: ");
            int numJugadores = Integer.parseInt(scanner.nextLine());

            Equipo equipo = new Equipo(nombreEquipo, puntos);

            for (int i = 0; i < numJugadores; i++) {
                System.out.print("Introduce el nombre del jugador: ");
                String nombreJugador = scanner.nextLine();

                System.out.print("Introduce la edad del jugador: ");
                int edad = Integer.parseInt(scanner.nextLine());

                System.out.print("Introduce el precio de la ficha del jugador: ");
                double precioFicha = Double.parseDouble(scanner.nextLine());

                System.out.print("Introduce la posición (D - delantero, P - portero, F - defensa, L - lateral): ");
                char posicion = scanner.nextLine().toUpperCase().charAt(0);

                Jugador jugador = new Jugador(nombreJugador, edad, precioFicha, posicion);

                if (posicion == 'D') {
                    System.out.print("Introduce el número de goles marcados: ");
                    jugador.golesMarcados = Integer.parseInt(scanner.nextLine());
                } else if (posicion == 'P') {
                    System.out.print("Introduce el número de penaltis encajados: ");
                    jugador.penaltisEncajados = Integer.parseInt(scanner.nextLine());
                }

                equipo.jugadores.add(jugador);
            }
            equipos.add(equipo);
        }

        // Procesamiento de resultados
        calcularResultados(equipos);
    }

    public static void calcularResultados(ArrayList<Equipo> equipos) {
        int totalEdadDefensas = 0;
        int totalDefensas = 0;

        Jugador fichaMasCara = null;
        double precioMax = 0;

        Equipo equipoMejorRendimiento = null;
        double maxRendimiento = 0;

        for (Equipo equipo : equipos) {
            int numDefensas = 0, numPorteros = 0, numLaterales = 0;

            for (Jugador jugador : equipo.jugadores) {
                if (jugador.posicion == 'F') {
                    totalEdadDefensas += jugador.edad;
                    totalDefensas++;
                }
                if (jugador.precioFicha > precioMax && equipo.jugadores.size() < 7) {
                    precioMax = jugador.precioFicha;
                    fichaMasCara = jugador;
                }
                if (jugador.posicion == 'F') numDefensas++;
                if (jugador.posicion == 'P') numPorteros++;
                if (jugador.posicion == 'L') numLaterales++;
            }

            double rendimiento = equipo.puntos / (double) equipo.jugadores.size();
            if (rendimiento > maxRendimiento) {
                maxRendimiento = rendimiento;
                equipoMejorRendimiento = equipo;
            }

            if (numPorteros == 0 && numLaterales == 0) {
                System.out.println("El equipo " + equipo.nombre + " no tiene porteros ni laterales.");
            }
        }

        // Resultados
        if (totalDefensas > 0) {
            System.out.printf("Media de edad de todos los defensas: %.2f\n", (double) totalEdadDefensas / totalDefensas);
        } else {
            System.out.println("No hay defensas en los equipos.");
        }

        if (fichaMasCara != null) {
            System.out.println("Jugador con la ficha más cara de equipos con menos de 7 jugadores: " + fichaMasCara.nombre);
        } else {
            System.out.println("No hay jugadores en equipos con menos de 7 jugadores.");
        }

        if (equipoMejorRendimiento != null) {
            System.out.println("Equipo con mejor rendimiento: " + equipoMejorRendimiento.nombre);
        }
    }
}
