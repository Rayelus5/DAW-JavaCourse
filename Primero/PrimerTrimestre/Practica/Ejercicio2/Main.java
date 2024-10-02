package Primero.PrimerTrimestre.Practica.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        //Numéricos
        byte byteVariable = 127; //-128 a 127 - ENTERO CORTO
        System.out.println("byteVariable: " + byteVariable);

        short shortVariable = 32767; //-32768 a 32767 - ENTERO
        System.out.println("shortVariable: " + shortVariable);

        int intVariable = 2147483647; //-2147483648 a 2147483647 - ENTERO
        System.out.println("intVariable: " + intVariable);

        long longVariable = 9223372036854775807L; //-9223372036854775808 a 92233720368547758 - ENTERO LARGO
        System.out.println("longVariable: " + longVariable);

        //Decimales
        float floatVariable = 3.14159f; //6-7 digits - REAL PRECISION SENCILLA
        System.out.println("floatVariable: " + floatVariable);

        double doubleVariable = 2.71828182846; //more than 15 digits - REAL PRECISION DOBLE
        System.out.println("doubleVariable: " + doubleVariable);

        //TRUE or FALSE
        boolean booleanVariable = true; //true o false --> (1 o 0) - LÓGICO
        System.out.println("booleanVariable: " + booleanVariable);

        //Caracteres
        char charVariable = 'A'; // Un caracter Unicode - TEXTO
        System.out.println("charVariable: " + charVariable);

        String stringVariable = "Hello World!"; // Cadena de caracteres
        System.out.println("stringVariable: " + stringVariable);


        //CONSTANTE (no es lo mismo que una variable por que no varia, no se modifican)
        final byte MAYORIA_EDAD = 18;
        System.out.println("MAYORIA_EDAD: " + MAYORIA_EDAD);
    }
}
