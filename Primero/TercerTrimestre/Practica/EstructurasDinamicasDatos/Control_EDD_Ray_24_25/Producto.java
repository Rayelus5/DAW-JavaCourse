package Primero.TercerTrimestre.Practica.EstructurasDinamicasDatos.Control_EDD_Ray_24_25;

public class Producto {
	private String id;
	private String nombre;
	private String categoria;
	private double precio;

	public Producto(String id, String nombre, String categoria, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio=precio;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCategoria() {
		return categoria;
	}
	public double getPrecio() {
		return precio;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Producto producto = (Producto) o;
		return id.equals(producto.id);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public String toString() {
		return "Producto{" +
				"id='" + id + '\'' +
				", nombre='" + nombre + '\'' +
				", categoria='" + categoria + '\'' +
				", precio=" + precio +
				'}';
	}



}
