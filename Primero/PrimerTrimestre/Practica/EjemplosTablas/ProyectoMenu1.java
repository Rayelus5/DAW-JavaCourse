package Primero.PrimerTrimestre.Practica.EjemplosTablas;

import javax.swing.*;

// CRUD - CREATE READ UPDATE DELETE  |  (Crear, Leer, Actualizar y Borrar)

public class ProyectoMenu1 {
    public static final int MAX = 20;
    public static void main(String[] args)
    {
        String tNombres[] = new String[MAX];
        float tMarcas[] = new float[MAX];
        boolean finalizar = false;
        char opción = ' ';
        String nombreNuevo = "";
        float marcaNueva = 0;
        int nElem = 0;
        String listado="";
        String nombreABuscar ="";
        int pos=0;

        // bucle principal
        do
        {
            // mostrar menu y pedir la opción
            opción = JOptionPane.showInputDialog(
                    "1 - Alta de corredor\n"
                            + "2 - Listar todo\n"
                            + "3 - Mostrar la marca de un corredor\n"
                            + "4 - Borrar un corredor\n"
                            + "6 - Finalizar\n").charAt(0);

            switch(opción)
            {
                // dar de alta
                case '1':
                    if (nElem < MAX)
                    {
                        nombreNuevo = JOptionPane.showInputDialog("Nombre: ");
                        /**********************/
                        pos = 0;
                        while(pos < nElem && !tNombres[pos].equals(nombreNuevo))
                        {
                            pos++;
                        }
                        if(pos == nElem) // es decir, si no está previamente
                        {
                            marcaNueva = Float.parseFloat(JOptionPane.showInputDialog("Marca: "));
                            pos = nElem-1;
                            while(pos>=0 && tMarcas[pos] > marcaNueva)
                            {
                                tMarcas[pos+1] = tMarcas[pos];
                                tNombres[pos+1] = tNombres[pos];
                                pos--;
                            }
                            tNombres[pos+1] = nombreNuevo;
                            tMarcas[pos+1] = marcaNueva;

                            nElem++;
                        }
                        else
                            JOptionPane.showMessageDialog(null, "Ese corredor ya existe");
                        /******************/

                    }
                    else
                        JOptionPane.showMessageDialog(null, "Tabla llena");
                    break;
                // listar todo
                case '2':
                    listado="";
                    for(int i=0;i<nElem;i++)
                    {
                        listado += tNombres[i] + " - " +tMarcas[i]+"\n";
                    }
                    JOptionPane.showMessageDialog(null, listado);
                    break;

                // buscar nombre mostrar su marca
                case '3':
                    nombreABuscar = JOptionPane.showInputDialog("Nombre a buscar: ");
                    pos = 0;
                    while(pos < nElem && !tNombres[pos].equals(nombreABuscar))
                    {
                        pos++;
                    }
                    // al llegar aquí, una de las dos condiciones del while
                    // (o las dos) es falsa
                    // puede ser la primera (es decir ahora pos == nElem)
                    // o puede ser la segunda (es cuyo caso, en pos está
                    // (el nombre buscado)
                    if(pos == nElem)
                        JOptionPane.showMessageDialog(null, "No existe");
                    else
                        JOptionPane.showMessageDialog(null, "La marca de "+
                                nombreABuscar+" es "+tMarcas[pos]);

                    break;
                case '4':
                    nombreABuscar = JOptionPane.showInputDialog("Nombre a eliminar: ");
                    pos = 0;
                    while(pos < nElem && !tNombres[pos].equals(nombreABuscar))
                    {
                        pos++;
                    }
                    // al llegar aquí, una de las dos condiciones del while
                    // (o las dos) es falsa
                    // puede ser la primera (es decir ahora pos == nElem)
                    // o puede ser la segunda (es cuyo caso, en pos está
                    // (el nombre buscado)
                    if(pos == nElem)
                        JOptionPane.showMessageDialog(null, "No existe");
                    else
                    {
                        for(int i=pos;i<nElem-1;i++)
                        {
                            tNombres[i] = tNombres[i+1];
                            tMarcas[i] = tMarcas[i+1];
                        }
                        nElem--;
                    }

                    break;

                // finalizar
                case '6':
                    finalizar = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción errónea");
            }
        }
        while(finalizar == false);

    }
}