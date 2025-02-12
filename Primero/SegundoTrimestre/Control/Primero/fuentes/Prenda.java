package Primero.SegundoTrimestre.Control.Primero.fuentes;
public class Prenda
{
	private float precio;
	private String familia;
	private String talla;
	private String denominacion;

	public Prenda(float precio, String familia, String talla, String denominacion)
	{
		this.precio = precio;
		this.familia = familia;
		this.talla = talla;
		this.denominacion = denominacion;
	}

	public float getPrecio()
	{
		return precio;
	}

	public void setPrecio(float precio)
	{
		this.precio = precio;
	}

	public String getFamilia()
	{
		return familia;
	}

	public void setFamilia(String familia)
	{
		this.familia = familia;
	}

	public String getTalla()
	{
		return talla;
	}

	public void setTalla(String talla)
	{
		this.talla = talla;
	}

	public String getDenominacion()
	{
		return denominacion;
	}

	public void setDenominacion(String denominacion)
	{
		this.denominacion = denominacion;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((denominacion == null) ? 0 : denominacion.hashCode());
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
		Prenda other = (Prenda) obj;
		if (denominacion == null)
		{
			if (other.denominacion != null)
				return false;
		} else if (!denominacion.equals(other.denominacion))
			return false;
		return true;
	}

	public String toString()
	{
      return this.denominacion+"("+this.talla+")";
	}
}
