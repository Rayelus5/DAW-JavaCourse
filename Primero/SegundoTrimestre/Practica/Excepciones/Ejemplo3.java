package Primero.SegundoTrimestre.Practica.Excepciones;
public class Ejemplo3
{
	public static void main(String[] args)
	{
		int a,b;

		a = 3;
		try
		{
			funcA();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b = 7;
		System.out.println("A: "+a+ " B: "+b);
	}

	private static void funcA() throws Exception
	{
		int c;
		c = 8;
	}
}