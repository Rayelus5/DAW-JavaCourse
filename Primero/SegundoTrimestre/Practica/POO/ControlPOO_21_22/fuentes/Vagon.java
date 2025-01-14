package Primero.SegundoTrimestre.Practica.POO.ControlPOO_21_22.fuentes;
import java.util.Arrays;

public class Vagon
{
	int identificador;
	Carga cargas[];

	public Vagon(int identificador)
	{
		this.identificador = identificador;
		this.cargas = new Carga[0];
	}

	public void anadeCarga(Carga carga)
	{
		this.cargas = Arrays.copyOf(this.cargas, this.cargas.length+1);
		this.cargas[this.cargas.length-1]=carga;
	}

	@Override
	public String toString()
	{
		String res =  "Num vagon: "+ identificador+"  Cargas: (";
		for(Carga c:this.cargas)
			res+= c+", ";
		if(!res.isEmpty())
			res=res.substring(0, res.length()-2);
		return res+")\n";
	}

	public int getIdentificador()
	{
		return identificador;
	}

	public void setIdentificador(int identificador)
	{
		this.identificador = identificador;
	}

	public Carga[] getCargas()
	{
		return cargas;
	}

	public void setCargas(Carga[] cargas)
	{
		this.cargas = cargas;
	}

	
	
}
