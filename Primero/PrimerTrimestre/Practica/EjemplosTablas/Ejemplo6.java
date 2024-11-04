package Primero.PrimerTrimestre.Practica.EjemplosTablas;

import javax.swing.*;

public class Ejemplo6 {
    public static final int TAM = 20;
    public static void main(String[] args) {

        String tNombres[] = new String[TAM];
        int tNotas[] = new int[TAM];

        String nombre="";
        int nota = 0;
        int nElem = 0;
        String res = "";

        nombre = JOptionPane.showInputDialog("Nombre: ");
        while (!nombre.equalsIgnoreCase("fin")) {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Nota: "));
            tNombres[nElem] = nombre;
            tNotas[nElem] = nota;
            nElem++;

            nombre = JOptionPane.showInputDialog("Nombre: ");
        }

        res += "<html>\n";
        res += "<table border=3>\n";
        res += "<tr><td>Nombre</td><td>Nota</td></tr>\n";

        for (int i=0; i<nElem; i++) {

            res += "<tr>\n";
            // res += "El alumno/a " + tNombres[i] + " tiene un " + tNotas[i] + "\n";
            res += "<td>" + tNombres[i] + "</td>";
            res += "<td>" + tNotas[i] + "</td>";
            res += "</tr>\n";

        }
        res += "</table>\n";
        res += "</html>";

        JOptionPane.showMessageDialog(null, res);
    }
}
