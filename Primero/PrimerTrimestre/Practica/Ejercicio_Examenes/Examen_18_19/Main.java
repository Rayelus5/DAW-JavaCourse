package Primero.PrimerTrimestre.Practica.Ejercicio_Examenes.Examen_18_19;

import javax.swing.*;

public class Main {
    public static final int MAX_PART = 20;
    public static final int MAX_LOC = 30;

    public static void main(String[] args)
    {
        boolean finalizar = false;
        char op=' ';
        int[][] tVot = new int[MAX_LOC][MAX_PART];
        int nLoc = 0;
        int nPart = 0;
        String[] tLoc = new String[MAX_LOC];
        String[] tPart = new String[MAX_PART];
        String localidad="";
        String partido="";
        int votos=0;
        int posLoc = 0;
        int posPart = 0;
        String listado="";
        int maxVot=-1;
        int posMax=0;
        int sumaVotLoc=0;
        int sumaTotalVotos=0;
        int totalVotosPart=0;

        for(int i=0;i<MAX_LOC;i++)
            for(int j=0;j<MAX_PART;j++)
                tVot[i][j]=-1;


        do
        {
            op = JOptionPane.showInputDialog(""
                    + "1 - Introducir votos en localidad de un partido\n"
                    + "2 - Listado por partidos de todos los datos\n"
                    + "3 - Listado de mejores resultados de cada partido\n"
                    + "4 - Listado de participación en localidades\n"
                    + "5 - Porcentaje de votos de cada partido\n"
                    + "6 - Fin\n").charAt(0);
            switch(op)
            {
                case'1':
                    localidad = JOptionPane.showInputDialog("Localidad: ");
                    partido = JOptionPane.showInputDialog("Partido: ");
                    votos = Integer.parseInt(JOptionPane.showInputDialog("Votos: "));

                    posLoc=0;
                    while(posLoc< nLoc && !localidad.equals(tLoc[posLoc]))
                        posLoc++;
                    if(posLoc==nLoc)
                    {
                        tLoc[nLoc++]=localidad;
                    }

                    posPart=0;
                    while(posPart< nPart && !partido.equals(tPart[posPart]))
                        posPart++;
                    if(posPart==nPart)
                    {
                        tPart[nPart++]=partido;
                    }

                    tVot[posLoc][posPart] = votos;

                    JOptionPane.showMessageDialog(null,"Datos almacenados");

                    break;
                case'2':
                    listado="";

                    for(int col=0;col<nPart;col++)
                    {
                        listado+="Partido: "+tPart[col]+"\n";
                        for(int fila=0;fila<nLoc;fila++)
                            if(tVot[fila][col]>-1)
                                listado += "  "+tLoc[fila]+" "+tVot[fila][col]+" Votos\n";
                    }

                    JOptionPane.showMessageDialog(null,listado);
                    break;
                case'3':
                    listado="";

                    for(int col=0;col<nPart;col++)
                    {
                        listado+="El partido "+tPart[col]+
                                " ha obtenido más votos en: ";
                        maxVot=-1;
                        posMax=0;
                        for(int fila=0;fila<nLoc;fila++)
                        {
                            if(tVot[fila][col]>maxVot)
                            {
                                maxVot = tVot[fila][col];
                                posMax = fila;
                            }
                        }
                        listado+=tLoc[posMax]+"\n";
                    }


                    JOptionPane.showMessageDialog(null,listado);
                    break;
                case'4':
                    listado="";

                    for(int fila=0;fila<nLoc;fila++)
                    {

                        listado+="En la localidad "+tLoc[fila]+
                                " el número de votos ha sido: ";
                        sumaVotLoc=0;
                        for(int col=0;col<nPart;col++)
                            if(tVot[fila][col]>-1)
                                sumaVotLoc+=tVot[fila][col];
                        listado+=sumaVotLoc+" Votos.\n";
                    }
                    JOptionPane.showMessageDialog(null,listado);
                    break;
                case'5':
                    sumaTotalVotos=0;
                    for(int fila=0;fila<nLoc;fila++)
                        for(int col=0;col<nPart;col++)
                            if(tVot[fila][col]>-1)
                                sumaTotalVotos+=tVot[fila][col];

                    listado="";

                    for(int col=0;col<nPart;col++)
                    {
                        listado+="Partido: "+tPart[col]+
                                " Porcentaje de votos: ";
                        totalVotosPart=0;
                        for(int fila=0;fila<nLoc;fila++)
                        {
                            if(tVot[fila][col]>-1)
                            {
                                totalVotosPart+=tVot[fila][col];
                            }
                        }



                        listado+=(float)totalVotosPart/sumaTotalVotos*100+"%\n";
                    }


                    JOptionPane.showMessageDialog(null,listado);


                    break;
                case'6':
                    finalizar = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción errónea");
            }
        }
        while(!finalizar);

    }
}