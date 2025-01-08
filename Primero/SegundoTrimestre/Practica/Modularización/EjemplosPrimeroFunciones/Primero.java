package Primero.SegundoTrimestre.Practica.Modularización.EjemplosPrimeroFunciones;
public class Primero
{
	public static void main(String[] args)
	{
		System.out.println("Empiezo");
		saluda();
		System.out.println("Sigo");
		saluda();
		System.out.println("Acabo");
		despídete();
	}

	public static void despídete()
	{
		saluda();
		System.out.println("Adiós");
	}

	public static  void saluda()
	{

		System.out.println("Hola");

	}


}
