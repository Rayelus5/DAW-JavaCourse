package Primero.SegundoTrimestre.Practica.POO.ControlPOO_23_24.fuentes;

public class Gestion
{
	private static Club club;
	public static void main(String[] args)
	{
		club = new Club();
		creaDatos();
		// descomentar para ver todos los datos
		// System.out.println(club);
		System.out.println("Apartado a): ");
		System.out.print("Ana ha tenido como pareja a Carlos (debe ser true): ");
		System.out.println(club.gettMiembros()[0].haTenidoComoParejaA(club.gettMiembros()[1]));
		System.out.print("Ana ha tenido como pareja a David (debe ser false): ");
		System.out.println(club.gettMiembros()[0].haTenidoComoParejaA(club.gettMiembros()[3]));
		System.out.println("Apartado b): ");
		System.out.print("Ana es sugar (debe ser false): ");
		System.out.println(club.gettMiembros()[0].esSugar());
		System.out.print("Juan es sugar (debe ser true): ");
		System.out.println(club.gettMiembros()[17].esSugar());
		System.out.println("Apartado c): ");
		System.out.print("Ana es infiel (debe ser true): ");
		System.out.println(club.gettMiembros()[0].esInfiel());
		System.out.print("Clara es infiel (debe ser false): ");
		System.out.println(club.gettMiembros()[16].esInfiel());
		System.out.println("Apartado d): ");
		System.out.print("Carlos ha sido traicionado (debe ser true): ");
		System.out.println(club.gettMiembros()[1].haSidoTraicionado());
		System.out.print("Lucía ha sido traicionada (debe ser false): ");
		System.out.println(club.gettMiembros()[4].haSidoTraicionado());
		System.out.println("Apartado e): ");
		System.out.print("Pareja mas promiscua de Carlos (debe ser Ana): ");
		System.out.println(club.gettMiembros()[1].parejaMasPromiscua().getNombre());
		System.out.print("Pareja mas promiscua de Elena (debe ser Juan): ");
		System.out.println(club.gettMiembros()[2].parejaMasPromiscua().getNombre());
		System.out.println("Apartado f): ");
		System.out.print("Segun compareTo es Ana menor que Elena (debe ser true): ");
		System.out.println(club.gettMiembros()[0].compareTo(club.gettMiembros()[2])<0);
		System.out.print("Segun compareTo es Ana menor que Carlos (debe ser false): ");
		System.out.println(club.gettMiembros()[0].compareTo(club.gettMiembros()[1])<0);
	}

	public static void creaDatos()
	{

		club.anadeMiembro(new Miembro("Ana", 23));
		club.anadeMiembro(new Miembro("Carlos", 28));
		club.anadeMiembro(new Miembro("Elena", 21));
		club.anadeMiembro(new Miembro("David", 25));
		club.anadeMiembro(new Miembro("Lucía", 24));
		club.anadeMiembro(new Miembro("Javier", 29));
		club.anadeMiembro(new Miembro("Sofía", 22));
		club.anadeMiembro(new Miembro("Daniel", 26));
		club.anadeMiembro(new Miembro("María", 27));
		club.anadeMiembro(new Miembro("Pedro", 30));
		club.anadeMiembro(new Miembro("Laura", 20));
		club.anadeMiembro(new Miembro("José", 31));
		club.anadeMiembro(new Miembro("Isabel", 19));
		club.anadeMiembro(new Miembro("Marcos", 32));
		club.anadeMiembro(new Miembro("Carla", 18));
		club.anadeMiembro(new Miembro("Diego", 33));
		club.anadeMiembro(new Miembro("Clara", 34));
		club.anadeMiembro(new Miembro("Juan", 35));
		club.anadeMiembro(new Miembro("Sara", 24));
		club.anadeMiembro(new Miembro("Rubén", 25));


		creaRelacion("Ana", "Carlos", 12, 3, 2021, 15, 6, 2022);
		creaRelacion("Elena", "David", 21, 5, 2019, 30, 8, 2021);
		creaRelacion("Lucía", "Javier", 16, 7, 2021, 18, 9, 2023);
		creaRelacion("Sofía", "Daniel", 25, 4, 2021, 27, 6, 2022);
		creaRelacion("María", "Pedro", 9, 1, 2021, 11, 3, 2023);
		creaRelacion("Laura", "José", 19, 6, 2021, 21, 8, 2022);
		creaRelacion("Isabel", "Marcos", 23, 10, 2020, 25, 12, 2022);
		creaRelacion("Carla", "Diego", 17, 2, 2021, 19, 4, 2023);
		creaRelacion("Clara", "Juan", 27, 7, 2021, 29, 9, 2023);
		creaRelacion("Sara", "Rubén", 15, 9, 2019, 17, 11, 2020);
		creaRelacion("David", "Sofía", 10, 4, 2020, 12, 6, 2021);
		creaRelacion("Javier", "Elena", 3, 11, 2019, 5, 12, 2020);
		creaRelacion("Daniel", "Elena", 14, 8, 2020, 16, 10, 2021);
		creaRelacion("Juan", "Isabel", 6, 9, 2019, 8, 11, 2020);
		creaRelacion("José", "Carla", 2, 3, 2020, 4, 5, 2021);
		creaRelacion("Marcos", "Clara", 8, 5, 2019, 10, 7, 2020);
		creaRelacion("Juan", "Sara", 5, 12, 2020, 7, 2, 2022);
		creaRelacion("Juan", "Ana", 1, 6, 2021, 3, 8, 2022);
		creaRelacion("Juan", "Elena", 9, 1, 2021, 11, 3, 2023);
		creaRelacion("Lucía", "Carlos", 16, 8, 2022, 18, 9, 2023);
	}

	private static void creaRelacion(String miembro1, String miembro2,
									 int diaIni, int mesIni, int annoIni, int diaFin, int mesFin, int annoFin)
	{
		Miembro m1 = null;
		Miembro m2 = null;
		for(Miembro m:club.gettMiembros())
			if(m.getNombre().equals(miembro1))
				m1 = m;

		for(Miembro m:club.gettMiembros())
			if(m.getNombre().equals(miembro2))
				m2 = m;

		m1.anadeRelacion(m2, new Fecha(diaIni, mesIni, annoIni),
				new Fecha(diaFin, mesFin, annoFin));

		m2.anadeRelacion(m1, new Fecha(diaIni, mesIni, annoIni),
				new Fecha(diaFin, mesFin, annoFin));
	}

}
