package Primero.TercerTrimestre.Practica.EstructurasDinamicasDatos.Control_EDD_24_25;

import java.util.*;

public class Modelo extends HashMap<String, TreeMap<String , TreeSet<String>>>
{
	public String mostrar(HashMap<String, TreeMap<String , TreeSet<String>>> modelo)
	{
		String res="";
		for(String m:modelo.keySet())
		{
			res+=m+"\nEstudiantes:\n";
			for(String h :modelo.get(m).keySet())
				res+="   "+h+" con módulos: "+modelo.get(m).get(h)+"\n";
		}
		return res;
	}

	public String cursoConMasEstudiantesUnicos() {
		String cursoMax = "";
		int maxEstudiantes = 0;

		for (Map.Entry<String, TreeMap<String, TreeSet<String>>> entry : this.entrySet()) {
			int numEstudiantes = entry.getValue().size();
			if (numEstudiantes > maxEstudiantes) {
				maxEstudiantes = numEstudiantes;
				cursoMax = entry.getKey();
			}
		}

		return cursoMax;
	}

	public Boolean matricularAlumnoCuros(String curso, String alumno) {
		this.putIfAbsent(curso, new TreeMap<>());
		TreeMap<String, TreeSet<String>> estudiantes = this.get(curso);

		if (estudiantes.containsKey(alumno)) {
			return false;
		} else {
			estudiantes.put(alumno, new TreeSet<>());
			return true;
		}
	}

	public Map<String, Integer> numeroCursosPorAlumno() {
		Map<String, Integer> resultado = new TreeMap<>();

		for (Map.Entry<String, TreeMap<String, TreeSet<String>>> entry : this.entrySet()) {
			for (String alumno : entry.getValue().keySet()) {
				resultado.put(alumno, resultado.getOrDefault(alumno, 0) + 1);
			}
		}

		return resultado;
	}

	public HashMap<String, TreeMap<String, TreeSet<String>>> datosReorganizadosPorEstudiante() {
		HashMap<String, TreeMap<String, TreeSet<String>>> reorganizado = new HashMap<>();

		for (Map.Entry<String, TreeMap<String, TreeSet<String>>> entry : this.entrySet()) {
			String curso = entry.getKey();
			for (Map.Entry<String, TreeSet<String>> estudiante : entry.getValue().entrySet()) {
				String idEstudiante = estudiante.getKey();
				TreeSet<String> modulos = estudiante.getValue();

				reorganizado.putIfAbsent(idEstudiante, new TreeMap<>());
				reorganizado.get(idEstudiante).put(curso, new TreeSet<>(modulos));
			}
		}

		return reorganizado;
	}
}
