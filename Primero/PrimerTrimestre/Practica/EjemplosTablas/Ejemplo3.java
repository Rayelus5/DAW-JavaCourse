package Primero.PrimerTrimestre.Practica.EjemplosTablas;
import javax.swing.JOptionPane;

public class Ejemplo3 {
    public static void main(String[] args) {
        //Declaración e inicialización
        int tNum[] =  new int[12];

        int valor=0;
        int posición = 0;

        for (int i = 0; i < 4; i++)
        {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Valor a introducir: "));
            posición = Integer.parseInt(JOptionPane.showInputDialog("Posición donde se va a introducir: "));
            tNum[posición] = valor;
        }

        for(int i=0;i<tNum.length;i++)
            System.out.println("Posición: "+i+ " contenido: "+tNum[i]);


    }
}
