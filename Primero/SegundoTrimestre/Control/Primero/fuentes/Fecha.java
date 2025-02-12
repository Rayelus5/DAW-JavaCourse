package Primero.SegundoTrimestre.Control.Primero.fuentes;

public class Fecha
{
	private int día;
	private int mes;
	private int año;

	public Fecha(int día, int mes, int año)
	{
		this.día = día;
		this.mes = mes;
		this.año = año;
	}

	public int getDía()
	{
		return día;
	}

	public void setDía(int día)
	{
		this.día = día;
	}

	public int getMes()
	{
		return mes;
	}

	public void setMes(int mes)
	{
		this.mes = mes;
	}

	public int getAño()
	{
		return año;
	}

	public void setAño(int año)
	{
		this.año = año;
	}

	@Override
	public String toString()
	{
		return ""+this.día+"/"+this.mes+"/"+this.año;
	}



	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + año;
		result = prime * result + día;
		result = prime * result + mes;
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
		Fecha other = (Fecha) obj;
		if (año != other.año)
			return false;
		if (día != other.día)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	public int compareTo(Fecha otra)
	{
		int res = this.año - otra.año;

		if(res == 0)
			res = this.mes - otra.mes;
		if(res == 0)
			res = this.día - otra.día;

		return res;
	}



}
