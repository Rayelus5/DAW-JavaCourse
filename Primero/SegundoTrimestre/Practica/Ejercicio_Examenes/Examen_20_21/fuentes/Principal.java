package Primero.SegundoTrimestre.Practica.Ejercicio_Examenes.Examen_20_21.fuentes;
import java.util.Arrays;

public class Principal
{

	public static void main(String[] args)
	{
		// CREAMOS UNA VARIABLE TIPO ZOOLÓGICO
		Zoológico zoo = new Zoológico();

		//CREAMOS VETERINARIOS
		Veterinario v1 = (new Veterinario("Alex Cremento "));
		Veterinario v2 = (new Veterinario("Sindy Entes   "));
		Veterinario v3 = (new Veterinario("Isaac A. Mocos"));
		Veterinario v4 = (new Veterinario("Lali Cuadora  "));

		//LOS AÑADIMOS AL ZOOLÓGICO
		zoo.añadeVeterinario(v1);
		zoo.añadeVeterinario(v2);
		zoo.añadeVeterinario(v3);
		zoo.añadeVeterinario(v4);

		//CREAMOS VARIOS ANIMALES, CON SUS PADRES, (PUEDEN SER null, SI SON LOS PRIMEROS)
		//FECHA DE NACIMIENTO Y SU VETERINARIO ASISTENTE (PUEDEN SER null, SI SON LOS PRIMEROS)
		Mamífero niko = new Mamífero("Niko",null,null,null,null);
		Mamífero kira = new Mamífero("Kira",null,null,null,null);
		Mamífero milú = new Mamífero("Milú",null,null,null,null);
		Mamífero nala = new Mamífero("Nala",null,null,null,null);

		Mamífero borry = new Mamífero("Borry",niko,kira,new Fecha(2,2,2018),v1);
		Mamífero loqui = new Mamífero("Loqui",niko,kira,new Fecha(3,3,2018),v2);
		Mamífero luna = new Mamífero("Luna",niko,kira,new Fecha(4,4,2018),v2);
		Mamífero lola = new Mamífero("Lola",niko,kira,new Fecha(5,5,2018),v1);

		Mamífero nilo = new Mamífero("Nilo",milú,nala,new Fecha(5,5,2018),v3);
		Mamífero noah = new Mamífero("Noah",milú,nala,new Fecha(5,6,2018),v3);
		Mamífero noa = new Mamífero("Noa",milú,nala,new Fecha(7,5,2018),v4);
		Mamífero dana = new Mamífero("Dana",milú,nala,new Fecha(5,5,2019),v2);

		Mamífero noel = new Mamífero("Noel",nilo,lola,new Fecha(7,5,2018),v1);
		Mamífero nogo = new Mamífero("Nogo",nilo,lola,new Fecha(5,5,2019),v4);
		Mamífero duna = new Mamífero("Duna",nilo,lola,new Fecha(9,5,2018),v1);
		Mamífero bimba = new Mamífero("Bimba",nilo,lola,new Fecha(7,8,2019),v3);

		// Gamberro tiene un error intencionado en la fecha de nacimiento: nace antes que su madre
		Mamífero gamberro = new Mamífero("Gamberro",loqui,dana,new Fecha(8,8,2018),v3);
		Mamífero pluto = new Mamífero("Pluto",loqui,dana,new Fecha(9,9,2019),v3);
		Mamífero mía = new Mamífero("Mía",loqui,dana,new Fecha(7,5,2020),v2);
		Mamífero maya = new Mamífero("Maya",loqui,dana,new Fecha(7,8,2020),v4);

		//AÑADIMOS LOS MAMÍFEROS AL ZOO

		zoo.añadeMamífero(niko);
		zoo.añadeMamífero(kira);
		zoo.añadeMamífero(milú);
		zoo.añadeMamífero(nala);

		zoo.añadeMamífero(borry);
		zoo.añadeMamífero(loqui);
		zoo.añadeMamífero(luna);
		zoo.añadeMamífero(lola);

		zoo.añadeMamífero(nilo);
		zoo.añadeMamífero(noah);
		zoo.añadeMamífero(noa );
		zoo.añadeMamífero(dana);

		zoo.añadeMamífero(noel);
		zoo.añadeMamífero(nogo);
		zoo.añadeMamífero(duna);
		zoo.añadeMamífero(bimba);

		zoo.añadeMamífero(gamberro);
		zoo.añadeMamífero(pluto);
		zoo.añadeMamífero(mía);
		zoo.añadeMamífero(maya);

		//DESCOMENTAR PARA VER LOS DATOS CREADOS
		//mostrarTabla(zoo.gettMamíferos());
		//mostrarTabla(zoo.gettVeterinarios());

		//APARTADO A)
		System.out.println("Apartado a) mamíferos nacidos entre las fechas 4/4/2019 y 7/5/2020\n");
		mostrarTabla(zoo.getMamíferosEntreFechas(new Fecha(4,4,2019),new Fecha(7,5,2020)));

		//APARTADO B)
		System.out.println("\nApartado b)");
		System.out.println("Veterinarios que asistieron a más de 4 nacimientos: "+
				zoo.getNVeterinariosMasDe(4));

		//APARTADO C)
		System.out.print("\nApartado c):\n");
		System.out.println("¿Algún veterinario asistió a un mamífero y sus dos padres?: "+
				zoo.veterinarioPadresEHijo());

		System.out.print("\nApartado d):\n");
		System.out.println("¿Hay algún error por fechas de padres mayores que la de hijos?: "+zoo.hayErroresEnFechas());

	}

	public static void mostrarTabla(SerVivo tabla[])
	{
		for(SerVivo s:tabla)
			System.out.println(s);
	}



}
