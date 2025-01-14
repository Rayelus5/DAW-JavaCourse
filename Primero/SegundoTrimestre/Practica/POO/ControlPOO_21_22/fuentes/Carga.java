package Primero.SegundoTrimestre.Practica.POO.ControlPOO_21_22.fuentes;
public class Carga
{
	private String descripcion;
	private long kilos;

	public Carga(String descripcion, long kilos)
	{
		this.descripcion = descripcion;
		this.kilos = kilos;
	}

	@Override
	public String toString()
	{
		return descripcion +": "+ kilos +"K";
	}

	public String getDescripcion()
	{
		return descripcion;
	}

	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}

	public long getKilos()
	{
		return kilos;
	}

	public void setKilos(long kilos)
	{
		this.kilos = kilos;
	}
	

	

}
