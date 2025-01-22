package Primero.SegundoTrimestre.Practica.Ejercicio_Examenes.Examen_20_21.fuentes;
public abstract class SerVivo
{
	protected String nombre;

	public abstract String toString();

	public SerVivo(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		SerVivo other = (SerVivo) obj;
		if (nombre == null)
		{
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}



}
