package Primero.SegundoTrimestre.Control.Primero.fuentes;
public abstract class Persona
{
	protected String nombre;

	public Persona(String nombre)
	{
		this.nombre=nombre;
	}

	protected abstract String getId();

	public String toString()
	{
		return "Nombre: "+this.nombre+" - "+this.getId();
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}


}
