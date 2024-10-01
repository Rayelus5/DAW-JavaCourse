package Primero.PrimerTrimestre.Ejercicio9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DVDLogoSimulator extends JFrame {
    private int xSpeed = 20;
    private int ySpeed = 20;
    private int xPosition = 0;
    private int yPosition = 0;
    private int WIDTH = 200;
    private int HEIGHT = 100;

    public DVDLogoSimulator() {
        // Configuración básica del JFrame
        setTitle("Simulación de Logo DVD");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true); // Sin bordes ni barra de título
        // Crear un Timer que actualiza la posición de la ventana
        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el tamaño de la pantalla
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int screenWidth = (int) screenSize.getWidth();
                int screenHeight = (int) screenSize.getHeight();


                // Mover la ventana
                xPosition += xSpeed;
                yPosition += ySpeed;

                WIDTH += xSpeed;
                HEIGHT += ySpeed;
                /*if (WIDTH > 500 || HEIGHT > 500) {
                    WIDTH = 100;
                    HEIGHT = 200;
                }*/
                setSize(WIDTH, HEIGHT);

                // Comprobar colisiones con los bordes de la pantalla
                if (xPosition <= 0 || xPosition + getWidth() >= screenWidth) {
                    xSpeed = -xSpeed; // Cambiar la dirección en el eje X
                }
                if (yPosition <= 0 || yPosition + getHeight() >= screenHeight) {
                    ySpeed = -ySpeed; // Cambiar la dirección en el eje Y
                }

                // Actualizar la posición de la ventana
                setLocation(xPosition, yPosition);
            }
        });

        timer.start();
    }

    // Método principal
    public static void main(String[] args) {
        // Mostrar un diálogo inicial con JOptionPane
        JOptionPane.showMessageDialog(null, "Haz clic en OK para iniciar la simulación del logo de DVD");
        JOptionPane.showMessageDialog(null, "Seguro?");

        // Crear y mostrar la ventana
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                DVDLogoSimulator simulator1 = new DVDLogoSimulator();
                DVDLogoSimulator simulator2 = new DVDLogoSimulator();
                simulator1.setVisible(true);
                simulator2.setVisible(true);
            }
        });
    }
}
