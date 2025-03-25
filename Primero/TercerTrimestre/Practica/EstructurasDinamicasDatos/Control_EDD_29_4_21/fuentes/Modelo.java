package Primero.TercerTrimestre.Practica.EstructurasDinamicasDatos.Control_EDD_29_4_21.fuentes;

import java.util.*;

public class Modelo
{
	private HashMap<Comercial, TreeSet<Empresa>> asignaciones;
	private Vector<Visita> visitas;

	public Modelo()
	{
		this.asignaciones = new HashMap<Comercial,TreeSet<Empresa>>();
		this.visitas = new Vector<Visita>();
	}

	public void añadeComercial(Comercial c)
	{
		// añade al mapa de asignaciones una nueva pareja con el comercial pasado como
		// parámetro y un conjunto nuevo vacío de empresas asignadas.

		TreeSet<Empresa> empresasAsignadas = new TreeSet<Empresa>();
		this.asignaciones.put(c, empresasAsignadas);

		//SOLUTION: this.asignaciones.put(c, new TreeSet<Empresa>());

	}

	public void asignaEmpresaAComercial(Comercial c, Empresa e)
	{
		// asigna la empresa pasada como parámetro al conjunto de empresas que tiene asignadas
		// el comercial pasado como parámetro.

		TreeSet<Empresa> empresasAsignadas = this.asignaciones.get(c);
        empresasAsignadas.add(e);

		//SOLUTION: this.asignaciones.get(c).add(e);
	}

	public void añadeVisita(Visita visita)
	{
		this.visitas.add(visita);
	}

	public boolean hayErrores()
	{
		// Devuelve true si hay alguna visita hecha por un comercial a una empresa que NO estaba
		// asignada a ese comercial. Devuelve false en otro caso.

		for (Visita visita : this.visitas)
			if (!this.asignaciones.get(visita.getComercial()).contains(visita.getEmpresa()))
                return true;

        return false;
	}

	public float totalComprasPorComercial(Comercial c)
	{
		// Devuelve el total de compras hechas por las empresas asignadas al comercial
		// pasado como parámetro.

		float totalCompras = 0;

		for (Empresa e : this.asignaciones.get(c))
			totalCompras += e.getCompras();

		return totalCompras;

	}

	public float totalVentasPorEmpresa(Empresa e)
	{
		// Devuelve el total de ventas hechas por todos los comerciales asignados a
		// la empresa pasada como parámetro.

		float totalVentas = 0;

        for (Comercial c : this.asignaciones.keySet())
			if (this.asignaciones.get(c).contains(e))
				totalVentas += c.getVentas();

        return totalVentas;
	}


	public TreeSet<Comercial> comercialesQueVisitaronEnElMes(int mes)
	{
		// Devuelve un TreeSet con todos los comerciales que hicieron alguna visita
		// en el mes pasado como parámetro.

		TreeSet<Comercial> comercialesVisitados = new TreeSet<Comercial>();

        for (Visita visita : this.visitas)
			if (visita.getMes() == mes)
				comercialesVisitados.add(visita.getComercial());

        return comercialesVisitados;
	}

	public TreeSet<String> nombresDeEmpresasNoVisitadas()
	{
		// Devuelve un TreeSet con todas las empresas que no han recibido ninguna visita.
		return null;
	}


	public TreeMap<Comercial, LinkedList<Visita>> mapaVisitasPorComercial()
	{
		// Devuelve un mapa con todos los comerciales como claves, y el valor asociado a 
		// cada comercial es una LinkedList de las visitas que ha hecho ese comercial.

		return null;
	}

}
