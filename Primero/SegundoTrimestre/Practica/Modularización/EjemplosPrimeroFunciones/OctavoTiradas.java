package Primero.SegundoTrimestre.Practica.Modularización.EjemplosPrimeroFunciones;
public class OctavoTiradas
{
	public static void main(String[] args)
	{
		int tiradas[] = new int [6];
		int n=0;

		for(int i=0; i < 10000; i++)
		{
			n = tirarDado();
			tiradas[n-1] += 1;
		}

		for(int i=0; i < tiradas.length; i++)
		{
			System.out.println("El número " + (i+1) + " ha salido: " + tiradas[i]);
		}
	}
	public static int tirarDado()
	{
		return (int)(Math.random()*6)+1;
	}
}