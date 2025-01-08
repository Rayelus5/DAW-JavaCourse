package Primero.SegundoTrimestre.Practica.Excepciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t[] = new int[5];
		int pos;

		System.out.println("Introduzca posición: ");
		try {
			pos = Integer.parseInt(sc.nextLine());
			t[pos] = 9;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}