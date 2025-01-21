package Primero.SegundoTrimestre.Practica.Ejercicio_Examenes.Examen_22_23.fuentes;
import java.util.Arrays;

public class Clase
{
	private String nombre;
	private Definicion tAtribs[];
	private Metodo tMetodos[]; 

	public Clase(String nombre)
	{
		this.nombre = nombre;
		this.tAtribs = new Definicion[0];
		this.tMetodos = new Metodo[0];	
	}
	
		
	public Metodo[] gettMetodos()
	{
		return tMetodos;
	}


	public void anadeAtributo(Definicion atributo)
	{
		Definicion[] tNueva = Arrays.copyOf(tAtribs, tAtribs.length+1);
		tNueva[tAtribs.length] = atributo;
		this.tAtribs = tNueva;
	}
	
	public void anadeMetodo(Metodo metodo)
	{
		Metodo[] tNueva = Arrays.copyOf(tMetodos, tMetodos.length+1);
		tNueva[tMetodos.length] = metodo;
		this.tMetodos = tNueva;
	}
	
	public boolean tieneMetodosDuplicados()
	{
		return true;		
	}
	
	public boolean esMasCompleja(int complejidadMin)
	{
	 return true;
	}
	
	public Metodo[] getMetodosQueUsan(String tipo)
	{
		return null;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Clase other = (Clase) obj;
		if (nombre == null)
		{
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String toString()
	{
		String res="";
		res += "public class "+this.nombre+"\n";
		res+="  //ATRIBUTOS\n";
		for(Definicion atr:this.tAtribs)
			res+= "  private "+atr+";\n";
		res+="  //METODOS\n";
		for(Metodo met:this.tMetodos)
			res+= "  public "+met+";\n";
		
		return res;
	}
	
	public Definicion[] gettAtribs()
	{
		return tAtribs;
	}


	public void settAtribs(Definicion[] tAtribs)
	{
		this.tAtribs = tAtribs;
	}


	public void settMetodos(Metodo[] tMetodos)
	{
		this.tMetodos = tMetodos;
	}
	
	
	
}
