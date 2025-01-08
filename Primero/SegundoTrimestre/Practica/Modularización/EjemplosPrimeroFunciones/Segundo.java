package Primero.SegundoTrimestre.Practica.Modularización.EjemplosPrimeroFunciones;
public class Segundo
{
	public static void main(String[] args)
	{
		int n=0;

		System.out.println("Empiezo. N vale: "+n);
		método1();
		System.out.println("Sigo");
		System.out.println("Sigo. A vale: "+n);
		método1();
	}

	public static void método1()
	{
		int n=3;
		System.out.println("Estoy en el método. N vale: "+n);
	}


}
