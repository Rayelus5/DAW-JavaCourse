package Primero.SegundoTrimestre.Practica.Ejercicio_Examenes.Examen_22_23.fuentes;
import java.util.Arrays;

public class Metodo
{
	private String nombre;
	private String tipoDevuelto;
	private int complejidad;
	private Definicion tParametros[];
	
	public Metodo(String tipoDevuelto, String nombre, int complejidad)
	{
		this.tipoDevuelto = tipoDevuelto;
		this.nombre = nombre;
		this.tParametros = new Definicion[0];
		this.complejidad = complejidad;
	}

	public void anadeParametro(Definicion parametro)
	{
		Definicion[] tNueva = Arrays.copyOf(this.tParametros, this.tParametros.length+1);
		tNueva[tParametros.length] = parametro;
		this.tParametros = tNueva;
	}
	
	
	public boolean igualesParametros(Metodo otro)
	{
		return true;	
	}

	public String getNombre()
	{
		return nombre;
	}

	public boolean equals(Object otro)
	{
        return false;			
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String toString()
	{
		String res=this.tipoDevuelto+" "+this.nombre+" (";
		for(Definicion par:this.tParametros)
			res+=par.getTipo()+" "+par.getNombre()+", ";
		if(res.endsWith(", "))
	    	res = res.substring(0,res.length()-2);
		res+=")";
		res += " - compejidad: "+this.complejidad;
		
		return res;
	}

	public int getComplejidad()
	{
		return complejidad;
	}

	public Definicion[] gettParametros()
	{
		return tParametros;
	}
	
}
