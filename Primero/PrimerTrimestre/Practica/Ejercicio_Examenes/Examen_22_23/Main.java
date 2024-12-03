package Primero.PrimerTrimestre.Practica.Ejercicio_Examenes.Examen_22_23;

import javax.swing.*;

public class Main {
    public static final int ALUMNOS = 30;

    public static void main(String[] args)
    {
        boolean finalizar = false;
        char opción =' ';
        String tPart[] = new String[ALUMNOS];
        int nPart=0;
        float tDon[][] = new float[ALUMNOS][ALUMNOS];
        String donante="",receptor="";
        int posPart = 0,posDon=0,posRec=0;
        String listado="";
        String listaDons="";

        do
        {
            opción = JOptionPane.showInputDialog(
                    "1 - Añadir un participante en el amigo invisible.\n" +
                            "2 - Añadir un donativo.\n" +
                            "3 - Listar todos los datos introducidos.\n" +
                            "4 - Mostrar la persona más popular.\n" +
                            "5 - Mostrar los egoístas, que se han donado a sí mismos.\n" +
                            "6 - Fin.").charAt(0);

            switch(opción)
            {
                case '1':
                    donante = JOptionPane.showInputDialog("Participante: ");
                    posPart=0;
                    while(posPart<nPart && !tPart[posPart].equals(donante))
                        posPart++;
                    if(posPart == nPart)
                    {
                        tPart[nPart++]=donante;
                        JOptionPane.showMessageDialog(null, "Participante añadido");
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Ese participante ya estaba");

                    break;
                case '2':


                    donante = JOptionPane.showInputDialog("Donante: ");
                    posDon=0;
                    while(posDon<nPart && !tPart[posDon].equals(donante))
                        posDon++;

                    if(posDon==nPart)  // si no la he encontrado
                        JOptionPane.showMessageDialog(null, "No existe");
                    else
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
                    for(int i=0;i<nPart;i++)
                    {
                        listado += tPart[i];
                        listaDons="";
                        for(int j=0;j<nPart;j++)
                            if(tDon[i][j] > 0)
                                listaDons+="  "+tDon[i][j]+"€ para el regalo de "+tPart[j]+"\n";
                        if(listaDons.isEmpty())
                            listado+=" no ha puesto nada aún\n";
                        else
                            listado+=" ha puesto:\n"+listaDons;
                    }
                    JOptionPane.showMessageDialog(null, listado);
                    break;
                case '4':
                    break;
                case '5':
                    break;
                case '6':
                    finalizar = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción errónea");
            }
        }
        while(!finalizar);
    }
}