package Primero.TercerTrimestre.Practica.EstructurasDinamicasDatos.Control_EDD_29_4_21.fuentes;

public class Visita
{
	private int mes;
	private Comercial comercial;
	private Empresa empresa;

	public Visita(Comercial comercial, Empresa empresa, int mes)
	{
		this.comercial = comercial;
		this.empresa = empresa;
		this.mes = mes;
	}

	public int getMes()
	{
		return mes;
	}

	public void setMes(int mes)
	{
		this.mes = mes;
	}

	public Comercial getComercial()
	{
		return comercial;
	}

	public void setComercial(Comercial comercial)
	{
		this.comercial = comercial;
	}

	public Empresa getEmpresa()
	{
		return empresa;
	}

	public void setEmpresa(Empresa empresa)
	{
		this.empresa = empresa;
	}

	@Override
	public String toString()
	{
		return comercial + " visitó "+ empresa + " el mes de " + mes;
	}



}
