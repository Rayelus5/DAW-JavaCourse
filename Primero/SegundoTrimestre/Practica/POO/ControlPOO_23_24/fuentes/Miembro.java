package Primero.SegundoTrimestre.Practica.POO.ControlPOO_23_24.fuentes;
import java.util.Arrays;

public class Miembro
{
	private String nombre;
	private int edad;
	private Relacion tRelaciones[];

	public Miembro(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.tRelaciones = new Relacion[0];
	}

	public void anadeRelacion(Miembro otro, Fecha fIni, Fecha fFin)
	{
		Relacion[] tNueva = Arrays.copyOf(tRelaciones, tRelaciones.length+1);
		tNueva[tRelaciones.length] = new Relacion(otro,fIni,fFin);
		this.tRelaciones = tNueva;
	}

	public Relacion[] gettRelaciones()
	{
		return tRelaciones;
	}

	public void settRelaciones(Relacion[] tRelaciones)
	{
		this.tRelaciones = tRelaciones;
	}

	public String getNombre()
	{
		return nombre;
	}


	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}


	public int getEdad()
	{
		return edad;
	}


	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public boolean esInfiel()
	{
		return false;
	}

	public boolean haSidoTraicionado()
	{
		return false;
	}

	public boolean haTenidoComoParejaA(Miembro otro)
	{
		return false;
	}

	public boolean esSugar()
	{
		return false;
	}

	public Miembro parejaMasPromiscua()
	{
		return new Miembro("", 20);
	}

	public int compareTo(Miembro otro)
	{
		return 0;
	}

}
