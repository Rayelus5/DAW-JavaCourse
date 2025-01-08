package Primero.SegundoTrimestre.Practica.POO.Aproximacion;
public class Principal
{
	public static void main(String[] args)
	{

		Alumno a,b;
		a = new Alumno();
		b = new Alumno();
		a.nombre = "Pepe";
		a.edad = 21;
		a.mostrar();
		b.nombre="Maria";
		b.mostrar();
	}
}