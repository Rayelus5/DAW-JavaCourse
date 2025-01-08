package Primero.SegundoTrimestre.Practica.Modularización.EjemplosPrimeroFunciones;
public class SeptimoDado
{
	public static void main(String[] args)
	{
		int n;
		n=tirarDado();

		System.out.println("Ha salido: "+n);
	}

	public static int tirarDado()
	{
		return (int)(Math.random()*6)+1;
	}


}