package Primero.SegundoTrimestre.Practica.Modularización.EjemplosPrimeroFunciones;
public class ParametrosTablas
{
	public static void main(String args[])
	{
		int tabla[];
		tabla = new int[7];

		tabla[0]=3;
		tabla[1]=6;
		tabla[2]=2;
		tabla[3]=9;
		tabla[4]=8;
		tabla[5]=6;
		tabla[6]=2;

		func(tabla);

		for(int i=0;i<tabla.length;i++)
			System.out.println(tabla[i]);

	}

	private static void func(int t[])
	{
		t[3]=666;
	}
}