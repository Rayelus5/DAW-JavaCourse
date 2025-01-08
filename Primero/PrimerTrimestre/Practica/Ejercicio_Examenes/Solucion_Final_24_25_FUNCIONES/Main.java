package Primero.PrimerTrimestre.Practica.Ejercicio_Examenes.Solucion_Final_24_25_FUNCIONES;
import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class Main
{
    public static final int MAX_FRU = 30;
    public static final int MAX_ALM = 15;
    public static final int MAX_ENV = 20;

    public static void main(String[] args)
    {
        String tFru[][] = new String[MAX_FRU][2];
        int nFru = 0;
        String tAlm[] = new String[MAX_ALM];
        String tEnv[][] = new String[MAX_ALM][MAX_ENV];
        float tTon[][] = new float[MAX_ALM][MAX_ENV];
        int tNEnv[] = new int[MAX_ALM];

        boolean finalizar = false;
        int opcion;

        do
        {
            opcion = menu();
            switch(opcion)
            {
                case 1:
                    boolean res = altaFruta(tFru,nFru);
                    if(res==true)
                        nFru++;

                    break;
                case 2:
                    //altaEnvío();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    finalizar = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }
        }
        while(!finalizar);



    }

    private static boolean altaFruta(String[][] tFru, int nFru)
    {
        String codFru;
        String nomFru;

        codFru = leeCad("Código de la fruta: ");
        int pos = buscaPos(tFru,nFru,codFru);
        if(pos == -1)
        {
            // añadir
            nomFru = leeCad("Nombre de la fruta: ");
            tFru[nFru][0]= codFru;
            tFru[nFru][1]= nomFru;
            return true;
        }
        else
        {
            error("Esa fruta ya existe.");
            return false;
        }




    }

    private static int buscaPos(String[][] t, int nElem, String cod)
    {
        for(int i=0;i<nElem;i++)
            if(t[i][0].equals(cod))
                return i;

        return -1;
    }

    private static void error(String msg)
    {
        JOptionPane.showMessageDialog(null, msg,"ERROR",
                JOptionPane.ERROR_MESSAGE);
    }

    private static String leeCad(String msg)
    {
        String res="";
        res = JOptionPane.showInputDialog(msg);
        return res;
    }

    private static int menu()
    {
        int n;
        try
        {
            n = Integer.parseInt(
                    leeCad(""
                            + "1 - Introducir un producto. \n" +
                            "2 - Introducir datos de un envío. \n" +
                            "3 - Listar todo. \n" +
                            "4 - Mostrar el nombre del producto del que se ha enviado más cantidad en \n" +
                            "    un sólo envío. \n" +
                            "5 - Mostrar la cantidad media de los tres últimos envíos a cada almacén \n" +
                            "    con al menos tres envíos. \n" +
                            "6 - Fin. "));
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "No es un número");
            n=menu();
        }

        return n;
    }
}