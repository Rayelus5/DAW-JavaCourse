package Primero.PrimerTrimestre.Practica.Ejercicio_Examenes.Examen_20_21;

import javax.swing.JOptionPane;

public class Main
{
    public static final int MESES = 12;
    public static final int MAX_SOBRES = 20;
    public static void main(String[] args)
    {
        boolean finalizar = false;
        char opción =' ';
        float tSobres[][] = new float[MESES][MAX_SOBRES];
        int tNSobres[] = new int[MESES];
        int mes=0;
        float cantidad=0;
        String listado="";
        float maxEnviadoEnUnMes=0;
        int mesMaximoEnviado=0;
        float totalEnviadoEnUnMes=0;
        int mesMenosDinero=0;
        float cantMenosDinero=50000;

        do
        {
            opción = JOptionPane.showInputDialog(
                    "1- Introducir datos del envío de un sobre.\n" +
                            "2- Mostrar todos los datos introducidos.\n" +
                            "3- Mostrar el número del mes en que se envió más dinero en total, y la cantidad.\n" +
                            "4- Mostrar cuál fue el número del mes cuyo último sobre tenía menos dinero.\n" +
                            "5- Finalizar.\n").charAt(0);

            switch(opción)
            {
                case '1':
                    mes = Integer.parseInt(JOptionPane.showInputDialog("Mes: "));
                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Cantidad: "));
                    tSobres[mes-1][tNSobres[mes-1]++] = cantidad;
                    JOptionPane.showMessageDialog(null, "Dato almacenado");
                    break;
                case '2':
                    listado="";
                    for(int i=0;i<MESES;i++)
                    {
                        if(tNSobres[i]>0)  // si ha habido sobres
                        {
                            listado+="Mes: "+(i+1)+": \n";
                            for(int j=0;j<tNSobres[i];j++)
                                listado+="  "+(j+1)+"º:"+tSobres[i][j]+" ";
                            listado+="\n";
                        }
                    }
                    if(listado.isEmpty())
                        listado = "No hay datos";
                    JOptionPane.showMessageDialog(null, listado);
                    break;
                case '3':
                    maxEnviadoEnUnMes=0;
                    for(int i=0;i<MESES;i++)
                    {
                        totalEnviadoEnUnMes=0;
                        for(int j=0;j<tNSobres[i];j++)
                            totalEnviadoEnUnMes+=tSobres[i][j];
                        if(totalEnviadoEnUnMes>maxEnviadoEnUnMes)
                        {
                            maxEnviadoEnUnMes=totalEnviadoEnUnMes;
                            mesMaximoEnviado = i;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "El mes que"
                            + " más dinero se envió fue el: "+(mesMaximoEnviado+1)+
                            " con un total de: "+maxEnviadoEnUnMes);
                    break;
                case '4':
                    mesMenosDinero = 0;
                    cantMenosDinero=50000;
                    for(int i=0;i<MESES;i++)
                        if(tNSobres[i]>0)  // si ha habido sobres
                            if(tSobres[i][tNSobres[i]-1]<cantMenosDinero)
                            {
                                mesMenosDinero = i;
                                cantMenosDinero = tSobres[i][tNSobres[i]-1];
                            }
                    JOptionPane.showMessageDialog(null, "El mes cuyo"
                            + " último sobre tenía menos dinero fue el: "+(mesMenosDinero+1)+
                            " con una cantidad de: "+cantMenosDinero);

                    break;
                case '5':
                    finalizar = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción errónea");
            }


        }
        while(!finalizar);

    }
}