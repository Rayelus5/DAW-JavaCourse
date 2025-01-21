package Primero.SegundoTrimestre.Practica.Ejercicio_Examenes.Examen_22_23.fuentes;
import java.util.Arrays;

public class Proyecto
{
	private String nombre; 
	private Clase tClases[];

	public Proyecto(String nombre)
	{
		this.nombre = nombre;
		this.tClases = new Clase[0];
	}

	public void anadeClase(Clase clase)
	{
		Clase[] tNueva = Arrays.copyOf(tClases, tClases.length+1);
		tNueva[tClases.length] = clase;
		this.tClases = tNueva;
	}

	public Clase getClase(String nombre)
	{
		for(Clase c:this.tClases)
			if(c.getNombre().equals(nombre))
				return c;
		return null;
	}

	public boolean hayClasesConMetodosDuplicados()
	{
		for(Clase c:this.tClases)
			if(c.tieneMetodosDuplicados())
				return true;
		return false;
	}

	public Clase[] gettClases()
	{
		return tClases;
	}

	public Clase[] getTablaClasesComplejas(int complejidadMin)
	{
		Proyecto p = new Proyecto("Inutil");
		for(Clase c:this.tClases)
			if(c.esMasCompleja(complejidadMin))
				p.anadeClase(c);
		return p.gettClases();
	}

	
	public String toString()
	{
		String res="";
		res += "Proyecto: "+this.nombre+"\n";
		res += "=======================\n";
		res+="\n";
		for(Clase c:this.tClases)
			res+= c+"\n";
		
		return res;
	}
	
	
	
}
