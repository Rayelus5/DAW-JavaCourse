package Primero.SegundoTrimestre.Practica.Interfaces_Graficas.Ejemplo2;
import java.util.Scanner;

public class Vista 
{
	private Principal controlador;
	private VentanaPpal ventanaPpal;
	

	public Vista(Principal con)
	{
		this.controlador = con;
		this.ventanaPpal =new VentanaPpal();
		
		this.ventanaPpal.setVisible(true);
	}



}
