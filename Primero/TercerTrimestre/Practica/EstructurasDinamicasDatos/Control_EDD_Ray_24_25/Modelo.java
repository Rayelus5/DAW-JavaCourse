package Primero.TercerTrimestre.Practica.EstructurasDinamicasDatos.Control_EDD_Ray_24_25;

import java.util.*;

/********RAIMUNDO PALMA MÉNDEZ - CONTROL 24-25 EDD*********/

//Principal.java no era necesario modificarlo.

@SuppressWarnings("all") // Esto es para quitar todos los warnings o avisos que de el IDE

public class Modelo extends HashMap<Producto, HashMap<String, String>> {

	//extiende a HashMap<Producto, HashMap<String, String>>

	public String obtenerAtributo(Producto producto, String atributo)
	// Devuelve el valor de un atributo específico para un producto dado.
	//Si no existe el producto o no existe el atributo devuelve null.
	{

		// Hacemos un condicional y realizamos lo que nos pide el enunciado
		if (this.get(producto) != null) {
			return this.get(producto).get(atributo);
		} else {
			return null;
		}
	}


	public Set<Producto> obtenerProductosConAtributo(String atributo)
	// Devuelve un conjunto de productos que tienen un atributo pasado
	//por parámetro.
	{
		// Creamos el conjunto
		Set<Producto> buscarProductos = new HashSet<>();

		// Recorremos el HashMap y buscamos los productos que tienen el atributo.
		// Si encuentra un producto con el atributo lo añade al conjunto.
		// Si no encuentra ninguno devuelve un conjunto vacío.
		for (Producto producto : this.keySet()) {
			if (this.get(producto).containsKey(atributo)) {
				buscarProductos.add(producto);
			}
		}

		return buscarProductos;
	}

	public String obtenerProductoPrecioMasAlto()
	// Devuelve un String. Este método buscará y devolverá el nombre del producto
	// con el precio más alto en el modelo.
	{

		Producto productoMasAlto = null;
		double precioMasAlto = 0; // Necesita decimales al ser precios por lo que usamos un double (más potente que un float)

		// Recorremos el HashMap y buscamos el producto con el precio mas alto
		// Si no encuentra ninguno devuelve un mensaje de error.
		for (Producto p:this.keySet()) {
			if (p.getPrecio() > precioMasAlto) {
				precioMasAlto = p.getPrecio();
				productoMasAlto = p;
			}
		}

		if (productoMasAlto != null) {
			return productoMasAlto.getNombre();
		} else {
			return "No se encontró un producto más caro.";
		}
	}
	public HashMap<String, Integer> numeroProductosporCategorias()
	// Devuelve un HashMap<String, List<Producto>>, donde las claves son las   [ERROR, no es lista es HASHMAP]
	// categorías de los productos y los valores son las listas de productos
	// pertenecientes a cada categoría.
	{

		// El enunciado pide realmente una lista, pero la profesora corrigió en clase diciendo que realmente debemos usar un HashMap
		HashMap<String, Integer> categoriasProductos = new HashMap<>();

		// Si no existe, lo crea con un 1. Si ya existe, le suma 1.
		for (Producto p : this.keySet()) {
			String categoria = p.getCategoria();
			if (categoriasProductos.containsKey(categoria)) {
				categoriasProductos.put(categoria, categoriasProductos.get(categoria) + 1);
			} else {
				categoriasProductos.put(categoria, 1);
			}
		}
		return categoriasProductos;
	}
}


