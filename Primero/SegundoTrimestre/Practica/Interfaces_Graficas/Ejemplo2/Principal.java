package Primero.SegundoTrimestre.Practica.Interfaces_Graficas.Ejemplo2;
public class Principal 
{
    private Modelo modelo;
    private Vista vista;
	public static void main(String[] args) 
	{
		new Principal();
	}
	
	public Principal()
	{
		this.modelo = new Modelo();
		this.vista = new Vista(this);
		
	}

	public void altaAlumno(String nombre, int edad) 
	{
		this.modelo.altaAlumno(nombre,edad);
	}
}
