package Primero.SegundoTrimestre.Control.Primero.fuentes;
public class Vendedora extends Persona
{
    private String nss;
    
	public Vendedora(String nombre,String id)
	{
		super(nombre);
		this.nss = id;
	}

	@Override
	protected String getId()
	{
		return this.nss;
	}

	public String getNss()
	{
		return nss;
	}

	public void setNss(String nss)
	{
		this.nss = nss;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nss == null) ? 0 : nss.hashCode());
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
		Vendedora other = (Vendedora) obj;
		if (nss == null)
		{
			if (other.nss != null)
				return false;
		} else if (!nss.equals(other.nss))
			return false;
		return true;
	}

	public String toString()
	{
		return this.nombre + " - "+this.nss;
	}
	
}
