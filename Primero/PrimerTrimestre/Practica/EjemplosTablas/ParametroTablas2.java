package Primero.PrimerTrimestre.Practica.EjemplosTablas;

import java.util.Arrays;

@SuppressWarnings("SpellCheckingInspection") // Para evitar "warnings" de palabras no reconocidas por el diccionario

public class ParametroTablas2 {
    public static void main(String[] args)
    {
        //int t[] = {7,3,55,9,2,1};
        int u[] = {2,3,4,5,6,7,8,9,1,0};
        int m;
        int pos;

        //m = mayor(t);
        //System.out.println("El mayor es: "+m);

        //pos = posicionDelMayor(t);
        //System.out.println("El mayor está en la posición: "+pos);

        boolean está=false;

        // está = estáContenido(7,t);

        //	System.out.println(estáContenida(t,u));

        int t[] = new int[0];
        System.out.println(Arrays.toString(t));
        t = añadeNumATabla(8,t);
        t = añadeNumATabla(3,t);
        t = añadeNumATabla(6,t);
        t = añadeNumATabla(1,t);

        System.out.println(Arrays.toString(t));
        t = añadeNumATablaSinRepetir(3,t);
        t = añadeNumATablaSinRepetir(11,t);
        t = añadeNumATablaSinRepetir(1,t);
        System.out.println(Arrays.toString(t));

    }

    private static int[] añadeNumATablaSinRepetir(int n, int[] t)
    {
        if(!estáContenido(n,t))
            t = añadeNumATabla(n,t);
        return t;
    }

    public static int[] añadeNumATabla(int n, int t[])
    {
        int x[] = new int[t.length+1];
        for(int i=0;i<t.length;i++)
            x[i] = t[i];
        x[t.length] = n;

        return x;
    }



    private static boolean estáContenida(int[] t, int[] u)
    {
        System.out.println("Estoy en estaContenida ver si una tabla está en otra. Las tablas: ");
        System.out.print(Arrays.toString(t));
        System.out.println(" y "+Arrays.toString(u));

        for(int n:t)
            if(!estáContenido(n,u))
                return false;
        return true;
    }

    private static boolean estáContenido(int i, int[] t)
    {
        System.out.println("     Estoy en estaContenido ver si un numero está en una tabla. Lo recibido: ");
        System.out.print(" número: "+i);
        System.out.println(" y la tabla: "+Arrays.toString(t));
        for(int m:t)
            if(m==i)
                return true;
        return false;
    }

    public static int mayor(int[] t)
    {
        int max = t[0];

		/*for(int i=1; i<t.length; i++)
		{
			if(t[i] > max)
			{
				max = t[i];
			}
		}*/

        for(int n:t)
            if(n>max)
                max = n;

        return max;
    }

    public static int posicionDelMayor(int[] t)
    {
        int pos = 0;

        for(int i=1; i<t.length; i++)
        {
            if(t[i] > t[pos])
            {
                pos = i;
            }
        }

        return pos;
    }




}