package Primero.PrimerTrimestre.Practica.RelacionEjercicios2;

import javax.swing.*;
import java.util.Scanner;

public class Main {


    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int actID;


        while (true) {

            limpiarConsola();
            System.out.println("[+] Menú de Actividades:");
            System.out.println("==========================");
            System.out.println("1.  Actividad 1");
            System.out.println("2.  Actividad 2");
            System.out.println("3.  Actividad 3");
            System.out.println("4.  Actividad 4");
            System.out.println("5.  Actividad 5");
            System.out.println("6.  Actividad 6");
            System.out.println("7.  Actividad 7");
            System.out.println("8.  Actividad 8");
            System.out.println("9.  Actividad 9");
            System.out.println("10. Actividad 10");
            System.out.println("11. Actividad 11");
            System.out.println("12. Actividad 12");
            System.out.println("13. Actividad 13");
            System.out.println("14. Actividad 14");
            System.out.println("15. Actividad 15");
            System.out.println("16. Actividad 16");
            System.out.println("17. Actividad 17");
            System.out.println("18. Actividad 18");
            System.out.println("19. Actividad 19");
            System.out.println("==========================");
            System.out.println("0.  Salir");
            System.out.println("==========================");
            System.out.print("Selecciona una opción: ");
            actID = Integer.parseInt(scanner.nextLine());
            System.out.println("Ejecutando actividad...");

            switch (actID) {
                case 1:
                    // ACTIVIDAD 1

                    act1();
                    break;
                case 2:
                    // ACTIVIDAD 2

                    act2();
                    break;
                case 3:
                    // ACTIVIDAD 3

                    act3();
                    break;
                case 4:
                    // ACTIVIDAD 4

                    act4();
                    break;
                case 5:
                    // ACTIVIDAD 5

                    act5();
                    break;
                case 6:
                    // ACTIVIDAD 6

                    act6();
                    break;
                case 7:
                    // ACTIVIDAD 7

                    act7();
                    break;
                case 8:
                    // ACTIVIDAD 8

                    act8();
                    break;
                case 9:
                    // ACTIVIDAD 9

                    act9();
                    break;
                case 10:
                    // ACTIVIDAD 10

                    act10();
                    break;
                case 11:
                    // ACTIVIDAD 11

                    act11();
                    break;
                case 12:
                    // ACTIVIDAD 12

                    act12();
                    break;
                case 13:
                    // ACTIVIDAD 13

                    act13();
                    break;
                case 14:
                    // ACTIVIDAD 14

                    act14();
                    break;
                case 15:
                    // ACTIVIDAD 15

                    act15();
                    break;

                case 16:
                    // ACTIVIDAD 16

                    act16();
                    break;

                case 17:
                    // ACTIVIDAD 17

                    act17();
                    break;

                case 18:
                    // ACTIVIDAD 18

                    act18();
                    break;

                case 19:
                    // ACTIVIDAD 19

                    act19();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }

    private static void act1() {
        System.out.println("Actividad 1 Ejecutada:");

        System.out.println("=======================");

        /* JOPTIONPANE ALTERNATIVA

        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));

        while (n>=0) {
            JOptionPane.showMessageDialog(null, "El cuadrado del número es: " + (n*n));
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
        }
        JOptionPane.showMessageDialog(null, "Finalizado");
        */

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();

    }

    private static void act2() {
        System.out.println("Actividad 2 Ejecutada:");

        System.out.println("=======================");



        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();

    }

    private static void act3() {
        System.out.println("Actividad 3 Ejecutada:");

        System.out.println("=======================");



        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();

    }

    private static void act4() {
        System.out.println("Actividad 4 Ejecutada:");

        System.out.println("=======================");
        int secreto = (int)(Math.random() * 100);
        int num;
        int intentos = 0;

        System.out.print("Número: ");
        num = Integer.parseInt(scanner.nextLine());
        intentos++;

        while (num!=secreto && intentos < 5) {
            intentos++;
            if (num>secreto)
                System.out.println("Menor");
            else
                System.out.println("Mayor");

            System.out.print("Número: ");
            num = Integer.parseInt(scanner.nextLine());
        }

        if (intentos==5) {
            System.out.println("Has perdido. El número era: " + secreto);
        } else {
            System.out.println("Acertaste");
        }


        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();

    }

    private static void act5() {
        System.out.println("Actividad 5 Ejecutada:");

        System.out.println("=======================");

        int num;
        int i = 1;

        System.out.print("Número: ");
        num = Integer.parseInt(scanner.nextLine());

        if (num >= 0) {
            while (i != num) {
                System.out.println(i);
                i++;
            }
        } else {
            while (i != num) {
                System.out.println(i);
                i--;
            }
        }





        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();

    }

    private static void act6() {
        System.out.println("Actividad 6 Ejecutada:");

        System.out.println("=======================");
        int i;

        for(i=500; i>=0;i-=2) {
            System.out.println(i);
        }

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();

    }

    private static void act7() {
        System.out.println("Actividad 7 Ejecutada:");
        System.out.println("=======================");
        String password;
        do {

            System.out.print("Password: ");
            password = scanner.nextLine();


        } while (!password.equals("osama"));

        System.out.println("Contraseña correcta.");

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();

    }

    private static void act8() {
        System.out.println("Actividad 8 Ejecutada:");

        System.out.println("=======================");



        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();

    }

    private static void act9() {
        System.out.println("Actividad 9 Ejecutada:");

        System.out.println("=======================");



        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();

    }

    private static void act10() {
        System.out.println("Actividad 10 Ejecutada:");

        System.out.println("=======================");



        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();

    }


    private static void act11() {
        System.out.println("Actividad 11 Ejecutada:");

        System.out.println("=======================");



        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();

    }


    private static void act12() {
        System.out.println("Actividad 12 Ejecutada:");

        System.out.println("=======================");
        int numero;
        long producto = 1;

        System.out.print("Introduce un número: ");
        numero = Integer.parseInt(scanner.nextLine());

        for(int i=1; i<=numero; i++) {
            producto *= i;
        }

        System.out.println(producto);

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
    }

    private static void act13() {
        System.out.println("Actividad 13 Ejecutada:");
        System.out.println("=======================");

        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
        float sumaPositivos = 0;
        float sumaNegativos = 0;

        // Pedir 25 números al usuario
        for (int i = 1; i <= 25; i++) {
            System.out.print("Introduce el número " + i + ": ");
            float numero = scanner.nextFloat();

            if (numero > 0) {
                sumaPositivos += numero;
                contadorPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        // Calcular la media de positivos y negativos
        float mediaPositivos = (contadorPositivos > 0) ? (sumaPositivos / contadorPositivos) : 0;
        float mediaNegativos = (contadorNegativos > 0) ? (sumaNegativos / contadorNegativos) : 0;

        // Mostrar resultados
        System.out.printf("Media de los números positivos: %.2f%n", mediaPositivos);
        System.out.printf("Media de los números negativos: %.2f%n", mediaNegativos);
        System.out.println("Cantidad de ceros introducidos: " + contadorCeros);

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
    }


    private static void act14() {
        System.out.println("Actividad 14 Ejecutada:");
        System.out.println("=======================");

        int a=0,b=1,c=1;
        int n;

        System.out.print("¿Cuántos términos?: ");
        n = Integer.parseInt(scanner.nextLine());

        for(int i=0;i<n;i++) {
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
        }


        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
    }


    private static void act15() {
        System.out.println("Actividad 15 Ejecutada:");
        System.out.println("=======================");



        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
    }

    private static void act16() {
        System.out.println("Actividad 16 Ejecutada:");
        System.out.println("=======================");



        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
    }

    private static void act17() {
        System.out.println("Actividad 17 Ejecutada:");
        System.out.println("=======================");



        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
    }

    private static void act18() {
        System.out.println("Actividad 18 Ejecutada:");
        System.out.println("=======================");

        String nombre;
        String nombreMin;
        String nombreMax;
        int edad;
        int edadMin;
        int edadMax;
        System.out.print("Dime tu nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Dime la edad: ");
        edad = Integer.parseInt(scanner.nextLine());

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
    }

    private static void act19() {
        System.out.println("Actividad 19 Ejecutada:");
        System.out.println("=======================");



        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
    }


    public static void limpiarConsola() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // Ejecuta el comando cls en Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Ejecuta el comando clear en sistemas Unix/Linux/Mac
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
