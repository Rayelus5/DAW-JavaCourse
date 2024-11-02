package Primero.PrimerTrimestre.Practica.Ejercicio_Examenes.Examen7_17_18;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        // Entrada de números
        while (true) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (negativo para terminar):"));
            if (numero < 0) {
                break;
            }
            numeros.add(numero);
        }

        int secuenciasLargas = 0;
        int maxLongitud = 0;
        int longitudActual = 1;

        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) > numeros.get(i - 1)) {
                longitudActual++;
            } else {
                if (longitudActual >= 3) {
                    secuenciasLargas++;
                    if (longitudActual > maxLongitud) {
                        maxLongitud = longitudActual;
                    }
                }
                longitudActual = 1;
            }
        }

        if (longitudActual >= 3) {
            secuenciasLargas++;
            if (longitudActual > maxLongitud) {
                maxLongitud = longitudActual;
            }
        }

        // Resultados
        JOptionPane.showMessageDialog(null, "Secuencias de al menos 3 números crecientes: " + secuenciasLargas);
        JOptionPane.showMessageDialog(null, "Longitud de la mayor secuencia creciente: " + maxLongitud);
    }
}