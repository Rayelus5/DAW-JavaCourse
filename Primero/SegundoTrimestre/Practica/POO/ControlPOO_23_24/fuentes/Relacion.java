package Primero.SegundoTrimestre.Practica.POO.ControlPOO_23_24.fuentes;
public class Relacion
{
    private Miembro pareja;
    private Fecha fIni;
    private Fecha fFin;
    
	public Relacion(Miembro pareja, Fecha fIni, Fecha fFin)
	{
		this.pareja = pareja;
		this.fIni = fIni;
		this.fFin = fFin;
	}

	public Miembro getPareja()
	{
		return pareja;
	}

	public void setPareja(Miembro pareja)
	{
		this.pareja = pareja;
	}

	public Fecha getfIni()
	{
		return fIni;
	}

	public void setfIni(Fecha fIni)
	{
		this.fIni = fIni;
	}

	public Fecha getfFin()
	{
		return fFin;
	}

	public void setfFin(Fecha fFin)
	{
		this.fFin = fFin;
	}


    
}
