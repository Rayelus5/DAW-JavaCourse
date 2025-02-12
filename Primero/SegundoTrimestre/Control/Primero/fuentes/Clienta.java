package Primero.SegundoTrimestre.Control.Primero.fuentes;

public class Clienta extends Persona
{
    private long dni;
	public Clienta(String nombre, long dni)
	{
		super(nombre);
		this.dni =dni;
	}
	
	@Override
	protected String getId()
	{
		return Long.toString(this.dni);
	}

	public long getDni()
	{
		return dni;
	}

	public void setDni(long dni)
	{
		this.dni = dni;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (dni ^ (dni >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clienta other = (Clienta) obj;
		if (dni != other.dni)
			return false;
		return true;
	}

	public String toString()
	{
		return this.nombre;
	}

}
