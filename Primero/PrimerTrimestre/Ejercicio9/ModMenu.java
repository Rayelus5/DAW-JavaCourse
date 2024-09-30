package Primero.PrimerTrimestre.Ejercicio9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class ModMenu extends JFrame {

    public ModMenu() {
        super("ModMenu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel principal
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        add(panelPrincipal);

        // JTabbedPane para el navbar
        JTabbedPane tabbedPane = new JTabbedPane();
        panelPrincipal.add(tabbedPane, BorderLayout.CENTER);

        // Pestaña 1: Información general
        JPanel panelInformacion = new JPanel(new GridLayout(3, 1));
        JLabel lblTituloInfo = new JLabel("Información General");
        panelInformacion.add(lblTituloInfo);

        // Panel para fecha y botón
        JPanel panelFechaBoton = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblFecha = new JLabel(new Date().toString());
        JButton btnBienvenido = new JButton("Bienvenido");
        panelFechaBoton.add(lblFecha);
        panelFechaBoton.add(btnBienvenido);
        panelInformacion.add(panelFechaBoton);

        // Panel para otro botón con texto
        JPanel panelOtroBoton1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblTextoBoton1 = new JLabel("Otro botón");
        JButton btnOtro1 = new JButton("Hacer algo");
        panelOtroBoton1.add(lblTextoBoton1);
        panelOtroBoton1.add(btnOtro1);
        panelInformacion.add(panelOtroBoton1);

        // Panel para otro botón con texto
        JPanel panelOtroBoton2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblTextoBoton2 = new JLabel("Otro botón más");
        JButton btnOtro2 = new JButton("Hacer otra cosa");
        panelOtroBoton2.add(lblTextoBoton2);
        panelOtroBoton2.add(btnOtro2);
        panelInformacion.add(panelOtroBoton2);

        tabbedPane.addTab("Información", panelInformacion);

        // Pestaña 2: Ajustes
        JPanel panelAjustes = new JPanel(new GridLayout(4, 1));

        // Panel para Aimbot y FOV
        JPanel panelAimbotFov = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JCheckBox chkAimbot = new JCheckBox("Aimbot");
        JSlider sliderFOV = new JSlider(JSlider.HORIZONTAL, 0, 180, 90);
        JLabel lblFOV = new JLabel("FOV:");
        panelAimbotFov.add(chkAimbot);
        panelAimbotFov.add(sliderFOV);
        panelAimbotFov.add(lblFOV);
        panelAjustes.add(panelAimbotFov);

        // Repite el panel anterior para los otros 3 conjuntos de opciones
        // ... (copia y pega el panelAimbotFov y modifica los nombres y valores según sea necesario)

        tabbedPane.addTab("Ajustes", panelAjustes);

        // Pestaña 3: Acerca de
        JPanel panelAcercaDe = new JPanel(new GridLayout(3, 1));
        JLabel lblTituloAcercaDe = new JLabel("Acerca de");
        panelAcercaDe.add(lblTituloAcercaDe);

        JPanel panelCreditos = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lblCreditos = new JLabel("RayelusCredits");
        panelCreditos.add(lblCreditos);
        panelAcercaDe.add(panelCreditos);

        // Panel para otro botón o texto en "Acerca de"
        // ... (crea un nuevo panel con un botón o texto)
        // panelAcercaDe.add(panelOtroBotonEnAcercaDe);

        tabbedPane.addTab("Acerca de", panelAcercaDe);

        // Hilo para actualizar la fecha
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    SwingUtilities.invokeLater(() -> lblFecha.setText(new Date().toString()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new ModMenu();
    }
}