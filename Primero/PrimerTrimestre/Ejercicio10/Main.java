package Primero.PrimerTrimestre.Ejercicio10;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Primer número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo número:"));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, num1 + " es mayor que " + num2);
        } else {
            if (num1 < num2) {
                JOptionPane.showMessageDialog(null, num1 + " es menor que " + num2);
            } else {
                JOptionPane.showMessageDialog(null, num1 + " es igual que " + num2);
            }
        }
    }
}
