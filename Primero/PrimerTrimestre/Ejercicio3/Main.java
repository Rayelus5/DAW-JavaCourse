package Primero.PrimerTrimestre.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        int n;
        n = 17;
        System.out.println("¿El número es par?: " + (n % 2 == 0) + "\n" + ((n % 2 == 0) ?
                (n + " es par") : (n + " es impar")
        ));
        // && -> Y    -    || -> O
        int m;
        m = 2100;
        System.out.println("¿El año " + m + " es bisiesto?: " + ((m%4 == 0 && m%100 != 0) || m%400 == 0) + "\n");
    }
}
