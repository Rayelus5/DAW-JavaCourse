package Primero.PrimerTrimestre.Practica.Ejercicio12;

import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {

        //CON JOPTIONPANE
        char caracter;

        caracter = JOptionPane.showInputDialog("Letra: ").toUpperCase().charAt(0);
        while (caracter != 'S' && caracter != 'N') {
            JOptionPane.showMessageDialog(null, "Introduzca una letra válida (S/N)");
            caracter = JOptionPane.showInputDialog("Letra: ").toUpperCase().charAt(0);
        }

        JOptionPane.showMessageDialog(null, "Opción elegida: " + caracter);
    }
}
