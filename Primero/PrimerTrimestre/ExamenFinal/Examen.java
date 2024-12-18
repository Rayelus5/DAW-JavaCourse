package Primero.PrimerTrimestre.ExamenFinal;

import javax.swing.*;

@SuppressWarnings("SpellCheckingInspection") // Para evitar "warnings" de palabras no reconocidas por el diccionario

// RAIMUNDO PALMA MÉNDEZ 1ºDAW

/*  EXAMEN FINAL 04/12/2024 - PROGRAMACIÓN

    Opción 1: (1,5 puntos) permitirá dar de alta un producto. Para ello, se pedirá el código de la
    fruta. Si el código ya existe se mostrará un error y se volverá al menú. Si no existe, se pedirá la
    denominación de la fruta y se almacenarán esos datos. Se mostrará un mensaje de “datos almacenados”
    y se volverá al menú. En este apartado sólo se introducen los datos de un producto: código y
    denominación. No varios productos. No se van a manejar más de 30 productos distintos. El usuario no
    va a cometer errores; no va a introducir ningún código o denominación vacíos.

    Opción 2: (2,5 puntos) permitirá dar de alta un envío de un producto. Para ello, se pedirá primero
    el código de la fruta. Si el código no existe se mostrará un error y se volverá al menú. Si existe, se
    pedirá la cantidad enviada (toneladas, número con decimales), y el código del almacén. Si el almacén no
    existe previamente, se dará de alta. Se mostrará un mensaje de “datos almacenados” y se volverá al
    menú. En este apartado se introducen los datos de un envío: código de producto, toneladas y código de
    almacén. No varios envíos. No se van a manejar más de 15 almacenes, un almacén no va a tener más de
    20 envíos. El usuario no va a cometer errores en los datos numéricos; no va a introducir ningún código
    vacío.

    Opción 3: (2 puntos) Mostrará un listado de todos los datos de los envíos almacenados, como se
    muestra más adelante.

    Opción 4: (1,5 puntos) Mostrará el nombre del producto del que se ha enviado más cantidad en
    un sólo envío, junto con esa cantidad, como se muestra más adelante.

    Opción 5: (1,5 puntos) Mostrará la media de toneladas de los tres últimos envíos para aquellos
    almacenes que tengan al menos tres envíos, como se muestra más adelante.
 */

public class Examen {
    //Declaramos las constantes y variables para que puedan ser usadas en nuestros métodos (funciones)
    private static final int MAX_FRUTAS = 30; //30
    private static final int MAX_ALMACENES = 15; //15
    private static final int MAX_ENVIOS = 20; //20

    private static String[][] frutas = new String[MAX_FRUTAS][2];
    private static String[] almacenes = new String[MAX_ALMACENES];
    private static float[] cantidades = new float[MAX_ENVIOS];
    private static String[][] envios = new String[MAX_ENVIOS][3];

    private static String nombreFruta;
    private static int nFrut = 0; //Número de frutas
    private static int nEnvio = 0; //Número de envios
    private static int nAlm = 0; //Número de almacen
    private static int nCantidades = 0; //Número de cantidades añadidas

    private static String codAlmacen;



    public static void main(String[] args) {

        int opcion;

        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case 1:
                    introducirProducto();
                    break;
                case 2:
                    introducirEnvio();
                    break;
                case 3:
                    listarTodo();
                    break;
                case 4:
                    productoMayorEnvio();
                    break;
                case 5:
                    cantidadMediaTresEnvios();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Fin del programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }

    private static int mostrarMenu() {
        String menu = """
                MENÚ
                ----------------------------
                1- Introducir un producto.
                2- Introducir datos de un envío.
                3- Listar todo.
                4- Mostrar el nombre del producto del que se ha enviado más cantidad en un solo envío.
                5- Mostrar la cantidad media de los tres últimos envíos a cada almacén con al menos tres envíos.
                6- Fin.
                """;

        String opcion = JOptionPane.showInputDialog(menu);
        if (opcion == null) return 6; // Si se cancela el diálogo, salir
        try {
            return Integer.parseInt(opcion);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void introducirProducto() {

        String codFruta = JOptionPane.showInputDialog("Cod de la fruta:");
        int posFrut= 0; // Le da posición a la fruta

        while(posFrut<nFrut && !frutas[posFrut][0].equals(codFruta))
            posFrut++;
				/* Mientras la posición de fruta sea menor a la cant de fruta
				  Y lo de dentro de la posición de fruta (cod) en la tabla frutas sea diferente a codFruta*/

        if(posFrut == nFrut) // fin del array, no existe esa fruta
        {
            frutas[nFrut][0] = codFruta; //Después de asignar fruta a la columna de codigos, el valor de nFrut se incrementa.
            nombreFruta = JOptionPane.showInputDialog("Denominación de la fruta:");
            frutas[nFrut][1] = nombreFruta;

            nFrut++;
            JOptionPane.showMessageDialog(null, "Fruta añadida");
        }else
            JOptionPane.showMessageDialog(null, "Esa fruta ya existe");
    }



    private static void introducirEnvio() {
        // codfruta, toneladas y cod de almacen
        String codFruta = JOptionPane.showInputDialog("Cod Fruta: ");

        if (buscarIndiceFruta(codFruta) == -1) {
            JOptionPane.showMessageDialog(null, "No existe la fruta.");
        } else {
            float toneladasEnviar = Float.parseFloat(JOptionPane.showInputDialog("Toneladas: "));
            String codAlmacen = JOptionPane.showInputDialog("Cod Almacen: ");

            envios[nEnvio][0] = codFruta;
            envios[nEnvio][1] = String.valueOf(toneladasEnviar);
            envios[nEnvio][2] = codAlmacen;
            almacenes[nAlm] = codAlmacen;
            cantidades[nCantidades] = toneladasEnviar;
            nEnvio++;
            nAlm++;
            nCantidades++;

            // tSobres[mes-1][tNSobres[mes-1]++] = tonesEnviar;
            JOptionPane.showMessageDialog(null, "Dato almacenado");
        }
    }

    private static void listarTodo() {
        String listaTotal = "";

        for (int i = 0; i < MAX_ALMACENES ; i++) {
            listaTotal += "Almacén: " + almacenes[i] + "\n";
            for (int x = 0; x < frutas.length ; x++) {
                listaTotal += "Producto: " + frutas[x][0] + " (" + frutas[x][1] + ")\n"; // + envios[x][1] + " Ton.\n";
            }
        }


        JOptionPane.showMessageDialog(null, listaTotal);
    }

    //Opción 4
    private static void productoMayorEnvio() {}

    //Opción 5
    private static void cantidadMediaTresEnvios() {}



    private static int buscarIndiceFruta(String codFruta) {
        for (int i = 0; i < nFrut; i++) {

            if (frutas[i][0].equalsIgnoreCase(codFruta)) {
                return i; //Existe
            }
        }
        return -1; //No existe
    }

    // ERRORES al no haber hecho bien la ESTRUCTURA DEL PROGRAMA. Únicas opciones correctas: 1, 2 y 6. Opciones por terminar/arreglar: 3. Sin hacer: 4 y 5.

}
