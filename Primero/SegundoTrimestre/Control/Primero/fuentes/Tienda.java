package Primero.SegundoTrimestre.Control.Primero.fuentes;
import java.util.Arrays;

public class Tienda
{
	private Clienta tClientas[];
	private Vendedora tVendedoras[];
	private Prenda tPrendas[];
	private Venta tVentas[];

	// EJ.1
	public float totalComprasPorClienta(Clienta clienta)
	{
		float dineroTotalCompras = 0;

		for (Venta venta : tVentas) {
			if ( venta.getClienta().equals(clienta)) {
				Prenda prenda = venta.getPrenda();
				dineroTotalCompras += prenda.getPrecio() * venta.getCantidad();
			}
		}
		return dineroTotalCompras;
	}

	// EJ.2
	public Clienta[] clientasPremium(float minimo)
	{
		Clienta[] clientas = new Clienta[0];

		boolean sold = false;
		float importePorClienta = 0;

		for (int i = 0; i < tVentas.length && !sold; i++) {
			Venta venta = tVentas[i];
			Prenda prendaVendida = venta.getPrenda();

			if (venta.getClienta().equals(clientas)) {
				importePorClienta += venta.getPrenda().getPrecio() * venta.getCantidad();
			}
		}
/*
		if (importePorClienta > minimo) {
			Clienta[] clientaPremiumNueva = Arrays.copyOf(clientas, clientas.length + 1);
			Clienta clientasNuevas = clientaPremiumNueva[clientas.length];
		}
*/
		return clientas;  // No funciona :(
	}



	// EJ.3
	public float totalVentas(Fecha desde, Fecha hasta)
	{
		float importeTotal = 0;

		for (Venta venta : tVentas) {
			Fecha fechaVenta = venta.getFecha();

			if (fechaVenta.compareTo(desde) >= 0 && fechaVenta.compareTo(hasta) <= 0) {
				Prenda prenda = venta.getPrenda();
				importeTotal += prenda.getPrecio() * venta.getCantidad();
			}
		}

		return importeTotal;
	}

	// EJ.4
	public Vendedora vendedoraDelMes(int mes) 
	{
		Vendedora mejorVendedoraDelMes = null;

		float mejorImporteDelMes = 0;

		for (Vendedora vendedora : tVendedoras) {
			float importeVendedoraMes = totalComprasPorVendedoraYMes(vendedora, mes);

			if (importeVendedoraMes > mejorImporteDelMes) {
				mejorVendedoraDelMes = vendedora;
				mejorImporteDelMes = importeVendedoraMes;
			}
		}
		return mejorVendedoraDelMes;
	}

	public float totalComprasPorVendedoraYMes(Vendedora vendedora, int mes)
	{
		int totalVentasMes = 0;

		for (Venta venta : tVentas) {
			if (venta.getVendedora().equals(vendedora)) {
				int ventaMes = venta.getFecha().getMes();

				if (ventaMes == mes) {
					totalVentasMes += (int) venta.getPrenda().getPrecio() * venta.getCantidad();
				}
			}
		}
		return totalVentasMes;
	}

	// EJ.5
	public Prenda[] paraRebajas()
	{
		Prenda[] prenda = new Prenda[0];
		Prenda[] rebajas = new Prenda[0];
		Prenda[] rebajasNuevas = new Prenda[0];

		boolean vendida = false;

		for (int i = 0; i < tVentas.length && !vendida; i++) {
				Venta venta = tVentas[i];
				Prenda prendaVendida = venta.getPrenda();

				if (prenda.equals(prendaVendida)) {
					vendida = true;
				}
			}

		if (!vendida) {
		rebajasNuevas = Arrays.copyOf(rebajas, rebajas.length + 1);
		}

		return rebajasNuevas; // No funciona :(
	}
	
	
	public Tienda()
	{
		this.tClientas = new Clienta[0];
		this.tPrendas = new Prenda[0];
		this.tVentas = new Venta[0];
		this.tVendedoras = new Vendedora[0];
	}

	public void anadeClienta(Clienta clienta)
	{
		Clienta[] tNueva = Arrays.copyOf(tClientas, tClientas.length+1);
		tNueva[tClientas.length] = clienta;
		this.tClientas = tNueva;
	}

	public void anadePrenda(Prenda prenda)
	{
		Prenda[] tNueva = Arrays.copyOf(tPrendas, tPrendas.length+1);
		tNueva[tPrendas.length] = prenda;
		this.tPrendas = tNueva;
	}

	public void anadeVenta(Venta venta)
	{
		Venta[] tNueva = Arrays.copyOf(tVentas, tVentas.length+1);
		tNueva[tVentas.length] = venta;
		this.tVentas = tNueva;
	}

	public void anadeVendedora(Vendedora vendedora)
	{
		Vendedora[] tNueva = Arrays.copyOf(tVendedoras, tVendedoras.length+1);
		tNueva[tVendedoras.length] = vendedora;
		this.tVendedoras = tNueva;
	}

	public Clienta[] gettClientas()
	{
		return tClientas;
	}

	public Vendedora[] gettVendedoras()
	{
		return tVendedoras;
	}

	public Prenda[] gettPrendas()
	{
		return tPrendas;
	}

	public Venta[] gettVentas()
	{
		return tVentas;
	}




}
