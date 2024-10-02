package Primero.PrimerTrimestre.Practica.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        int[] fechaHoy = {23, 8, 2025};
        int[] fechaNac = {24, 9, 2006};
        System.out.println("¿Es tu cumple hoy? " + ((fechaHoy[0] == fechaNac[0] && fechaHoy[1] == fechaNac[1]) ? "Sí" : "No"));

        System.out.println("¿Eres mayor de edad? " +
                ( fechaHoy[2] - fechaNac[2] > 18 ||
                        fechaHoy[2] - fechaNac[2] == 18 && fechaHoy[1] > fechaNac[1] ||
                        fechaHoy[2] - fechaNac[2] == 18 && fechaHoy[1] == fechaNac[1] && fechaHoy[0] >= fechaNac[0]
                        ? "Sí" : "No"));

        // añoactual - añonac > 18 ||
        // añoact - añonac == 18 && mesact > mesnac
        // añoact - añonac == 18 && mesact == mesnac && diaact >= dianac


        // Si es el año donde cumple 18 pero el mes y dia de cumpleaños ya ha pasado
        // Si ha pasado más de 18 años
    }
}
