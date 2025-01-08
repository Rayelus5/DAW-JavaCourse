package Primero.SegundoTrimestre.Practica.Excepciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t[] = new int[5];
		int pos;

		System.out.println("Introduzca posición: ");


		try
		{
			//otras
			pos = Integer.parseInt(sc.nextLine());
			//otras
			t[pos] = 9;
			//otras
		}

		catch (ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Posición no válida, "
					+ "la tabla no se ha cambiado."
					+ " La excepcion es: "+e1.toString());
		}
		catch (NumberFormatException e2)
		{
			System.out.println("No es un número, "
					+ "la tabla no se ha cambiado."
					+ " La excepcion es: "+e2.toString());
		}
		catch(Exception e)
		{
			System.out.println("Algo ha pasado");
		}

		System.out.println(Arrays.toString(t));
	}
}