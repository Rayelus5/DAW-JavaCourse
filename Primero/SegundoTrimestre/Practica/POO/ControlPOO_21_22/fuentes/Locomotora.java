package Primero.SegundoTrimestre.Practica.POO.ControlPOO_21_22.fuentes;
public class Locomotora
{
	private int potencia;
	private long kgsCargaMax;
	
	
	public Locomotora(int potencia, long kgsCargaMax)
	{
		this.potencia = potencia;
		this.kgsCargaMax = kgsCargaMax;
	}


	@Override
	public String toString()
	{
		return "Potencia: " + potencia + " HP" +"  Carga Maxima: " + this.kgsCargaMax+" Kgs.";
	}


	public int getPotencia()
	{
		return potencia;
	}


	public void setPotencia(int potencia)
	{
		this.potencia = potencia;
	}


	public long getKgsCargaMax()
	{
		return kgsCargaMax;
	}


	public void setKgsCargaMax(long kgsCargaMax)
	{
		this.kgsCargaMax = kgsCargaMax;
	}

	
	
}
