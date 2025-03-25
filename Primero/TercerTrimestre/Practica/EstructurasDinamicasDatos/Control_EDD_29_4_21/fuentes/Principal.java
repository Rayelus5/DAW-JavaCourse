package Primero.TercerTrimestre.Practica.EstructurasDinamicasDatos.Control_EDD_29_4_21.fuentes;

public class Principal
{

	private Modelo modelo;

	/******* COMERCIALES Y EMPRESAS PARA CREAR DATOS DE PRUEBA   ************************/
	Comercial c1 = new Comercial("ANDREA PAOLA CORTEZ VARELA",354);
	Comercial c2 = new Comercial("ROSARIO SOTO RODRIGUEZ",567);
	Comercial c3 = new Comercial("VICTOR MANUEL MADRID PEREZ",678);
	Comercial c4 = new Comercial("JESUS DANIEL BERNUZ MARIN",123);
	Comercial c5 = new Comercial("MANUELA GOMEZ LOPEZ",755);
	Comercial c6 = new Comercial("BLAS VILLAMAYOR ROBLES",346);
	Comercial c7 = new Comercial("DAVID GARCIA LINARES",374);
	Comercial c8 = new Comercial("ROSALIA PAZOS SOTO",855);
	Comercial c9 = new Comercial("FLORENTINA ANDUJAR MAÑAS",397);

	Empresa e1 = new Empresa("InfoTecno",8587);
	Empresa e2 = new Empresa("TecnoPro",4245);
	Empresa e3 = new Empresa("ProInfo",7365);
	Empresa e4 = new Empresa("ProTecno",9832);
	Empresa e5 = new Empresa("InfoPro",6358);
	Empresa e6 = new Empresa("AvantPro",3476);
	Empresa e7 = new Empresa("InfoAvant",2871);
	Empresa e8 = new Empresa("AvantInfo",7639);
	Empresa e9 = new Empresa("TecnoAvant",2876);
	/************************************************************************************/

	public static void main(String[] args)
	{
		new Principal();
	}

	public Principal()
	{
		this.modelo = new Modelo();

		this.añadeDatosDePrueba();

		System.out.println("Hay errores (debe salir false): "+this.modelo.hayErrores());
		this.modelo.añadeVisita(new Visita(c2,e5,3));
		System.out.println("Hay errores (debe salir true): "+this.modelo.hayErrores());

		System.out.println("Total de compras de las empresas del comercial c1 (debe salir 32136.0): "+
				this.modelo.totalComprasPorComercial(c1));
		System.out.println("Total de compras de las empresas del comercial c2 (debe salir 24918.0): "+
				this.modelo.totalComprasPorComercial(c2));

		System.out.println("Total de ventas de los comerciales que tienen asignada la empresa e6 (debe salir 3297.0): "+
				this.modelo.totalVentasPorEmpresa(e6));
		System.out.println("Total de ventas de los comerciales que tienen asignada la empresa e5 (debe salir 755.0): "+
				this.modelo.totalVentasPorEmpresa(e5));

		System.out.println("Comerciales que hicieron visitas en el mes 3: "+
				this.modelo.comercialesQueVisitaronEnElMes(3));

		System.out.println("Empresas que no fueron visitadas: "+this.modelo.nombresDeEmpresasNoVisitadas());

		System.out.println("Mapa de visitas de cada comercial: "+this.modelo.mapaVisitasPorComercial());
	}

	private void añadeDatosDePrueba()
	{

		this.modelo.añadeComercial(c1);
		this.modelo.añadeComercial(c2);
		this.modelo.añadeComercial(c3);
		this.modelo.añadeComercial(c4);
		this.modelo.añadeComercial(c5);
		this.modelo.añadeComercial(c6);
		this.modelo.añadeComercial(c7);
		this.modelo.añadeComercial(c8);
		this.modelo.añadeComercial(c9);

		/* Asignaciones comerciales - empresas
   e1 e2 e3 e4 e5 e6 e7 e8 e9
c1  1  0  1  1  0  1  0  0  1
c2  0  1  1  1  0  1  0  0  0
c3  1  1  1  0  0  1  0  0  1
c4  0  1  1  1  0  1  1  0  0
c5  0  0  1  1  1  0  1  1  0
c6  1  1  1  1  0  1  0  1  0
c7  1  1  0  0  0  1  0  0  0
c8  0  1  1  0  0  1  1  1  0
c9  1  0  0  0  0  0  1  0  1

		*/
		this.modelo.asignaEmpresaAComercial(c1,e1);
		this.modelo.asignaEmpresaAComercial(c1,e3);
		this.modelo.asignaEmpresaAComercial(c1,e4);
		this.modelo.asignaEmpresaAComercial(c1,e6);
		this.modelo.asignaEmpresaAComercial(c1,e9);

		this.modelo.asignaEmpresaAComercial(c2,e2);
		this.modelo.asignaEmpresaAComercial(c2,e3);
		this.modelo.asignaEmpresaAComercial(c2,e4);
		this.modelo.asignaEmpresaAComercial(c2,e6);

		this.modelo.asignaEmpresaAComercial(c3,e1);
		this.modelo.asignaEmpresaAComercial(c3,e2);
		this.modelo.asignaEmpresaAComercial(c3,e3);
		this.modelo.asignaEmpresaAComercial(c3,e6);
		this.modelo.asignaEmpresaAComercial(c3,e9);

		this.modelo.asignaEmpresaAComercial(c4,e2);
		this.modelo.asignaEmpresaAComercial(c4,e3);
		this.modelo.asignaEmpresaAComercial(c4,e4);
		this.modelo.asignaEmpresaAComercial(c4,e6);
		this.modelo.asignaEmpresaAComercial(c4,e7);

		this.modelo.asignaEmpresaAComercial(c5,e3);
		this.modelo.asignaEmpresaAComercial(c5,e4);
		this.modelo.asignaEmpresaAComercial(c5,e5);
		this.modelo.asignaEmpresaAComercial(c5,e7);
		this.modelo.asignaEmpresaAComercial(c5,e8);

		this.modelo.asignaEmpresaAComercial(c6,e1);
		this.modelo.asignaEmpresaAComercial(c6,e2);
		this.modelo.asignaEmpresaAComercial(c6,e3);
		this.modelo.asignaEmpresaAComercial(c6,e4);
		this.modelo.asignaEmpresaAComercial(c6,e6);
		this.modelo.asignaEmpresaAComercial(c6,e8);

		this.modelo.asignaEmpresaAComercial(c7,e1);
		this.modelo.asignaEmpresaAComercial(c7,e2);
		this.modelo.asignaEmpresaAComercial(c7,e6);

		this.modelo.asignaEmpresaAComercial(c8,e2);
		this.modelo.asignaEmpresaAComercial(c8,e3);
		this.modelo.asignaEmpresaAComercial(c8,e6);
		this.modelo.asignaEmpresaAComercial(c8,e7);
		this.modelo.asignaEmpresaAComercial(c8,e8);

		this.modelo.asignaEmpresaAComercial(c9,e1);
		this.modelo.asignaEmpresaAComercial(c9,e7);
		this.modelo.asignaEmpresaAComercial(c9,e9);

		this.modelo.añadeVisita(new Visita(c1,e4,3));
		this.modelo.añadeVisita(new Visita(c8,e3,5));
		this.modelo.añadeVisita(new Visita(c6,e3,3));
		this.modelo.añadeVisita(new Visita(c8,e3,5));
		this.modelo.añadeVisita(new Visita(c5,e5,7));
		this.modelo.añadeVisita(new Visita(c7,e2,8));
		this.modelo.añadeVisita(new Visita(c2,e3,3));
		this.modelo.añadeVisita(new Visita(c2,e4,3));
	}

}
