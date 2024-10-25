package Primero.PrimerTrimestre.Practica.Ejercicio_Examenes.Examen1_23_24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTiendas = 0;
        int totalProductos = 0;
        int maxProductosCampania = 0;
        float mayorDescuento = 0;
        String productoMayorDescuento = "";
        int productosQueBajanPrecio = 0;
        float menorPrecioAntesBF = Float.MAX_VALUE;
        String productoMenorPrecioAntesBF = "";
        String nombreTienda;

        System.out.print("Ingrese el nombre de la tienda (o 'fin' para terminar): ");
        nombreTienda = scanner.nextLine();

        while (!nombreTienda.equalsIgnoreCase("fin")) {

            totalTiendas++;
            System.out.print("¿Hace campaña para el Black Friday? (S/N): ");
            char haceCampania = scanner.nextLine().charAt(0);

            int productosEnEstaTienda = 0;

            while (true) {
                System.out.print("Ingrese el nombre del producto (o 'fin' para terminar): ");
                String nombreProducto = scanner.nextLine();
                if (nombreProducto.equals("fin")) {
                    break;
                }

                System.out.print("Ingrese el precio normal del producto: ");
                float precioNormal = Float.parseFloat(scanner.nextLine());
                System.out.print("Ingrese el precio justo antes del Black Friday: ");
                float precioAntesBF = Float.parseFloat(scanner.nextLine());
                System.out.print("Ingrese el precio en el Black Friday: ");
                float precioBlackFriday = Float.parseFloat(scanner.nextLine());

                productosEnEstaTienda++;
                totalProductos++;

                // Verificar el producto con mayor descuento
                float descuento = precioNormal - precioBlackFriday;
                if (descuento > mayorDescuento) {
                    mayorDescuento = descuento;
                    productoMayorDescuento = nombreProducto;
                }

                // Contar cuántos productos realmente bajan de precio
                if (precioBlackFriday < precioNormal) {
                    productosQueBajanPrecio++;
                }

                // Producto con el menor precio antes del BF en tiendas sin campaña
                if (haceCampania == 'N' && precioAntesBF < menorPrecioAntesBF) {
                    menorPrecioAntesBF = precioAntesBF;
                    productoMenorPrecioAntesBF = nombreProducto;
                }
            }

            // Actualizar el máximo de productos en tiendas que hacen campaña
            if (haceCampania == 'S' && productosEnEstaTienda > maxProductosCampania) {
                maxProductosCampania = productosEnEstaTienda;
            }

            System.out.print("Ingrese el nombre de la tienda (o 'fin' para terminar): ");
            nombreTienda = scanner.nextLine();
        }

        // Mostrar los resultados
        System.out.println("\nResultados del estudio:");
        if (totalTiendas > 0) {
            System.out.printf("a) Número medio de productos estudiados por tienda: %.2f%n", (float) totalProductos / totalTiendas);
        }
        System.out.println("b) Número máximo de productos estudiados en tiendas que sí han hecho campaña de Black Friday: " + maxProductosCampania);
        System.out.println("c) Nombre del producto que ha bajado más euros entre su precio normal y su precio en Black Friday: " + productoMayorDescuento);
        System.out.println("d) Número de productos que han bajado de precio realmente en Black Friday con respecto a su precio normal: " + productosQueBajanPrecio);
        if (!productoMenorPrecioAntesBF.isEmpty()) {
            System.out.println("e) Nombre del producto con precio justo antes del Black Friday más barato de las tiendas que no hacen campaña en el Black Friday: " + productoMenorPrecioAntesBF);
        } else {
            System.out.println("e) No hay productos en tiendas que no hacen campaña.");
        }

        scanner.close();
    }
}
