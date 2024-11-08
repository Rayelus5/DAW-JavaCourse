package Primero.PrimerTrimestre.Tarea;
// RAIMUNDO PALMA MÉNDEZ - Trabajito 1 Programación


import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection") // Para evitar warnings de palabras no reconocidas por el diccionario

public class Trabajo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar las tres palabras más largas y sus longitudes
        String frase, palabra1 = "", palabra2 = "", palabra3 = "";
        int longitud1 = 0, longitud2 = 0, longitud3 = 0;


        // Pedir al usuario que introduzca una frase o párrafo
        System.out.print("Introduce una frase o párrafo: ");
        // Replaza cualquier cosa que no sea letras minúsculas y mayúsculas (incluyendo la ñ), números, y espacios.
        frase = scanner.nextLine().replaceAll("[^a-zA-Z0-9ñ\\s]", "");


        // Creamos un nuevo scanner para leer cada palabra de la variable frase
        Scanner palabraScanner = new Scanner(frase);

        while (palabraScanner.hasNext()) {
            String palabra = palabraScanner.next();
            int longitud = palabra.length();

            // Actualizar las tres palabras más largas en orden descendente (TOP 1 > 2 > 3)
            if (longitud > longitud1) {
                // - - Desplazar las palabras hacia abajo
                palabra3 = palabra2;
                longitud3 = longitud2;
                palabra2 = palabra1;
                longitud2 = longitud1;

                // Colocamos la nueva palabra en la posición 1 (TOP 1)
                palabra1 = palabra;
                longitud1 = longitud;
            } else if (longitud > longitud2) {
                // - - Desplazar la tercera palabra hacia abajo
                palabra3 = palabra2;
                longitud3 = longitud2;

                // Colocamos la nueva palabra en la posición 2 (TOP 2)
                palabra2 = palabra;
                longitud2 = longitud;
            } else if (longitud > longitud3) {
                // Colocamos la nueva palabra en la posición 3 (TOP 3)
                palabra3 = palabra;
                longitud3 = longitud;
            }
        }

        // Mostramos las tres palabras más largas si no están vacias, si no se introduce ninguna se le comunica al usuario :P

        if (!palabra1.isEmpty()) {
            System.out.println("Las tres palabras más largas son:");
            System.out.println("1. " + palabra1 + " (Longitud: " + longitud1 + ")");
            if (!palabra2.isEmpty()) System.out.println("2. " + palabra2 + " (Longitud: " + longitud2 + ")");
            if (!palabra3.isEmpty()) System.out.println("3. " + palabra3 + " (Longitud: " + longitud3 + ")");
        } else {
            System.out.println("No se ha introducido ninguna palabra. Tenías un único trabajo y lo has hecho mal.");
        }
    }
}