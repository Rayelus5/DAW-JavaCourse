package Primero.PrimerTrimestre.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        // Conversión String --> Número
        int n = 0;
        double d = 0;
        float f = 0;
        long l = 0;
        String cad1 = "37", cad2 = "123.456";

        n = Integer.parseInt(cad1);
        System.out.println("Conversion realizada correctamente. n = " + n);

        //Preincremento ++n (Se incrementa y devuelve el valor actualizado)
        //Postincremento n++ (Se incrementa y devuelve el valor anterior)

        f = Float.parseFloat(cad2);
        System.out.println("Conversion realizada correctamente. f = " + f);
    }
}
