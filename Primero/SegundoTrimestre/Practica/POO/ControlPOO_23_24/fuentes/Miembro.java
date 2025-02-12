package Primero.SegundoTrimestre.Practica.POO.ControlPOO_23_24.fuentes;
import java.util.Arrays;

public class Miembro
{
	private String nombre;
	private int edad;
	private Relacion tRelaciones[];

	public Miembro(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.tRelaciones = new Relacion[0];
	}

	public void anadeRelacion(Miembro otro, Fecha fIni, Fecha fFin)
	{
		Relacion[] tNueva = Arrays.copyOf(tRelaciones, tRelaciones.length+1);
		tNueva[tRelaciones.length] = new Relacion(otro,fIni,fFin);
		this.tRelaciones = tNueva;
	}

	public Relacion[] gettRelaciones()
	{
		return tRelaciones;
	}

	public void settRelaciones(Relacion[] tRelaciones)
	{
		this.tRelaciones = tRelaciones;
	}

	public String getNombre()
	{
		return nombre;
	}


	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}


	public int getEdad()
	{
		return edad;
	}


	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public boolean esInfiel()
	{
		for(int i=0;i<this.tRelaciones.length-1;i++)
			for(int j=i+1;j<this.tRelaciones.length;j++)
				if(!(this.tRelaciones[i].getfIni().compareTo(this.tRelaciones[j].getfFin())>0
						||
						this.tRelaciones[j].getfIni().compareTo(this.tRelaciones[i].getfFin())>0	))

					return true;


		return false;
	}

	public boolean haSidoTraicionado()
	{
		for(Relacion r1:this.tRelaciones)
			for(Relacion r2:r1.getPareja().tRelaciones)
				if(!(r1.getfIni().compareTo(r2.getfFin())>0
						||
						r2.getfIni().compareTo(r1.getfFin())>0)
						&&
						r2.getPareja()!=this)
					return true;


		return false;
	}



	public boolean equals(Object otro)
	{
		Miembro pareja = (Miembro)otro;
		return this.nombre.equals(pareja.nombre);
	}

	public boolean haTenidoComoParejaA(Miembro otro)
	{
		for(Relacion r:this.tRelaciones)
			if (r.getPareja().equals(otro))
				return true;

		return false;
	}

	public boolean esSugar()
	{
		for(Relacion r:this.tRelaciones)
			if(this.edad>r.getPareja().edad+10)
				return true;
		return false;
	}

	public Miembro parejaMasPromiscua()
	{
		Miembro promis = new Miembro("", 20);

		for(Relacion r:this.tRelaciones)
			if(r.getPareja().gettRelaciones().length > promis.gettRelaciones().length)
				promis = r.getPareja();

		return promis;
	}

	public int compareTo(Miembro otro)
	{
		int res = this.tRelaciones.length - otro.tRelaciones.length;
		if(res == 0)
		{
			Relacion x = this.tRelaciones[0];
			for(Relacion r:this.tRelaciones)
				if(r.getfIni().compareTo(x.getfIni())<0)
					x = r;

			Relacion y = otro.tRelaciones[0];
			for(Relacion r:otro.tRelaciones)
				if(r.getfIni().compareTo(y.getfIni())<0)
					y = r;

			res = x.getfIni().compareTo(y.getfIni());
		}
		return res;
	}

}
