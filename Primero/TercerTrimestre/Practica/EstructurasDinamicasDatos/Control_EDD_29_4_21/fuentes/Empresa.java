package Primero.TercerTrimestre.Practica.EstructurasDinamicasDatos.Control_EDD_29_4_21.fuentes;

import java.util.Objects;

public class Empresa
{
	private String nombre;
	private float compras;
	public Empresa(String nombre, float compras)
	{
		super();
		this.nombre = nombre;
		this.compras = compras;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public float getCompras()
	{
		return compras;
	}
	public void setCompras(float compras)
	{
		this.compras = compras;
	}

	@Override
	public String toString()
	{
		return  nombre ;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Empresa empresa = (Empresa) o;
		return Objects.equals(nombre, empresa.nombre);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(nombre);
	}


	public int compareTo(Empresa otro) {
		return this.nombre.compareTo(otro.nombre);
	}
}
