package Primero.SegundoTrimestre.Practica.POO.ControlPOO_21_22.fuentes;
import java.util.Arrays;

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

	public long totalCargaDeProducto(int numTren, String descripcion)
	{
		long total = 0;
		for(Tren t:this.trenes)
			if(t.getNumero() == numTren)
				for(Vagon v:t.getVagones())
					for(Carga c:v.getCargas())
						if(c.getDescripcion().equals(descripcion))
							total += c.getKilos();

		return total;
	}

	public Tren[] trenesConducidosPor(String nombreMaquinista)
	{
		Tren[] tablaADevolver;
		tablaADevolver = new Tren[0];

		for(Tren t:this.trenes)
			if(t.getMaquinista().getNombre().equals(nombreMaquinista))
			//añadirlo a la tabla
			{
				tablaADevolver =
						Arrays.copyOf(tablaADevolver, tablaADevolver.length+1);
				tablaADevolver[tablaADevolver.length-1]=t;
			}

		return tablaADevolver;
	}


	public int numMaquinistasConducenAlMenos(int numTrenes)
	{
		int numMaquinistas=0;

		for(Maquinista m:this.maquinistas)
		{
			int numConducidosPorM = 0;
			for(Tren t:this.trenes)
				if(t.getMaquinista().getNombre().equals(m.getNombre()))
					numConducidosPorM++;
			if(numConducidosPorM >= numTrenes)
				numMaquinistas++;
		}

		return numMaquinistas;
	}

	public boolean hayProblemas()
	{
		for(Tren t:this.trenes)
		{
			long sumaCargas = 0;
			for(Vagon v:t.getVagones())
				for(Carga c:v.cargas)
					sumaCargas+=c.getKilos();
			if(sumaCargas > t.getLocomotora().getKgsCargaMax())
				return true;
		}

		return false;
	}


	public void eliminaVagonesConCargaDelTren(String descripcionCarga, int numTren)
	{
		Tren ficticio = new Tren(0,null,null);

		for(Tren t:this.trenes)
		{
			if(t.getNumero() == numTren)
			{
				for(Vagon v:t.getVagones())
				{
					boolean eliminarVagon = false;
					for(Carga c:v.getCargas())
						if(c.getDescripcion().equals(descripcionCarga))
							eliminarVagon = true;
					if(eliminarVagon == false)
						ficticio.anadeVagon(v);
				}
				t.setVagones(ficticio.getVagones());
			}
		}
	}

	public Locomotora[] locomotorasQuePuedenLlevar(Vagon[] vagones)
	{
		long totalCarga=0;

		for(Vagon v:vagones)
			for(Carga c:v.getCargas())
				totalCarga += c.getKilos();

		LineaFerrea ficticia = new LineaFerrea();

		for(Locomotora l:this.locomotoras)
			if(l.getKgsCargaMax() >= totalCarga)
				ficticia.anadeLocomotora(l);

		return ficticia.locomotoras;
	}

}
