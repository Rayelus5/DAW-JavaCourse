package Primero.PrimerTrimestre.Practica.EjemplosTablasBidimensionales;
import javax.swing.JOptionPane;

public class Ejercicio1Bidimensionales {
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
		String listado="";
		int acumNotas = 0;
		int contNotas = 0;
		float mejorMedia = -1;
		String empollón="";
		float mediaUnAlumno=0;

		// inicializo la tabla a -1
		for(int col=0;col<MAX_EXAMS;col++)
			for(int fila =0;fila<MAX_ALUM ;fila++)
				tNotas[fila][col] = -1;

		/*
		for(int fila=0;fila<tNotas.length;fila++)
			Arrays.fill(tNotas[fila], -1);
		 */

		do
		{
			opción = JOptionPane.showInputDialog(
					"1 - Introducir una (1) nota de un (1) alumno\n"
							+ "2 - Listar todo\n"
							+ "3 - Mostrar nota media de un alumno\n"
							+ "4 - Mostrar nota media de un examen\n"
							+ "5 - Mostrar el nombre del mejor alumno\n"
							+ "6 - Salir").charAt(0);

			switch(opción)
			{
				case '1':
					// cada vez que se le da a la opcion 1 se introduce nombre,
					// num de examen, y la nota de ese examen

					nombre = JOptionPane.showInputDialog("Nombre: ");
					// tengo que buscarlo, para saber si tengo
					// que actualizar una nota de uno que ya esté o añadirlo
					pos = 0;
					while(pos<nElem && !nombre.equals(tNombres[pos]))
						pos++;
					// cuando salgo del while, o no está,
					// o está en la posición pos.
					nExam = Integer.parseInt(
							JOptionPane.showInputDialog("Num Examen (0-4):"));

					if(pos==nElem)  // si no está, lo añado
					{
						tNombres[nElem] = nombre;
						nElem++;
					}
					// Ahora sí está, lo tengo en la fila pos

					tNotas[pos][nExam]=Integer.parseInt(
							JOptionPane.showInputDialog("Nota: "));

					break;
				case '2':
					listado= "";

					for(int fila=0;fila<nElem;fila++)
					{
						listado+=(tNombres[fila]);

						for(int col=0;col<MAX_EXAMS;col++)
						{
							listado+=" Ex."+col+": ";
							if(tNotas[fila][col]>-1)
								listado+=tNotas[fila][col]+"   ";
							else
								listado+=" - ";
						}

						listado+="\n";

					}
					JOptionPane.showMessageDialog(null, listado);
					break;

				case '3':
					nombre = JOptionPane.showInputDialog("Nombre: ");
					// tengo que buscarlo

					pos = 0;
					while(pos<nElem && !nombre.equals(tNombres[pos]))
						pos++;
					// cuando salgo del while, o no está,
					// o está en la posición pos.

					if(pos==nElem)
						JOptionPane.showMessageDialog(null, "Ese alumno no existe");
					else
					{
						acumNotas = 0;
						contNotas = 0;

						for(int col=0;col<MAX_EXAMS;col++)
							if( tNotas[pos][col] !=-1)
							{
								acumNotas+=tNotas[pos][col];
								contNotas++;
							}
						// aqui tenemos ya la suma de notas
						// y el contador de notas

						JOptionPane.showMessageDialog(null, "La media de "+nombre+
								" es: "+(float)acumNotas/contNotas);

					}


					break;
				case '4':
					nExam = Integer.parseInt(
							JOptionPane.showInputDialog("Num Examen (0-4):"));
					acumNotas = 0;
					contNotas = 0;

					for(int fila=0;fila<nElem;fila++)
						if( tNotas[fila][nExam] !=-1)
						{
							acumNotas+=tNotas[fila][nExam];
							contNotas++;
						}
					// aqui tenemos ya la suma de notas
					// y el contador de notas

					JOptionPane.showMessageDialog(null, "La media del examen "+nExam+
							" es: "+(float)acumNotas/contNotas);
					break;
				case '5':
					for(int fila=0;fila<nElem;fila++)
					{
						acumNotas = 0;
						contNotas = 0;
						for(int col=0;col<MAX_EXAMS;col++)
						{
							if(tNotas[fila][col] !=-1)
							{
								acumNotas+=tNotas[pos][col];
								contNotas++;
							}
						}
						mediaUnAlumno = (float)acumNotas/contNotas;
						if(mediaUnAlumno > mejorMedia)
						{
							mejorMedia = mediaUnAlumno;
							empollón = tNombres[fila];
						}
					}
					JOptionPane.showMessageDialog(null, "El listorro es: "+
							empollón);

					break;

				case '6':
					finalizar = true;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opción no válida");
			}
		}
		while(!finalizar);
	}
}