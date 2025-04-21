package Primero.TercerTrimestre.Practica.EstructurasDinamicasDatos.Control_EDD_24_25;
import java.util.*;

@SuppressWarnings("all")

public class Modelo extends HashMap<String, TreeMap<String, TreeSet<String>>>
{
	public String mostrar(HashMap<String, TreeMap<String , TreeSet<String>>> modelo)
	{
		String res="";
		for(String m:modelo.keySet())
		{
			res+=m+"\nEstudiantes:\n";
			for(String h :modelo.get(m).keySet())
				res+="   "+h+" con m dulos: "+modelo.get(m).get(h)+"\n";
		}
		return res;
	}

	public String cursoConMasEstudiantesUnicos()

	//Devuelve el nombre del curso que ha tenido la mayor cantidad de estudiantes  nicos
	//(es decir, estudiantes con IDs diferentes).
	{
		String cursomastomada = "";
		int max = 0;

		for(String curso : this.keySet())
		{
			int numalumnos = this.get(curso).size();
			if(numalumnos > max)
			{
				max = numalumnos;
				cursomastomada = curso;
			}
		}

		return cursomastomada;
	}

	public Boolean matricularAlumnoCuros(String curso, String Alumno)
	//incluir en al curso pasado por par metro,  el alumno que se pasa por par metro. Si el
	//curso no existe, se a ade nuevo. Si el alumno ya est  en el curso se devuelve un
	//booleano de valor false. Por el contrario, se incluye al aalumno en dicho curso y
	//devolvemos el valor booleano true.
	{
		this.put(curso, new TreeMap<>());

		if(curso.contains(Alumno))
		{
			return false;
		}

		TreeMap<String, TreeSet<String>> cursos = this.get(curso);

		cursos.put(Alumno, new TreeSet<>());
		return true;
	}

	public Map<String, Integer> numeroCursosPorAlumno()
	// Devuelve un mapa cuyas claves son los identificadores de los alumnos ordenador alfab ticamente,
	// y en valores el n mero de cursos en los que se encuentra matriculado dicho alumno
	{
		TreeMap<String, Integer> cursoscount = new TreeMap<>();

		for(String curso : this.keySet())
		{
			for(String alumno : this.get(curso).keySet())
			{
				if(!cursoscount.containsKey(alumno))
				{
					cursoscount.put(alumno, 1);
				}
				else
				{
					cursoscount.put(alumno, cursoscount.get(alumno)+1);
				}
			}
		}

		return cursoscount;
	}


	public HashMap<String, TreeMap<String, TreeSet<String>>> datosReorganizadosPorEstudiante()
	// Devuelve un mapa con los mismos datos del modelo, pero en lugar de estar
	// organizados por los nombres de los cursos, deben estar
	// los identificadores de de los estudianes como claves y asociados a esos identificadores, los nombres de
	// las cursos y los m dulos superados de los mismos
	{
		HashMap<String, TreeMap<String, TreeSet<String>>> reorganizado = new HashMap<String, TreeMap<String, TreeSet<String>>>();

		for(String curso : this.keySet())
		{
			for(String alumno: this.get(curso).keySet())
			{
				reorganizado.put(alumno, new TreeMap<>());
				reorganizado.get(alumno).put(curso, new TreeSet<>(this.get(curso).get(alumno)));
			}
		}

		return reorganizado;
	}
}