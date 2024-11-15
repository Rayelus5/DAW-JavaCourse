package Primero.PrimerTrimestre.Practica.EjemplosTablasBidimensionales;
public class IdaDeOlla 
{
	public static void main(String[] args) 
	{
		int t[][];
		
		t = new int[3][];
		
		t[0] = new int[4];
		t[1] = new int[7];
		t[2] = new int[3];
		
		t[0][0] = 7;
		t[1][1] = 2;

		for(int fila=0;fila<t.length;fila++)
		{
			for(int col=0;col<t[fila].length;col++)
				System.out.print(" "+t[fila][col]);
			System.out.println("");
		}
		
		
	}
}
