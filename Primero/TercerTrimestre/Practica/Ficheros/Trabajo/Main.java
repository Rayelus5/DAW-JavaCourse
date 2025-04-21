package Primero.TercerTrimestre.Practica.Ficheros.Trabajo;

import java.io.File;
import java.io.FilenameFilter;

public class Main {

    //Método principal para iniciar la búsqueda
    public static void listarArchivosPorExtension(String rutaDirectorio, String extension) {
        int[] contador = new int[1]; // Para contar archivos encontrados
        long[] tamanioTotal = new long[1]; // Para sumar el tamaño de los archivos

        explorarDirectorio(new File(rutaDirectorio), extension, 0, contador, tamanioTotal);

        //Mostrar resumen completo incluyendo los extras que se pide en el trabajo.
        System.out.println("\nResumen:");
        System.out.println("Archivos encontrados: " + contador[0]);
        System.out.println("Tamaño total: " + tamanioTotal[0] + " bytes");
    }

    //Método recursivo para explorar directorios
    private static void explorarDirectorio(File directorio, String extension, int nivel, int[] contador, long[] tamanioTotal) {
        //Validar directorio
        if (!directorio.exists() || !directorio.isDirectory()) {
            System.out.println("Error: " + directorio.getPath() + " no es un directorio válido.");
            return;
        }

        //Indentación visual
        String indentacion = "  ".repeat(nivel);
        System.out.println(indentacion + "Directorio: [" + directorio.getName() + "]");

        //Filtro de archivos por extensión
        FilenameFilter filtro = (dir, nombre) -> nombre.toLowerCase().endsWith("." + extension.toLowerCase());

        //Listar archivos filtrados
        File[] archivosFiltrados = directorio.listFiles(filtro);
        if (archivosFiltrados != null && archivosFiltrados.length > 0) {
            for (File archivo : archivosFiltrados) {
                System.out.println(indentacion + "  - " + archivo.getName());
                contador[0]++;
                tamanioTotal[0] += archivo.length();
            }
        } else {
            System.out.println(indentacion + "  (Sin archivos ." + extension + ")");
        }

        // Recorrer subdirectorios de forma recursiva
        File[] subdirectorios = directorio.listFiles(File::isDirectory);
        if (subdirectorios != null) {
            for (File subdir : subdirectorios) {
                explorarDirectorio(subdir, extension, nivel + 1, contador, tamanioTotal);
            }
        }
    }

    // Método main para probar
    public static void main(String[] args) {
        try {
            String ruta = "C:\\Users\\rpame\\Desktop\\prueba";  //Cambiar ruta para probar
            String extension = "txt";  //Cambiar la extensión para probar

            listarArchivosPorExtension(ruta, extension);
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
