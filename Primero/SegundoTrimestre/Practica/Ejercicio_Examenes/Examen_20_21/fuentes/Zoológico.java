package Primero.SegundoTrimestre.Practica.Ejercicio_Examenes.Examen_20_21.fuentes;
public class Zoológico
{
	private Mamífero tMamíferos[];
	private Veterinario tVeterinarios[];

	public Zoológico()
	{
		this.tVeterinarios = new Veterinario[0];
		this.tMamíferos = new Mamífero[0];
	}

	public Mamífero[] gettMamíferos()
	{
		return tMamíferos;
	}

	public Veterinario[] gettVeterinarios()
	{
		return tVeterinarios;
	}

	public void añadeVeterinario(Veterinario veterinario)
	{
		Veterinario tNueva[] = new Veterinario[this.tVeterinarios.length+1];
		for(int i=0;i<this.tVeterinarios.length;i++)
			tNueva[i] = this.tVeterinarios[i];
		tNueva[this.tVeterinarios.length] = veterinario;
		this.tVeterinarios = tNueva;
	}

	public void añadeMamífero(Mamífero mamífero)
	{
		Mamífero tNueva[] = new Mamífero[this.tMamíferos.length+1];
		for(int i=0;i<this.tMamíferos.length;i++)
			tNueva[i] = this.tMamíferos[i];
		tNueva[this.tMamíferos.length] = mamífero;
		this.tMamíferos = tNueva;
	}

	public Mamífero[] getMamíferosEntreFechas(Fecha inicio, Fecha fin)
	{
		return null;
	}

	public int getNVeterinariosMasDe(int minNumNacimientos)
	{
		return 0;
	}

	public boolean veterinarioPadresEHijo()
	{
		return false;
	}

	public boolean hayErroresEnFechas()
	{
		return false;
	}
}
