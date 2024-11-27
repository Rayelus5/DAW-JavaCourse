package Primero.PrimerTrimestre.Practica.Ejercicio_Examenes.Examen_23_24;

import javax.swing.JOptionPane;

public class Main {
    public static final int CIUDADES = 30;

    public static void main(String[] args) {
        boolean finalizar = false;
        char opción = ' ';
        String tCiu[] = new String[CIUDADES];
        int nCiu = 0;
        int tKms[][] = new int[CIUDADES][CIUDADES];
        String origen = "", destino = "";
        int posOri = 0, posDest = 0;
        String listado = "";
        int cont = 0;
        int kmsMax = 0;
        String ciudadIntermedia="";

        do {
            opción = JOptionPane.showInputDialog(
                    "1 - Añadir una línea de una ciudad a otra.\n" +
                            "2 - Listado de todos los datos introducidos.\n" +
                            "3 - Mostrar si hay ida y vuelta entre dos ciudades dadas.\n" +
                            "4 - Listar los trayectos más cortos que una" +
                            " distancia dada desde una ciudad dada.\n" +
                            "5 - Comprobar si se puede ir de una ciudad dada" +
                            " a otra dada en justo dos viajes.\n" +
                            "6 - Fin.").charAt(0);

            switch (opción) {
                case '1':
                    origen = JOptionPane.showInputDialog("Origen: ");
                    destino = JOptionPane.showInputDialog("Destino: ");
                    posOri = 0;
                    while (posOri < nCiu && !tCiu[posOri].equals(origen))
                        posOri++;
                    if (posOri == nCiu)
                        tCiu[nCiu++] = origen;

                    posDest = 0;
                    while (posDest < nCiu && !tCiu[posDest].equals(destino))
                        posDest++;
                    if (posDest == nCiu)
                        tCiu[nCiu++] = destino;
                    // aquí ya tengo las posiciones de las dos ciudades

                    tKms[posOri][posDest] = Integer.parseInt(
                            JOptionPane.showInputDialog("Kilómetros: "));
                    JOptionPane.showMessageDialog(null, "Datos almacenados");
                    break;
                case '2':
                    listado = "";

                    for (int i = 0; i < nCiu; i++) {
                        listado += "Desde " + tCiu[i] + ":\n";
                        cont = 0;
                        for (int j = 0; j < nCiu; j++)
                            if (tKms[i][j] > 0) {
                                listado += "  Hasta " + tCiu[j] + ": " + tKms[i][j] + " Kms.\n";
                                cont++;
                            }
                        if (cont == 0)
                            listado += " No hay destinos\n";
                    }

                    JOptionPane.showMessageDialog(null, listado);
                    break;
                case '3':
                    origen = JOptionPane.showInputDialog("Origen: ");
                    posOri = 0;
                    while (posOri < nCiu && !tCiu[posOri].equals(origen))
                        posOri++;
                    if (posOri == nCiu)  // si no la he encontrado
                        JOptionPane.showMessageDialog(null, "No existe");
                    else {
                        destino = JOptionPane.showInputDialog("Destino: ");
                        posDest = 0;
                        while (posDest < nCiu && !tCiu[posDest].equals(destino))
                            posDest++;
                        if (posDest == nCiu)  // si no la he encontrado
                            JOptionPane.showMessageDialog(null, "No existe");
                        else {
                            if (tKms[posOri][posDest] > 0 &&
                                    tKms[posDest][posOri] > 0)
                                JOptionPane.showMessageDialog(null, "Hay ida y vuelta, "
                                        + "total kms: " +
                                        (tKms[posOri][posDest] + tKms[posDest][posOri]));
                            else
                                JOptionPane.showMessageDialog(null, "No hay ida y vuelta");
                        }

                    }
                    break;
                case '4':
                    listado = "";
                    origen = JOptionPane.showInputDialog("Origen: ");
                    posOri = 0;
                    while (posOri < nCiu && !tCiu[posOri].equals(origen))
                        posOri++;
                    // asumimos que la ciudad está seguro
                    kmsMax = Integer.parseInt(
                            JOptionPane.showInputDialog("Kms máximos: "));
                    for (int col = 0; col < nCiu; col++)
                        if (tKms[posOri][col] > 0 &&
                                tKms[posOri][col] < kmsMax)
                            listado += tCiu[col] + " ";
                    if (listado.isEmpty())
                        listado = "No hay ciudades alcanzables "
                                + "en menos de esos kms. desde " + origen;
                    else
                        listado = "Las ciudades alcanzables desde "
                                + origen + " en menos de " + kmsMax + " kms. son: " + listado;
                    JOptionPane.showMessageDialog(null, listado);
                    break;
                case '5':
                    ciudadIntermedia="";
                    origen = JOptionPane.showInputDialog("Origen: ");
                    destino = JOptionPane.showInputDialog("Destino: ");
                    posOri = 0;

                    while (posOri < nCiu && !tCiu[posOri].equals(origen)) {
                        posOri++;
                    }
                    posDest=0;

                    while (posDest < nCiu && !tCiu[posDest].equals(destino)) {
                        posDest++;
                    }

                    for (int col=0; col < nCiu && ciudadIntermedia.isEmpty(); col++) {
                        if (tKms[posOri][col] > 0 && tKms[col][posDest]>0) {
                            ciudadIntermedia = tCiu[col];
                        }
                    }

                    if (ciudadIntermedia.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay");
                    } else {
                        JOptionPane.showMessageDialog(null, "Se puede hacer en dos viajes "
                                + "haciendo un trayecto desde " + origen + " hasta " + destino
                                + " pasando por " + ciudadIntermedia);
                    }


                    break;
                case '6':
                    finalizar = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción errónea");
            }
        }
        while (!finalizar);

    }
}

