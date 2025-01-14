package Primero.SegundoTrimestre.Practica.POO.ControlPOO_21_22.fuentes;
public class LineaFerrea
{
	Tren[] trenes;
	Locomotora[] locomotoras;
	Vagon[] vagones;
	Maquinista[] maquinistas;

	public LineaFerrea()
	{
		this.trenes = new Tren[0];
		this.locomotoras = new Locomotora[0];
		this.vagones = new Vagon[0];
		this.maquinistas = new Maquinista[0];
	}

	public void anadeTren(Tren tren)
	{
		Tren tNueva[] = new Tren[this.trenes.length+1];
		for(int i=0;i<this.trenes.length;i++)
			tNueva[i] = this.trenes[i];
		tNueva[this.trenes.length] = tren;
		this.trenes = tNueva;
	}

	public void anadeLocomotora(Locomotora locomotora)
	{
		Locomotora tNueva[] = new Locomotora[this.locomotoras.length+1];
		for(int i=0;i<this.locomotoras.length;i++)
			tNueva[i] = this.locomotoras[i];
		tNueva[this.locomotoras.length] = locomotora;
		this.locomotoras = tNueva;
	}

	public void anadeVagon(Vagon vagon)
	{
		Vagon tNueva[] = new Vagon[this.vagones.length+1];
		for(int i=0;i<this.vagones.length;i++)
			tNueva[i] = this.vagones[i];
		tNueva[this.vagones.length] = vagon;
		this.vagones = tNueva;
	}

	public void anadeMaquinista(Maquinista maquinista)
	{
		Maquinista tNueva[] = new Maquinista[this.maquinistas.length+1];
		for(int i=0;i<this.maquinistas.length;i++)
			tNueva[i] = this.maquinistas[i];
		tNueva[this.maquinistas.length] = maquinista;
		this.maquinistas = tNueva;
	}

	public long totalCargaDeProducto(int numTren, String descripcion) {
		long total = 0;

		return total;
	}

	public Tren[] trenesConducidosPor(String nombreMaquinista)
	{
		return new Tren[0];
	}
	
	
	public int numMaquinistasConducenAlMenos(int numTrenes)
	{
		return 0;
	}

	public boolean hayProblemas() {
		for(Tren t:this.trenes) {
			long sumaCargas = 0;

			for (Vagon v:t.getVagones()) {
				for (Carga c:v.cargas) {
					sumaCargas += c.getKilos();
				}
			}
			if (sumaCargas > t.getLocomotora().getKgsCargaMax())
				return true;
		}
		return false;
	}


	public void eliminaVagonesConCargaDelTren(String descripcionCarga, int numTren)
	{
	}

	public Locomotora[] locomotorasQuePuedenLlevar(Vagon[] vagones)
	{
    return new Locomotora[0];
	}

}
