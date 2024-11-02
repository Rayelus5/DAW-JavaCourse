package Primero.PrimerTrimestre.Practica.EjemplosTablas;

public class Ejemplo2 {
    public static void main(String[] args) {
        //Declaración
        int tNum[];

        //Inicialización
        tNum = new int[12];

        tNum[3] = 7;

        for(int n:tNum) {
            System.out.print(n + " - ");

        }
    }
}
