package Primero.SegundoTrimestre.Practica.Ejercicio_Examenes.Examen_20_21.fuentes;
public class Mamífero extends SerVivo
{
	private Mamífero padre;
	private Mamífero madre;
	private Fecha díaNacimiento;
	private Veterinario asistente;

	public Mamífero(String nombre, Mamífero padre, Mamífero madre,
					Fecha díaNacimiento, Veterinario asistente)
	{
		super(nombre);
		this.padre = padre;
		this.madre = madre;
		this.díaNacimiento = díaNacimiento;
		this.asistente = asistente;
	}

	// LOS GETTERS ESTÁN PREPARADOS PARA QUE NO SE PRODUZCAN EXCEPCIONES SI UN MAMÍFERO
	// NO TIENE PADRES, FECHA DE NACIMIENTO O VETERINARIO ASISTENTE


	public Mamífero getPadre()
	{
		if(this.padre == null)
			return new Mamífero(null,null,null,null,null);
		return padre;
	}

	public Mamífero getMadre()
	{
		if(this.madre == null)
			return new Mamífero(null,null,null,null,null);
		return madre;
	}

	public Fecha getDíaNacimiento()
	{
		if(this.díaNacimiento == null)
			return new Fecha(0,0,0);
		return díaNacimiento;
	}

	public Veterinario getAsistente()
	{
		if(this.asistente == null)
			return new Veterinario("");
		return asistente;
	}

	@Override
	public String toString()
	{
		String res="";

		res+= "Nombre: "+this.nombre+" ";
		if(this.padre != null)
		{
			res+= "nació de "+this.padre.nombre+" y de "+this.madre.nombre+" ";
			res+= "el día "+this.díaNacimiento+" ";
			res+= "veterinario asistente: "+this.asistente.getNombre();
		}
		return res;
	}

}
