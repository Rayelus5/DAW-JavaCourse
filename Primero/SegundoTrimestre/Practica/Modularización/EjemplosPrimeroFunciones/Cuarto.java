package Primero.SegundoTrimestre.Practica.Modularización.EjemplosPrimeroFunciones;
//Ejemplo de función que recibe un parámetro (int) y no devuelve nada

public class Cuarto
{
	public static void main(String[] args)
	{
		int a;
		a=3;
		System.out.println("Empiezo con a: "+a);

		saludaVeces(a+1);

		System.out.println("Acabo con a: "+a);
	}

	public static void saludaVeces(int n)
	{
		n++;
		for(int i=0;i<n;i++)
			System.out.println("Hola, con n: "+n);
	}

}