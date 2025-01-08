package Primero.SegundoTrimestre.Practica.Modularización.EjemplosPrimeroFunciones;
public class Tercero
{
	public static int x;  // es visible y modificable desde cualquier método

	public static void main(String[] args)
	{
		x=3;
		int n=2;
		while(x<10)
			método();
		System.out.println("N vale: "+n+" y x vale: "+x);
	}

	public static void método()
	{
		System.out.println("Hola");
		x++;
	}
}