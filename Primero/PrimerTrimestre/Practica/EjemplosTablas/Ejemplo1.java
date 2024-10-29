package Primero.PrimerTrimestre.Practica.EjemplosTablas;

public class Ejemplo1 {
        public static void main(String[] args) {
            //Declaración
            int[] tNum;

            //Inicialización
            tNum = new int[12];

            tNum[3] = 7;

            for(int i=0;i<tNum.length;i++)
                System.out.println("Posición: "+i+ " contenido: "+tNum[i]);


        }
}
