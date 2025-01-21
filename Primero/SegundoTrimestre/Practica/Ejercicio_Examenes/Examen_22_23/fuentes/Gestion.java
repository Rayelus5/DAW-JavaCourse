package Primero.SegundoTrimestre.Practica.Ejercicio_Examenes.Examen_22_23.fuentes;
import java.util.Arrays;

public class Gestion
{
	public static Proyecto face;
	public static Proyecto guerras;

	public static void main(String args[])
	{

		crearDatos();
		//mostrarDatos();
		
		
		//APARTADO A
		System.out.print("Apartado a): (debe salir false):");
		System.out.println(
				guerras.gettClases()[1].gettMetodos()[0].igualesParametros(
			    face.gettClases()[1].gettMetodos()[0]));
		// a�ado par�metros para que salga true:
		Metodo m = new Metodo("void","noVale",1);
		m.anadeParametro(new Definicion("String","x"));
		m.anadeParametro(new Definicion("Bando","y"));
		m.anadeParametro(new Definicion("Bando","z"));
		face.gettClases()[1].anadeMetodo(m);
		//pruebo ahora con el m�todo nuevo:
		System.out.print("Apartado a): (debe salir true):");
		System.out.println(
				guerras.gettClases()[1].gettMetodos()[0].igualesParametros(
			    face.gettClases()[1].gettMetodos()[3]));
		
		
		// APARTADO B
		System.out.print("Apartado b): (debe salir false):");
		System.out.println(
				guerras.gettClases()[1].gettMetodos()[0].equals(
			    face.gettClases()[1].gettMetodos()[3]));
		// le cambio el nombre para que sean iguales
		face.gettClases()[1].gettMetodos()[3].setNombre("Guerra");
		// pruebo con el m�todo con el nombre cambiado
		System.out.print("Apartado b): (debe salir true):");
		System.out.println(
				guerras.gettClases()[1].gettMetodos()[0].equals(
			    face.gettClases()[1].gettMetodos()[3]));
		
		
		// APARTADO C
		System.out.print("Apartado c): (debe salir false):");
		System.out.println(
				guerras.gettClases()[1].tieneMetodosDuplicados());
		
		guerras.gettClases()[1].anadeMetodo(m);
		System.out.print("Apartado c): (debe salir true):");
		System.out.println(
				guerras.gettClases()[1].tieneMetodosDuplicados());
	
		// APARTADO D
		System.out.print("Apartado d): (debe salir true):");
		System.out.println(face.gettClases()[1].esMasCompleja(1));
		System.out.print("Apartado d): (debe salir false):");
		System.out.println(face.gettClases()[1].esMasCompleja(4));
		
		// APARTADO E
		System.out.print("Apartado e): ");
		System.out.println(Arrays.toString(face.gettClases()[0].getMetodosQueUsan("String")));
		System.out.print("Apartado e): ");
		System.out.println(Arrays.toString(guerras.gettClases()[1].getMetodosQueUsan("String")));
		System.out.print("Apartado e): ");
		System.out.println(Arrays.toString(guerras.gettClases()[1].getMetodosQueUsan("float")));

	}


	private static void crearDatos()
	{
		//CREAMOS DOS PROYECTOS
		face = new Proyecto("ExamenFacebook");
		guerras = new Proyecto("ProyectoGuerras");

		//ANADIMOS CLASES A CADA PROYECTO
		face.anadeClase(new Clase("GestionFacebook"));
		face.anadeClase(new Clase("Miembro"));
		face.anadeClase(new Clase("ListaMiembros"));

		guerras.anadeClase(new Clase("Gestion"));
		guerras.anadeClase(new Clase("Guerra"));
		guerras.anadeClase(new Clase("Bando"));
		guerras.anadeClase(new Clase("Batalla"));
		guerras.anadeClase(new Clase("Pais"));

		//ANADIMOS ATRIBUTOS A LAS CLASES
		guerras.getClase("Guerra").anadeAtributo(new Definicion("String", "denominacion"));      
		guerras.getClase("Guerra").anadeAtributo(new Definicion("Bando", "bandoA"));                        
		guerras.getClase("Guerra").anadeAtributo(new Definicion("Bando", "bandoB"));                        
		guerras.getClase("Guerra").anadeAtributo(new Definicion("Batalla", "tablaBatallas[]"));        
		guerras.getClase("Guerra").anadeAtributo(new Definicion("int", "nBatallas"));     

		Metodo mg1 = new Metodo("","Guerra",2);
		Metodo mg2 = new Metodo("void","anadeBatalla",3);
		Metodo mg3 = new Metodo("String","toString",1);
		Metodo mg4 = new Metodo("int","getNPaises",5);
		Metodo mg5 = new Metodo("int","compareTo",4);

		mg1.anadeParametro(new Definicion("String", "denominacion"));
		mg1.anadeParametro(new Definicion("Bando", "bandoA"));
		mg1.anadeParametro(new Definicion("Bando", "bandoB"));
		mg2.anadeParametro(new Definicion("Batalla", "batalla")); 
		mg5.anadeParametro(new Definicion("Guerra", "otra"));

		guerras.getClase("Guerra").anadeMetodo(mg1); 
		guerras.getClase("Guerra").anadeMetodo(mg2); 
		guerras.getClase("Guerra").anadeMetodo(mg3); 
		guerras.getClase("Guerra").anadeMetodo(mg4); 	 
		guerras.getClase("Guerra").anadeMetodo(mg5); 
		
		guerras.getClase("Pais").anadeAtributo(new Definicion("String", "nombre")); 
		guerras.getClase("Pais").anadeAtributo(new Definicion("Guerra", "tablaGuerras[]")); 
		guerras.getClase("Pais").anadeAtributo(new Definicion("int", "nGuerras")); 
		
		Metodo mg6 = new Metodo("boolean","haSidoAliadoDe",2);
		Metodo mg7 = new Metodo("Pais[]","posiblesEnemigos",3);
		Metodo mg8 = new Metodo("int","getNBatallas",1);
		
		mg6.anadeParametro(new Definicion("Pais", "otro"));
		
		guerras.getClase("Pais").anadeMetodo(mg6);
		guerras.getClase("Pais").anadeMetodo(mg7);
		guerras.getClase("Pais").anadeMetodo(mg8);
		

		//FACEBOOK
		
		face.getClase("ListaMiembros").anadeAtributo(new Definicion("Miembro", "tabla[]"));   	
		face.getClase("Miembro").anadeAtributo(new Definicion("String", "email"));   
		face.getClase("Miembro").anadeAtributo(new Definicion("String", "nombre"));  
		face.getClase("Miembro").anadeAtributo(new Definicion("ListaMiembros", "amigos"));  

		
		Metodo mf1 = new Metodo("void","main",2);
		Metodo mf2 = new Metodo("void","hacerAmigos",6);
		Metodo mf3 = new Metodo("boolean","sonTodosAmigos",4);
		Metodo mf4 = new Metodo("float","�ndiceDeSimilitud",3);

		mf1.anadeParametro(new Definicion("String", "args[]"));
		mf2.anadeParametro(new Definicion("Miembro", "a"));
		mf2.anadeParametro(new Definicion("Miembro", "b"));
		mf3.anadeParametro(new Definicion("ListaMiembros", "lista"));
		mf4.anadeParametro(new Definicion("Miembro", "a"));
		mf4.anadeParametro(new Definicion("Miembro", "b"));

		face.getClase("GestionFacebook").anadeMetodo(mf1);
		face.getClase("GestionFacebook").anadeMetodo(mf2);
		face.getClase("GestionFacebook").anadeMetodo(mf3);
		face.getClase("GestionFacebook").anadeMetodo(mf4);

		Metodo mf5 = new Metodo("void","a�adeMiembroSinRepetir",2);
		Metodo mf6 = new Metodo("boolean","contieneMiembro",6);
		Metodo mf7 = new Metodo("void","eliminaMiembro",4);
		
		mf5.anadeParametro(new Definicion("Miembro", "m"));
		mf6.anadeParametro(new Definicion("Miembro", "m"));
		mf7.anadeParametro(new Definicion("Miembro", "m"));
		
		face.getClase("ListaMiembros").anadeMetodo(mf5);
		face.getClase("ListaMiembros").anadeMetodo(mf6);
		face.getClase("ListaMiembros").anadeMetodo(mf7);
		
		Metodo mf8 = new Metodo("boolean","tieneComoAmigoA",4);
		Metodo mf9 = new Metodo("ListaMiembros","personasQueQuizaConozca",4);
		Metodo mf10 = new Metodo("ListaMiembros","amigosEnComun",4);
		
		mf8.anadeParametro(new Definicion("Miembro", "otro"));
		mf10.anadeParametro(new Definicion("Miembro", "b"));
		
		face.getClase("Miembro").anadeMetodo(mf8);
		face.getClase("Miembro").anadeMetodo(mf9);
		face.getClase("Miembro").anadeMetodo(mf10);

	}
	

	private static void mostrarDatos()
	{		
		System.out.println(guerras);
		System.out.println(face);
	}
}
