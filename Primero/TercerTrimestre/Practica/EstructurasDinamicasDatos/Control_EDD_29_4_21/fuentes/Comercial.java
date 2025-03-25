package Primero.TercerTrimestre.Practica.EstructurasDinamicasDatos.Control_EDD_29_4_21.fuentes;

import java.util.Objects;

public class Comercial
{
	private String nombre;
	private float ventas;
	
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public float getVentas()
	{
		return ventas;
	}
	public void setVentas(float ventas)
	{
		this.ventas = ventas;
	}
	public Comercial(String nombre, float ventas)
	{
		super();
		this.nombre = nombre;
		this.ventas = ventas;
	}

	@Override
	public String toString()
	{
		return nombre;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Comercial comercial = (Comercial) o;
		return Objects.equals(nombre, comercial.nombre);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(nombre);
	}

	public int compareTo(Comercial otro) {
		return this.nombre.compareTo(otro.nombre);
	}
}

