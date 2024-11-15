package Primero.PrimerTrimestre.Practica.EjemplosTablasBidimensionales;
public class Ejemplo1 
{
   public static void main(String args[])
   {
	   int suma=0;
	   
	   // declaraci�n   
	   int t[][];
	   // creaci�n
	   t = new int[3][7];
	   
	   t[2][4] = 8;
	   t[0][5] = 1;
	   t[1][1] = 7;
	   t[1][3] = 6;
	   t[2][5] = 5;
	   t[0][6] = 4;
	   t[1][2] = 3;
	   t[2][4] = 9;
	   t[0][3] = 1;
	   
	   // mostramos la tabla
	   for(int fila=0;fila<3;fila++)
	   {
		   for(int col=0;col<7;col++)
			   System.out.print(" "+t[fila][col]);
		   System.out.println("");
	   }
	   
	   // calculo la suma de la fila 1
	   for(int c=0;c<7;c++)
		   suma+=t[1][c];
	   
	   System.out.println("La suma de la fila 1 es: "+suma);
	   
	   // muestro el tama�o de la tabla
	   System.out.println("Tamaño: "+t[0].length);
	   
   }
}
