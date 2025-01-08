package Primero.SegundoTrimestre.Practica.Excepciones;
public class Ejemplo4
{
	public static void main(String[] args)
	{
		int a,b,c;
		a=3;
		try
		{
			funcA();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b=7;
	}

	public static void funcA() throws Exception
	{
		int r,d;
		r=9;
		funcB();
		d=7;
	}

	public static void funcB() throws Exception
	{
		int x,y;
		x=9;
		y=7;
	}

}
