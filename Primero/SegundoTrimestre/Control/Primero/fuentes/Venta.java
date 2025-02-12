package Primero.SegundoTrimestre.Control.Primero.fuentes;
public class Venta
{
	private Clienta clienta;
	private Vendedora vendedora;
	private Prenda prenda;
	private Fecha fecha;
	private int cantidad;

	public Venta(Clienta clienta, Vendedora vendedora, Prenda prenda, Fecha fecha, int cantidad)
	{
		this.clienta = clienta;
		this.vendedora = vendedora;
		this.prenda = prenda;
		this.fecha = fecha;
		this.cantidad = cantidad;
	}

	public Clienta getClienta()
	{
		return clienta;
	}

	public void setClienta(Clienta clienta)
	{
		this.clienta = clienta;
	}

	public Vendedora getVendedora()
	{
		return vendedora;
	}

	public void setVendedora(Vendedora vendedora)
	{
		this.vendedora = vendedora;
	}

	public Prenda getPrenda()
	{
		return prenda;
	}

	public void setPrenda(Prenda prenda)
	{
		this.prenda = prenda;
	}

	public Fecha getFecha()
	{
		return fecha;
	}

	public void setFecha(Fecha fecha)
	{
		this.fecha = fecha;
	}

	public int getCantidad()
	{
		return cantidad;
	}

	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
	}



}
