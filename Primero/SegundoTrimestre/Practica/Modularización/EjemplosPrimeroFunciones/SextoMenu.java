package Primero.SegundoTrimestre.Practica.Modularización.EjemplosPrimeroFunciones;
import javax.swing.JOptionPane;

// ejemplo de función que no recibe parámetros y devuelve un valor
public class SextoMenu
{

	public static void main(String[] args)
	{
		char op=' ';
		boolean finalizar = false;

		do
		{
			op=menu();
			switch(op)
			{
				case '1':
					break;

			}
		}
		while(!finalizar);
	}
	private static char menu()
	{
		char c;
		do
		{
			c= JOptionPane.showInputDialog(null,
					"1-Alta\n"
							+ "2-Baja\n"
							+ "3-Listar\n"
							+ "4-Buscar\n"
							+ "5-Finalizar").charAt(0);
		}
		while(c<'1' || c>'5');
		return c;
	}

}