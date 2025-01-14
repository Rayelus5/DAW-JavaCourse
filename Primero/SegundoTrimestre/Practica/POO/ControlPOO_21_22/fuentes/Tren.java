package Primero.SegundoTrimestre.Practica.POO.ControlPOO_21_22.fuentes;
import java.util.Arrays;

public class Tren
{
	private int numero;
	private Locomotora locomotora;
	private Maquinista maquinista;
	private Vagon vagones[];
	
	public Tren(int num, Locomotora locomotora, Maquinista maquinista)
	{
		this.numero =num;
		this.vagones = new Vagon[0];
		this.locomotora = locomotora;
		this.maquinista = maquinista;
	}

	public void anadeVagon(Vagon vagon)
	{
		this.vagones = Arrays.copyOf(this.vagones, this.vagones.length+1);
		this.vagones[this.vagones.length-1]=vagon;
	}


	@Override
	public String toString()
	{
		String res = "Tren num: "+this.numero+"  Maquinista: "+ maquinista+"\n"+"  Locomotora: " + locomotora +
	                 "\n  Vagones:\n";
				
	    for(Vagon v:this.vagones)       
		   res+="   "+v;
		return res;		
	}

	public Vagon[] getVagones()
	{
		return vagones;
	}

	public int getNumero()
	{
		return numero;
	}

	public void setNumero(int numero)
	{
		this.numero = numero;
	}

	public Locomotora getLocomotora()
	{
		return locomotora;
	}

	public void setLocomotora(Locomotora locomotora)
	{
		this.locomotora = locomotora;
	}

	public Maquinista getMaquinista()
	{
		return maquinista;
	}

	public void setMaquinista(Maquinista maquinista)
	{
		this.maquinista = maquinista;
	}

	public void setVagones(Vagon[] vagones)
	{
		this.vagones = vagones;
	}
	
	
}
