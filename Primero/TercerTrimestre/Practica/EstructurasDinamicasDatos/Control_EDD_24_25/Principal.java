package Primero.TercerTrimestre.Practica.EstructurasDinamicasDatos.Control_EDD_24_25;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.*;

public class Principal
{
	private Modelo modelo;
	public static void main(String[] args)
	{
		new Principal();
	}

	public Principal()
	{
		this.modelo = new Modelo();
		this.creaDatosDePrueba();
		//System.out.println(this.modelo.mostrar(modelo));

		System.out.println("Apartado a) Curso con más estudiantes: "+
				this.modelo.cursoConMasEstudiantesUnicos());

		System.out.println("\nApartado b) Matricular al alumno 34567890C en FOL: "+
				this.modelo.matricularAlumnoCuros("FOL", "34567890C"));

		System.out.println("\nApartado b) Matricular al alumno 11111111A en Base de Datos: "+
				this.modelo.matricularAlumnoCuros("Base de Datos", "11111111A"));
		System.out.println("\nApartado c) Alumnos y número de alumns en los que están matriculados: "+
				this.modelo.numeroCursosPorAlumno());
		System.out.println("\nApartado c) Alumnos y número de alumns en los que están matriculados: "+
				this.modelo.datosReorganizadosPorEstudiante());
	}


	private void creaDatosDePrueba()
	{
		modelo.put("Programación Java", new TreeMap<String,TreeSet<String>>());
		modelo.put("Base de Datos", new TreeMap<String,TreeSet<String>>());
		modelo.put("Python", new TreeMap<String,TreeSet<String>>());
		modelo.put("Lenguaje de Marcas", new TreeMap<String,TreeSet<String>>());

		modelo.get("Programación Java").put("56789012E",new TreeSet<String>());
		modelo.get("Programación Java").get("56789012E").add("Introducción");
		modelo.get("Programación Java").get("56789012E").add("Arrays");
		modelo.get("Programación Java").get("56789012E").add("objetos");
		modelo.get("Programación Java").get("56789012E").add("EDD");
		modelo.get("Programación Java").put("34567890C",new TreeSet<String>());
		modelo.get("Programación Java").get("34567890C").add("Introducción");
		modelo.get("Programación Java").get("34567890C").add("Arrays");
		modelo.get("Programación Java").get("34567890C").add("objetos");
		modelo.get("Programación Java").get("34567890C").add("EDD");
		modelo.get("Programación Java").get("34567890C").add("Ficheros");
		modelo.get("Programación Java").get("34567890C").add("Interfaces");
		modelo.get("Programación Java").get("34567890C").add("Herencias");
		modelo.get("Base de Datos").put("56789012E",new TreeSet<String>());
		modelo.get("Base de Datos").get("56789012E").add("Introducción");
		modelo.get("Base de Datos").get("56789012E").add("Modeo Entidad Relación");
		modelo.get("Base de Datos").get("56789012E").add("Consultas");
		modelo.get("Base de Datos").get("56789012E").add("Tablas");
		modelo.get("Base de Datos").get("56789012E").add("Joins");
		modelo.get("Base de Datos").get("56789012E").add("Triggers");
		modelo.get("Base de Datos").put("45678901D",new TreeSet<String>());
		modelo.get("Base de Datos").get("45678901D").add("Introducción");
		modelo.get("Base de Datos").get("45678901D").add("Consultas");
		modelo.get("Base de Datos").get("45678901D").add("Joins");
		modelo.get("Base de Datos").get("45678901D").add("Modeo Entidad Relación");
		modelo.get("Python").put("12345678A",new TreeSet<String>());
		modelo.get("Python").get("12345678A").add("Introducción");
		modelo.get("Python").get("12345678A").add("Control");
		modelo.get("Python").get("12345678A").add("Funciones");
		modelo.get("Python").get("12345678A").add("Módulos");
		modelo.get("Python").get("12345678A").add("Arrays");
		modelo.get("Python").get("12345678A").add("Biblioteca");
		modelo.get("Lenguaje de Marcas").put("34567890C",new TreeSet<String>());
		modelo.get("Lenguaje de Marcas").get("34567890C").add("XML");
		modelo.get("Lenguaje de Marcas").get("34567890C").add("HTML");
		modelo.get("Lenguaje de Marcas").get("34567890C").add("CSS");
		modelo.get("Base de Datos").put("67890123F",new TreeSet<String>());
		modelo.get("Base de Datos").get("67890123F").add("Modeo Entidad Relación");
		modelo.get("Base de Datos").get("67890123F").add("Introducción");
		modelo.get("Base de Datos").get("67890123F").add("Consultas");
		modelo.get("Base de Datos").get("67890123F").add("Joins");
		modelo.get("Base de Datos").put("11111111A",new TreeSet<String>());
		modelo.get("Base de Datos").get("11111111A").add("Modeo Entidad Relación");
		modelo.get("Base de Datos").get("11111111A").add("Introducción");
		modelo.get("Base de Datos").get("11111111A").add("Consultas");
		modelo.get("Programación Java").put("12345678A",new TreeSet<String>());
		modelo.get("Programación Java").get("12345678A").add("Introducción");
		modelo.get("Programación Java").get("12345678A").add("Herencias");
		modelo.get("Programación Java").get("12345678A").add("EDD");
		modelo.get("Programación Java").get("12345678A").add("Objetos");
		modelo.get("Programación Java").get("12345678A").add("Ficheros");
		modelo.get("Python").put("56789012E",new TreeSet<String>());
		modelo.get("Python").get("56789012E").add("Funciones");
		modelo.get("Python").get("56789012E").add("Bibliotecas");

	}
}
