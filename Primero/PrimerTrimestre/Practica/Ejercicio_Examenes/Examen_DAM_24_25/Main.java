package Primero.PrimerTrimestre.Practica.Ejercicio_Examenes.Examen_DAM_24_25;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Main {
    private static final int MAX_CABALLOS = 15;
    private static final int MAX_CARRERAS = 10;

    private static String[] caballos = new String[MAX_CABALLOS];
    private static String[] ciudades = new String[MAX_CARRERAS];
    private static double[][] velocidades = new double[MAX_CABALLOS][MAX_CARRERAS];
    private static int caballosRegistrados = 0;

    public static void main(String[] args) {
        // Inicializar la matriz de velocidades con -1
        for (int i = 0; i < MAX_CABALLOS; i++) {
            for (int j = 0; j < MAX_CARRERAS; j++) {
                velocidades[i][j] = -1;
            }
        }

        int opcion;

        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case 1:
                    introducirDatos();
                    break;
                case 2:
                    listarDatos();
                    break;
                case 3:
                    ciudadConMasCarreras();
                    break;
                case 4:
                    listarUltimosPosiciones();
                    break;
                case 5:
                    listarVelocidadesMedias();
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
                Menú:
                1- Introducir caballo, carrera, ciudad y velocidad.
                2- Listar todos los datos.
                3- Indicar en qué ciudad ha habido más carreras.
                4- Listado de carreras junto con el caballo que ha quedado en última posición.
                5- Listado ordenado por caballo de velocidades medias.
                6- Fin.
                Seleccione una opción:""";

        String opcion = JOptionPane.showInputDialog(menu);
        if (opcion == null) return 6; // Si se cancela el cuadro, salir
        try {
            return Integer.parseInt(opcion);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void introducirDatos() {
        String nombreCaballo = JOptionPane.showInputDialog("Nombre del caballo:");
        if (nombreCaballo == null || nombreCaballo.isBlank()) return;

        int indiceCaballo = buscarIndiceCaballo(nombreCaballo);
        if (indiceCaballo == -1) {
            if (caballosRegistrados >= MAX_CABALLOS) {
                JOptionPane.showMessageDialog(null, "No se pueden registrar más caballos.");
                return;
            }
            caballos[indiceCaballo = caballosRegistrados++] = nombreCaballo;
        }

        String carreraStr = JOptionPane.showInputDialog("Número de la carrera (1-10):");
        if (carreraStr == null) return;

        int carrera;
        try {
            carrera = Integer.parseInt(carreraStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número de carrera inválido.");
            return;
        }

        if (carrera < 1 || carrera > MAX_CARRERAS) {
            JOptionPane.showMessageDialog(null, "Número de carrera fuera de rango (1-10).");
            return;
        }

        if (ciudades[carrera - 1] == null) {
            String ciudad = JOptionPane.showInputDialog("Nombre de la ciudad:");
            if (ciudad == null || ciudad.isBlank()) return;
            ciudades[carrera - 1] = ciudad;
        }

        if (velocidades[indiceCaballo][carrera - 1] != -1) {
            JOptionPane.showMessageDialog(null, "Este caballo ya tiene registrada la velocidad para esta carrera.");
            return;
        }

        String velocidadStr = JOptionPane.showInputDialog("Velocidad media del caballo en esta carrera:");
        if (velocidadStr == null) return;

        try {
            double velocidad = Double.parseDouble(velocidadStr);
            velocidades[indiceCaballo][carrera - 1] = velocidad;
            JOptionPane.showMessageDialog(null, "Datos introducidos correctamente.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Velocidad inválida.");
        }
    }

    private static void listarDatos() {
        StringBuilder datos = new StringBuilder("Listado de datos registrados:\n");

        for (int i = 0; i < caballosRegistrados; i++) {
            datos.append("Caballo: ").append(caballos[i]).append("\n");
            for (int j = 0; j < MAX_CARRERAS; j++) {
                if (velocidades[i][j] != -1) {
                    datos.append(String.format("  Carrera %d (Ciudad: %s): %.2f km/h\n",
                            j + 1, ciudades[j], velocidades[i][j]));
                }
            }
        }

        JOptionPane.showMessageDialog(null, datos.toString());
    }

    private static void ciudadConMasCarreras() {
        int[] conteoCarreras = new int[MAX_CARRERAS];

        for (int j = 0; j < MAX_CARRERAS; j++) {
            for (int i = 0; i < caballosRegistrados; i++) {
                if (velocidades[i][j] != -1) {
                    conteoCarreras[j]++;
                }
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < MAX_CARRERAS; i++) {
            if (conteoCarreras[i] > conteoCarreras[maxIndex]) {
                maxIndex = i;
            }
        }

        JOptionPane.showMessageDialog(null, "La ciudad con más carreras es: " + ciudades[maxIndex]);
    }

    private static void listarUltimosPosiciones() {
        StringBuilder resultado = new StringBuilder("Listado de últimos lugares por carrera:\n");

        for (int j = 0; j < MAX_CARRERAS; j++) {
            double minVelocidad = Double.MAX_VALUE;
            int indiceCaballoMin = -1;

            for (int i = 0; i < caballosRegistrados; i++) {
                if (velocidades[i][j] != -1 && velocidades[i][j] < minVelocidad) {
                    minVelocidad = velocidades[i][j];
                    indiceCaballoMin = i;
                }
            }

            if (indiceCaballoMin != -1) {
                resultado.append(String.format("  Carrera %d: %s con %.2f km/h\n",
                        j + 1, caballos[indiceCaballoMin], minVelocidad));
            }
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    private static void listarVelocidadesMedias() {
        StringBuilder resultado = new StringBuilder("Listado de velocidades medias por caballo:\n");

        String[] caballosOrdenados = Arrays.copyOf(caballos, caballosRegistrados);
        Arrays.sort(caballosOrdenados);

        for (String caballo : caballosOrdenados) {
            int indice = buscarIndiceCaballo(caballo);
            double sumaVelocidades = 0;
            int numCarreras = 0;

            for (int j = 0; j < MAX_CARRERAS; j++) {
                if (velocidades[indice][j] != -1) {
                    sumaVelocidades += velocidades[indice][j];
                    numCarreras++;
                }
            }

            if (numCarreras > 0) {
                resultado.append(String.format("  %s: %.2f km/h\n", caballo, sumaVelocidades / numCarreras));
            }
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    private static int buscarIndiceCaballo(String nombreCaballo) {
        for (int i = 0; i < caballosRegistrados; i++) {
            if (caballos[i].equalsIgnoreCase(nombreCaballo)) {
                return i;
            }
        }
        return -1;
    }
}

