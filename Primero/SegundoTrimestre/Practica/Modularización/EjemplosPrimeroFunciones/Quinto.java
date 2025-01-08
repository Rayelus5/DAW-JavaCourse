package Primero.SegundoTrimestre.Practica.Modularización.EjemplosPrimeroFunciones;
public class Quinto
{
	public static void main(String[] args)
	{
		int n;


		// debe mostrar todos los números entre los dos valores pasados,
		// ambos inclusive
		//mostrarNúmerosEntre(3,8);

		// debe hacer lo mismo, pero contando "de 5 en 5 en este caso"

		//mostrarNúmerosEntrePaso(2,20,5);
		//mostrarNúmerosEntrePaso(0,100,5);

		// función que muestre un mensaje recibido en un String
		// tantas veces como se indique en un entero también recibido
		escribeVeces("Black friday",7);

		// función que recibe una String y un char. Escribe en pantalla
		// cuántas veces aparece el char en la String
		escribeVeces("australopiteco de la sabana",'a');


		// funcion que recibe un valor y devuelve un valor
		n = doble(7);

		//función que recibe dos enteros y devuelve la suma de ambos
		n = suma(3,7);

		// función que recibe dos enteros y devuelve el mayor de ambos
		n = mayor(4,7);

		// función que recibe tres enteros y devuelve el mayor
		n = mayor(5,8,2);

		// función que recibe cuatro enteros y devuelve el mayor
		n = mayor(5,8,2,9);

		//

	}

	private static int mayor(int i, int j, int k, int l)
	{
		return mayor(mayor(i,j),mayor(k,l));
	}

	private static int mayor(int i, int j, int k)
	{
		return mayor(mayor(i,j),k);

	}


	private static int mayor(int i, int j)
	{
		if(i<j)
			return j;

		return i;
	}

	private static int suma(int i, int j) {
		// TODO Auto-generated method stub
		int s;
		s=i+j;
		return s;
	}

	private static int doble(int a)
	{
		int d;
		d = a*2;
		return d;

		// también hubiera valido:
		// return a*2;


	}

	private static void escribeVeces(String string, char c)
	{
		int cont=0;
		for(int i=0;i<string.length();i++)
			if(string.charAt(i) == c)
				cont++;
		System.out.println(cont);
	}

	public static void escribeVeces(String frase,int veces)
	{
		for(int i=0;i<veces;i++)
			System.out.println(frase);
	}





	private static void mostrarNúmerosEntre(int desde, int hasta)
	{
		for(int i=desde;i<=hasta;i++)
			System.out.println(i);
	}

	private static void mostrarNúmerosEntrePaso(int desde, int hasta,int paso)
	{
		while(desde<=hasta)
		{
			System.out.println(desde);
			desde+=paso;
		}
	}

}