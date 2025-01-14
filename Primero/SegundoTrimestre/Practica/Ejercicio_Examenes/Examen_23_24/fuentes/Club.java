package Primero.SegundoTrimestre.Practica.Ejercicio_Examenes.Examen_23_24.fuentes;
import java.util.Arrays;

public class Club
{
	private Miembro tMiembros[];

	public Club()
	{
		this.tMiembros = new Miembro[0];
	}

	public void anadeMiembro(Miembro miembro)
	{
		Miembro[] tNueva = Arrays.copyOf(tMiembros, tMiembros.length+1);
		tNueva[tMiembros.length] = miembro;
		this.tMiembros = tNueva;
	}

	public Miembro[] gettMiembros()
	{
		return tMiembros;
	}

	public void settMiembros(Miembro[] tMiembros)
	{
		this.tMiembros = tMiembros;
	}


	public String toString()
	{
		String res="Miembros:\n";

		for(Miembro m:this.tMiembros)
		{
			res+=m.getNombre()+"("+m.getEdad()+")"+" tuvo relaciones con:\n";
			for(Relacion r:m.gettRelaciones())
				res+="   "
			+r.getPareja().getNombre()+"("+r.getPareja().getEdad()+")"+" del "+r.getfIni()+" al "+r.getfFin()+"\n";
			res+="\n";

		}

		return res;
	}


}
