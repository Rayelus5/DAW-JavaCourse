package Primero.SegundoTrimestre.Control.Primero.fuentes;
import java.util.Arrays;

public class Gestion
{
	Tienda tienda;

	public Gestion()
	{
		this.tienda = new Tienda();
		this.creaDatos();

		System.out.println("Apartado a) total compras de la clienta "+
				tienda.gettClientas()[0]+": "+
				tienda.totalComprasPorClienta(tienda.gettClientas()[0]));
		System.out.println("Apartado a) total compras de la clienta "+
				tienda.gettClientas()[1]+": "+
				tienda.totalComprasPorClienta(tienda.gettClientas()[1]));

		System.out.println("\nApartado b) Clientas que han comprado más de 200:\n"+
				Arrays.toString(tienda.clientasPremium(200)));
		System.out.println("Apartado b) Clientas que han comprado más de 300:\n"+
				Arrays.toString(tienda.clientasPremium(300)));

		System.out.println("\nApartado c) Total de ventas entre el 17/2/23 y el"+
				" 13/5/24: "+
				tienda.totalVentas(new Fecha(17,2,2023),
						new Fecha(13,5,2024)));
		System.out.println("Apartado c) Total de ventas entre el 16/7/23 y el"+
				" 26/7/24: "+
				tienda.totalVentas(new Fecha(16,7,2023),
						new Fecha(26,7,2024)));

		System.out.println("\nApartado d) Vendedora del mes 4: "+
				tienda.vendedoraDelMes(4));
		System.out.println("Apartado d) Vendedora del mes 6: "+
				tienda.vendedoraDelMes(6));

		System.out.println("\nApartado e) Prendas que van a rebajas: "+
				Arrays.toString(tienda.paraRebajas()));
	}

	public static void main(String[] args)
	{
		new Gestion();
	}

	public void creaDatos()
	{
		Prenda p1 = new Prenda(29.99f, "Camisetas", "M", "Camiseta básica");
		tienda.anadePrenda(p1);
		Prenda p2 = new Prenda(45.50f, "Pantalones", "L", "Jeans ajustados");
		tienda.anadePrenda(p2);
		Prenda p3 = new Prenda(15.75f, "Accesorios", "S", "Gorra deportiva");
		tienda.anadePrenda(p3);
		Prenda p4 = new Prenda(39.99f, "Abrigos", "XL", "Chaqueta de invierno");
		tienda.anadePrenda(p4);
		Prenda p5 = new Prenda(22.00f, "Calzado", "XXL", "Zapatillas casuales");
		tienda.anadePrenda(p5);
		Prenda p6 = new Prenda(32.50f, "Camisetas", "S", "Camiseta estampada");
		tienda.anadePrenda(p6);
		Prenda p7 = new Prenda(27.99f, "Pantalones", "M", "Pantalones cortos");
		tienda.anadePrenda(p7);
		Prenda p8 = new Prenda(49.99f, "Abrigos", "L", "Abrigo de lana");
		tienda.anadePrenda(p8);
		Prenda p9 = new Prenda(19.99f, "Accesorios", "M", "Bufanda de lana");
		tienda.anadePrenda(p9);
		Prenda p10 = new Prenda(25.00f, "Calzado", "L", "Botas de montaña");
		tienda.anadePrenda(p10);
		Prenda p11 = new Prenda(30.00f, "Camisetas", "XL", "Camiseta deportiva");
		tienda.anadePrenda(p11);
		Prenda p12 = new Prenda(35.50f, "Pantalones", "S", "Pantalones de chándal");
		tienda.anadePrenda(p12);
		Prenda p13 = new Prenda(40.00f, "Abrigos", "M", "Chaqueta de cuero");
		tienda.anadePrenda(p13);
		Prenda p14 = new Prenda(18.75f, "Accesorios", "L", "Sombrero de paja");
		tienda.anadePrenda(p14);
		Prenda p15 = new Prenda(28.00f, "Calzado", "M", "Sandalias de verano");
		tienda.anadePrenda(p15);
		Prenda p16 = new Prenda(33.99f, "Camisetas", "XXL", "Camiseta de manga larga");
		tienda.anadePrenda(p16);
		Prenda p17 = new Prenda(42.50f, "Pantalones", "XL", "Pantalones de vestir");
		tienda.anadePrenda(p17);
		Prenda p18 = new Prenda(37.00f, "Abrigos", "S", "Chaqueta impermeable");
		tienda.anadePrenda(p18);
		Prenda p19 = new Prenda(20.00f, "Accesorios", "XXL", "Guantes de invierno");
		tienda.anadePrenda(p19);
		Prenda p20 = new Prenda(26.50f, "Calzado", "S", "Zapatos de vestir");
		tienda.anadePrenda(p20);

		Prenda p21 = new Prenda(16.50f, "Accesorios", "S", "Corbata");
		tienda.anadePrenda(p21);
		Prenda p22 = new Prenda(30.50f, "Accesorios", "L", "Smoking");
		tienda.anadePrenda(p22);

		Clienta c1 = new Clienta("Maria Garcia", 6333001L);
		tienda.anadeClienta(c1);
		Clienta c2 = new Clienta("Ana Lopez", 6333002L);
		tienda.anadeClienta(c2);
		Clienta c3 = new Clienta("Laura Martinez", 6333003L);
		tienda.anadeClienta(c3);
		Clienta c4 = new Clienta("Carmen Fernandez", 6333004L);
		tienda.anadeClienta(c4);
		Clienta c5 = new Clienta("Elena Rodriguez", 6333005L);
		tienda.anadeClienta(c5);
		Clienta c6 = new Clienta("Isabel Sanchez", 6333006L);
		tienda.anadeClienta(c6);
		Clienta c7 = new Clienta("Patricia Diaz", 6333007L);
		tienda.anadeClienta(c7);
		Clienta c8 = new Clienta("Sofia Perez", 6333008L);
		tienda.anadeClienta(c8);
		Clienta c9 = new Clienta("Lucia Gomez", 6333009L);
		tienda.anadeClienta(c9);
		Clienta c10 = new Clienta("Marta Ruiz", 6333010L);
		tienda.anadeClienta(c10);

		Vendedora v1 = new Vendedora("Vanessa", "543Y");
		tienda.anadeVendedora(v1);
		Vendedora v2 = new Vendedora("Lucia", "678Z");
		tienda.anadeVendedora(v2);
		Vendedora v3 = new Vendedora("Carla", "123X");
		tienda.anadeVendedora(v3);
		Vendedora v4 = new Vendedora("Elena", "456W");
		tienda.anadeVendedora(v4);
		Vendedora v5 = new Vendedora("Sofia", "789V");
		tienda.anadeVendedora(v5);


		tienda.anadeVenta(new Venta(c3, v1, p5, new Fecha(1, 12, 2024), 3));
		tienda.anadeVenta(new Venta(c1, v2, p10, new Fecha(15, 11, 2024), 2));
		tienda.anadeVenta(new Venta(c5, v3, p3, new Fecha(20, 10, 2024), 4));
		tienda.anadeVenta(new Venta(c7, v4, p8, new Fecha(5, 9, 2024), 1));
		tienda.anadeVenta(new Venta(c2, v5, p12, new Fecha(12, 8, 2024), 5));
		tienda.anadeVenta(new Venta(c9, v1, p1, new Fecha(25, 7, 2024), 2));
		tienda.anadeVenta(new Venta(c4, v2, p7, new Fecha(30, 6, 2024), 3));
		tienda.anadeVenta(new Venta(c6, v3, p15, new Fecha(18, 5, 2024), 4));
		tienda.anadeVenta(new Venta(c8, v4, p20, new Fecha(22, 4, 2024), 1));
		tienda.anadeVenta(new Venta(c10, v5, p2, new Fecha(10, 3, 2024), 5));
		tienda.anadeVenta(new Venta(c1, v1, p6, new Fecha(14, 2, 2024), 2));
		tienda.anadeVenta(new Venta(c3, v2, p9, new Fecha(28, 1, 2024), 3));
		tienda.anadeVenta(new Venta(c5, v3, p4, new Fecha(3, 12, 2023), 4));
		tienda.anadeVenta(new Venta(c7, v4, p11, new Fecha(17, 11, 2023), 1));
		tienda.anadeVenta(new Venta(c2, v5, p14, new Fecha(21, 10, 2023), 5));
		tienda.anadeVenta(new Venta(c9, v1, p13, new Fecha(07, 9, 2023), 2));
		tienda.anadeVenta(new Venta(c4, v2, p16, new Fecha(11, 8, 2023), 3));
		tienda.anadeVenta(new Venta(c6, v3, p19, new Fecha(26, 7, 2023), 4));
		tienda.anadeVenta(new Venta(c8, v4, p18, new Fecha(9, 6, 2023), 1));
		tienda.anadeVenta(new Venta(c10, v5, p17, new Fecha(13, 5, 2023), 5));
		tienda.anadeVenta(new Venta(c1, v1, p5, new Fecha(27, 4, 2023), 2));
		tienda.anadeVenta(new Venta(c3, v2, p10, new Fecha(2, 3, 2023), 3));
		tienda.anadeVenta(new Venta(c5, v3, p3, new Fecha(16, 2, 2023), 4));
		tienda.anadeVenta(new Venta(c7, v4, p8, new Fecha(20, 1, 2023), 1));
		tienda.anadeVenta(new Venta(c2, v5, p12, new Fecha(4, 12, 2022), 5));
		tienda.anadeVenta(new Venta(c9, v1, p1, new Fecha(8, 11, 2022), 2));
		tienda.anadeVenta(new Venta(c4, v2, p7, new Fecha(23, 10, 2022), 3));
		tienda.anadeVenta(new Venta(c6, v3, p15, new Fecha(6, 9, 2022), 4));
		tienda.anadeVenta(new Venta(c8, v4, p20, new Fecha(10, 8, 2022), 1));
		tienda.anadeVenta(new Venta(c10, v5, p2, new Fecha(24, 7, 2022), 5));




	}

}
