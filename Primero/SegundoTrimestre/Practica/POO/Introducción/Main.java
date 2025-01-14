package Primero.SegundoTrimestre.Practica.POO.Introducción;

public class Main {
     public static void main(String[] args) {

         Maquinista m = new Maquinista();
         Maquinista n = new Maquinista();

         m.nombre = "John Doe";
         m.edad = 30;

         n.nombre = "María";
         n.edad = 30;

         System.out.println(m.nombre);
         System.out.println(m.edad);
     }
}
