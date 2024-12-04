package Primero.PrimerTrimestre.Practica.Ejercicio_Examenes.Examen_22_23;

import javax.swing.*;

public class Main {
    public static final int ALUM = 20;

    public static void main(String[] args) {

        //Menú
        boolean finalizar = false;
        char opción;
        //Tabla
        String tPart[] = new String[ALUM]; //Nombres alumnos
        int nPart=0; //Cant participantes
        float tDon[][] = new float[ALUM][ALUM]; //Donativos
        String donante, receptor; //Nombre donante y receptor
        int posPart=0, posDon=0, posRec=0; //Posiciones gente
        //3
        String listado="";
        String listaDons = "";
        //4
        float contRecaudado=0;
        float contMaxRecaudado=0;
        String nomMaxRecaudado= "";
        //5
        String listaEgo="";
        String ego="";

        do {
            opción = JOptionPane.showInputDialog(
                    "1 - Añadir un participante en el amigo invisible.\n" +
                            "2 - Añadir un donativo.\n" +
                            "3 - Listar todos los datos introducidos.\n" +
                            "4 - Mostrar la persona más popular.\n" +
                            "5 - Mostrar los egoístas, que se han donado a sí mismos.\n" +
                            "6 - Fin."+
                            "7 - Persona que más ha donado A LOS DEMÁS").charAt(0);

            switch(opción)
            {
                case '1':
                    donante= JOptionPane.showInputDialog("Nombre: ");
                    posPart= 0; // Le da posición al participante

                    while(posPart<nPart && !tPart[posPart].equals(donante))
                        posPart++;
				/* Mientras la posición de participante sea menor a la cant de participantes
				  Y lo de dentro de la posición de participante (número) en la tPart sea diferente a donante*/

                    if(posPart == nPart) // fin del array, no existe ese participante
                    {
                        tPart[nPart++]=donante; //Después de asignar donante a tPart[nPart], el valor de nPart se incrementa en 1.
                        JOptionPane.showMessageDialog(null, "Participante añadido");
                    }else
                        JOptionPane.showMessageDialog(null, "Ese participante ya estaba");
                    break;
                case '2':
                    donante= JOptionPane.showInputDialog("Donante: ");
                    posDon=0;

                    while(posDon<nPart && !tPart[posDon].equals(donante))
                        posDon++;

                    if(posDon==nPart) { // si no la he encontrado
                        JOptionPane.showMessageDialog(null, "No existe");
                    }else
                    {
                        receptor = JOptionPane.showInputDialog("Receptor: ");
                        posRec=0;

                        while(posRec<nPart && !tPart[posRec].equals(receptor))
                            posRec++;

                        if(posRec==nPart)  // si no la he encontrado
                            JOptionPane.showMessageDialog(null, "No existe");
                        else
                        {
                            tDon[posDon][posRec] = Float.parseFloat(
                                    JOptionPane.showInputDialog("Donativo: "));

                            JOptionPane.showMessageDialog(null, "Donativo almacenado");
                        }
                    }
                    break;
                case '3':
                    listado = "";
                    for(int fila=0; fila<nPart; fila++ ) {
                        listado += tPart[fila];//se añade el nombre del participante actual (tPart[fila]) a la variable listado
                        listaDons=""; //Se van almacenando los donativos

                        for(int col=0; col<nPart; col++) {
                            if(tDon[fila][col] > 0)
                                listaDons+="  "+tDon[fila][col]+"€ para el regalo de "+tPart[col]+"\n";
                            //se añade una línea a listaDons indicando la donación y el destinatario
                        }
                        if(listaDons.isEmpty())
                            listado+=" no ha puesto nada aún\n";
                        else
                            listado+=" ha puesto:\n"+listaDons; //no está vacía, así q se pone la lista de donaciones
                    }
                    JOptionPane.showMessageDialog(null, listado);
                    break;
                case '4':
                    for(int col=0; col<nPart; col++) {
                        for(int fila=0; fila<nPart; fila++) {
                            contRecaudado += tDon[fila][col];
                            if(contRecaudado>contMaxRecaudado) {
                                contMaxRecaudado= contRecaudado;
                                nomMaxRecaudado= tPart[col];
                            }
                        }
                        contRecaudado=0;
                    }
                    JOptionPane.showMessageDialog(null, "El participante más popular porque ha obtenido más dinero es: "+nomMaxRecaudado);
                    break;
                case '5':
                    for(int fila=0; fila<nPart; fila++) {
                        if(tDon[fila][fila] >0)
                        {
                            ego= tPart[fila];
                            listaEgo += "\n" +ego;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Los egoístas son: "+listaEgo);
                    break;
                case '6':
                    finalizar=true;
                    break;

                case '7':
                    float[] sumasDonaciones = new float[nPart];
                    float maxDonado = 0;
                    String maxDonante = "";

                    // Sumar las donaciones de cada participante excluyendo las donaciones a sí mismos
                    for (int i = 0; i < nPart; i++) {
                        sumasDonaciones[i] = 0;
                        for (int j = 0; j < nPart; j++) {
                            if (i != j) { // Excluir las donaciones a sí mismos
                                sumasDonaciones[i] += tDon[i][j];
                            }
                        }
                        // Determinar si esta persona ha donado más que el máximo actual
                        if (sumasDonaciones[i] > maxDonado) {
                            maxDonado = sumasDonaciones[i];
                            maxDonante = tPart[i];
                        }
                    }

                    // Mostrar el resultado
                    JOptionPane.showMessageDialog(null, "La persona que más ha donado a los demás es: " + maxDonante + " con un total de: " + maxDonado + "€");
                    break;
            }
        }while(!finalizar);
    }
}