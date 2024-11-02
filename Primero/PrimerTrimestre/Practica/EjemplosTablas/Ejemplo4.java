package Primero.PrimerTrimestre.Practica.EjemplosTablas;

import javax.swing.*;

public class Ejemplo4 {
    public static void main(String[] args) {
        String[] tNombre = new String[5];
        String resultado = "";

        //Relleno la tala
        for(int i=0;i<5;i++) {
            tNombre[i] = JOptionPane.showInputDialog("Nombre: ");
        }

        for(int i=0;i<5;i++) {
            resultado += tNombre[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
