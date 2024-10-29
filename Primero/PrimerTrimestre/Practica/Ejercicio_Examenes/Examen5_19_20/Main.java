package Primero.PrimerTrimestre.Practica.Ejercicio_Examenes.Examen5_19_20;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main
{
    // CONSTANTE
    public static final int MIN_ARTS_PREMIUM = 5;

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        String correo="",articulo="";
        char premium=' ';
        int unidades=0;
        float precio=0;
        int contadorArtsUnCliente = 0;
        float pvpMasCaroUnCliente = 0;
        float maxPvpUnCliente = 0;
        String codArtMasCaroUnCliente="";
        String codArtMaxTodos ="";
        int contClientes = 0;
        int contPremium = 0;
        float acumTotalPremiums = 0, acumTotalNormal = 0;
        float gastoUnCliente = 0;
        float maxGastoUnCliente = 0;
        String clienteMaxGasto="";
        int numAlMenosCinco = 0;
        int unidadesDeUnCliente = 0;
        int maxUdsUnCliente = 0;
        char tipoMax =' ';

        System.out.print("Introduzca el correo: ");
        correo=sc.nextLine();

        while(!correo.equals("fin"))
        {

            contClientes++;
            System.out.print("Introduzca si es premium o no: ");
            premium=sc.nextLine().toLowerCase().charAt(0);
            gastoUnCliente = 0;

            contadorArtsUnCliente = 0;
            unidadesDeUnCliente = 0;

            System.out.print("Introduzca el nombre del articulo: ");
            articulo=sc.nextLine();
            while(!articulo.equals("fin"))
            {

                contadorArtsUnCliente++;

                System.out.print("Introduzca el numero de unidades: ");
                unidades=Integer.parseInt(sc.nextLine());

                unidadesDeUnCliente+=unidades;

                System.out.print("Introduzca el precio: ");
                precio=Float.parseFloat(sc.nextLine());

                gastoUnCliente +=precio*unidades;

                codArtMasCaroUnCliente = articulo;
                pvpMasCaroUnCliente = precio;

                //Nuevo articulo
                System.out.print("Introduzca el nombre del articulo: ");
                articulo=sc.nextLine();
            }

            if(unidadesDeUnCliente > maxUdsUnCliente)
            {
                maxUdsUnCliente = unidadesDeUnCliente;
                tipoMax = premium;
            }

            if(premium == 's')
            {
                acumTotalPremiums += gastoUnCliente;
                contPremium++;
                if(contadorArtsUnCliente>=MIN_ARTS_PREMIUM)
                    numAlMenosCinco++;
            }
            else
                acumTotalNormal += gastoUnCliente;

            if(gastoUnCliente > maxGastoUnCliente)
            {
                maxGastoUnCliente = gastoUnCliente;
                clienteMaxGasto = correo;
            }


            if(contadorArtsUnCliente == 1)
            {
                if(pvpMasCaroUnCliente > maxPvpUnCliente)
                {
                    maxPvpUnCliente = pvpMasCaroUnCliente;
                    codArtMaxTodos = codArtMasCaroUnCliente;
                }
            }


            //Nuevo Cliente
            System.out.print("Introduzca el correo: ");
            correo=sc.nextLine();
        }

        System.out.println("Porcentaje de premiums: "+(float)contPremium/contClientes * 100);

        if(acumTotalPremiums > acumTotalNormal)
            System.out.println("Han gastado mas los premiums");
        else
            System.out.println("Han gastado mas los normales");

        System.out.println("Código del artículo más caro "
                + "de los que solo compraron uno: "+codArtMaxTodos);

        System.out.println("El cliente que ha gastado más es: "+clienteMaxGasto);
        System.out.println("Clientes premium con al menos cinco distintos: "+numAlMenosCinco);
        System.out.println("El cliente que compró más unidades era: "+
                (tipoMax == 'n'?"Normal":"Premium"));

    }
}