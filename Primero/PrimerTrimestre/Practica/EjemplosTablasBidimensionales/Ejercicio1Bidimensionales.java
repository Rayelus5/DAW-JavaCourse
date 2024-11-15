package Primero.PrimerTrimestre.Practica.EjemplosTablasBidimensionales;
import javax.swing.JOptionPane;

public class Ejercicio1Bidimensionales 
{
	public static final int MAX_ALUM = 20;
	public static final int MAX_EXAMS = 5;

	public static void main(String[] args) 
	{
		String tNombres[] = new String[MAX_ALUM];
		int tNotas[][] = new int[MAX_ALUM][MAX_EXAMS];
		char opción;
		boolean finalizar = false;
		String nombre="";
		int pos=0;
		int nElem = 0;
		int nExam = 0;


		// inicializo la tabla a -1
		for(int col=0;col<MAX_EXAMS;col++)
			for(int fila =0;fila<MAX_ALUM ;fila++)
				tNotas[fila][col] = -1;

		do
		{
			opción = JOptionPane.showInputDialog(
					"1 - Introducir una (1) nota de un (1) alumno\n"
							+ "2 - Listar todo\n"
							+ ""
							+ ""
							+ "6 - Salir").charAt(0);

			switch(opción)
			{
			case '1':
				// cada vez que se le da a la opcion 1 se introduce nombre, 
				// num de examen, y la nota de ese examen

				nombre = JOptionPane.showInputDialog("Nombre: ");
				// tengo que buscarlo, para saber si tengo
				// que actualizar una nota de uno que ya est� o a�adirlo
				pos = 0;
				while(pos<nElem && !nombre.equals(tNombres[pos]))
					pos++;
				// cuando salgo del while, o no est�,
				// o est� en la posici�n pos.
				nExam = Integer.parseInt(
						JOptionPane.showInputDialog("Num Examen (0-4):"));

				if(pos==nElem)  // si no est�, lo a�ado
				{
					tNombres[nElem] = nombre;
					nElem++;
				}
				// Ahora s� est�, lo tengo en la fila pos

				tNotas[pos][nExam]=Integer.parseInt(
						JOptionPane.showInputDialog("Nota: "));				








				break;
			case '2':
				break;
			case '6':
				finalizar = true;
				break;
			default:
				JOptionPane.showMessageDialog(null, "opción no v�lida");
			}
		}
		while(!finalizar);
	}
}
