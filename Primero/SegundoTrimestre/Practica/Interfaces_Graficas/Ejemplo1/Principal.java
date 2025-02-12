package Primero.SegundoTrimestre.Practica.Interfaces_Graficas.Ejemplo1;

public class Principal {
    private Modelo modelo;
    private Vista vista;

    public static void main(String[] args) {
        new Principal();
    }

    public Principal() {
        this.modelo = new Modelo();
        this.vista = new Vista(this);
    }
}