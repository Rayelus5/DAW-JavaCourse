package Primero.PrimerTrimestre.RelacionEjercicios1;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int actID;

        while (true) {
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
        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("=======================");
        System.out.println("La suma de sus números es: " + (num1 + num2));

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
        scanner.nextLine();

    }

    private static void act2() {
        System.out.println("Actividad 2 Ejecutada:");

        System.out.println("=======================");
        System.out.println("Ingrese la base del triángulo: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese la altura del triángulo: ");
        int num2 = scanner.nextInt();
        System.out.println("=======================");
        float area = ((num1 * num2)/2f);
        System.out.println("El área del triángulo es: " + area);

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
        scanner.nextLine();

    }

    private static void act3() {
        System.out.println("Actividad 3 Ejecutada:");

        System.out.println("=======================");
        System.out.println("Ingrese su primera nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Ingrese su segunda nota: ");
        int nota2 = scanner.nextInt();
        System.out.println("Ingrese su tercera nota: ");
        int nota3 = scanner.nextInt();
        System.out.println("Ingrese su cuarta nota: ");
        int nota4 = scanner.nextInt();

        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10 || nota4 < 0 || nota4 > 10) {
            System.out.println("Notas inválidas. Las notas deben estar entre 0 y 10.");
            //ABADONA LA EJECUCIÓN
            System.out.println("Presione cualquier tecla para continuar...");
            scanner.nextLine();
        }

        double media = (double) (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("=======================");
        System.out.println("La media es: " + media);
        System.out.println("=======================");
        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
        scanner.nextLine();

    }

    private static void act4() {
        System.out.println("Actividad 4 Ejecutada:");

        System.out.println("=======================");
        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("=======================");

        if (num1 == num2) {
            System.out.println("El primer y segund número son los mismos.\n");
        } else {
            System.out.println("Los números no son iguales.\n");
        }

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
        scanner.nextLine();

    }

    private static void act5() {
        System.out.println("Actividad 5 Ejecutada:");

        System.out.println("=======================");
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Para evitar divisiones por cero, verificamos que el segundo número no sea cero
        if (num2 != 0) {
            if (num1 % num2 == 0) {
                System.out.println(num1 + " es múltiplo de " + num2);
            } else {
                System.out.println(num1 + " no es múltiplo de " + num2);

            }
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
        scanner.nextLine();

    }

    private static void act6() {
        System.out.println("Actividad 6 Ejecutada:");

        System.out.println("=======================");
        System.out.print("Ingrese el primer número (num1): ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número (num2): ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        } else if (num1 < num2) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("Ambos números son iguales.");
        }

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
        scanner.nextLine();

    }

    private static void act7() {
        System.out.println("Actividad 7 Ejecutada:");
        System.out.println("=======================");
        System.out.print("Ingrese la nota numérica (de 0 a 10): ");
        String entrada = scanner.nextLine().replaceAll(",",".");
        double nota = Double.parseDouble(entrada);

        if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else if (nota > 10) {
            System.out.println("No puedes sacar más de 10");
        } else {
            System.out.println("Sobresaliente");
        }

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
        scanner.nextLine();

    }

    private static void act8() {
        System.out.println("Actividad 8 Ejecutada:");

        System.out.println("=======================");
        // Pedir los tres números al usuario
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        System.out.println("=======================");

        // Ordenar los números usando comparaciones y asignaciones
        int temp; // Variable temporal para intercambiar valores

        // Asegurar que num1 sea el menor
        if (num2 < num1) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num3 < num1) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }

        // Asegurar que num2 sea el del medio
        if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Mostrar los números ordenados
        System.out.println("Los números ordenados de menor a mayor son:");
        System.out.println(num1 + " < " + num2 + " < " + num3);

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
        scanner.nextLine();

    }

    private static void act9() {
        System.out.println("Actividad 9 Ejecutada:");

        System.out.println("=======================");
        System.out.print("Ingrese un número entero positivo: ");
        long numero = scanner.nextLong();

        int contador = 0;

        // Mientras el número sea mayor que 0, seguimos dividiendo entre 10 y contando las cifras
        while (numero > 0) {
            numero /= 10; // Dividimos entre 10 para eliminar la última cifra
            contador++; // Incrementamos el contador de cifras
        }

        System.out.println("El número tiene " + contador + " cifras.");

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
        scanner.nextLine();

    }

    private static void act10() {
        System.out.println("Actividad 10 Ejecutada:");

        System.out.println("=======================");
        // Pedir al usuario las horas, minutos y segundos
        System.out.print("Ingrese las horas (0-23): ");
        int horas = scanner.nextInt();
        System.out.print("Ingrese los minutos (0-59): ");
        int minutos = scanner.nextInt();
        System.out.print("Ingrese los segundos (0-59): ");
        int segundos = scanner.nextInt();

        // Validar la hora ingresada
        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
            System.out.println("Hora inválida. Ingrese valores entre 0 y 23 para horas, 0 y 59 para minutos y segundos.");
            return;
        }

        // Calcular la hora en el siguiente segundo
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas = (horas + 1) % 24; // Manejar el cambio de día
            }
        }

        // Mostrar la hora resultante
        System.out.printf("La hora en el siguiente segundo es: %02d:%02d:%02d \n", horas, minutos, segundos);

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
        scanner.nextLine();

    }

    //ACTIVIDAD 11

    // Función para verificar si un age es bisiesto
    public static boolean esBisiesto(int age) {
        return age % 4 == 0 && (age % 100 != 0 || age % 400 == 0);
    }

    // Función para validar la fecha
    public static boolean esFechaValida(int dia, int mes, int age) {
        // Verificar que el mes esté entre 1 y 12
        if (mes < 1 || mes > 12) {
            return false;
        }

        // Verificar los días según el mes
        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Si el age es bisiesto y el mes es febrero, ajustar los días del mes
        if (esBisiesto(age) && mes == 2) {
            diasPorMes[1] = 29; // Febrero en age bisiesto tiene 29 días
        }

        // Verificar que el día esté en el rango válido para el mes correspondiente
        return dia >= 1 && dia <= diasPorMes[mes - 1];

        // Si todos los chequeos son correctos, la fecha es válida
    }

    private static void act11() {
        System.out.println("Actividad 11 Ejecutada:");

        System.out.println("=======================");

        // Solicitar la fecha al usuario
        System.out.print("Introduce el día (DD): ");
        int dia = scanner.nextInt();

        System.out.print("Introduce el mes (MM): ");
        int mes = scanner.nextInt();

        System.out.print("Introduce el age (AAAA): ");
        int age = scanner.nextInt();

        // Validar la fecha
        if (esFechaValida(dia, mes, age)) {
            System.out.println("La fecha es válida.");
        } else {
            System.out.println("La fecha es incorrecta.");
        }

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
        scanner.nextLine();

    }

    //ACTIVIDAD 12

    public static void diaSiguiente(int dia, int mes, int age) {
        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (esBisiesto(age) && mes == 2) {
            diasPorMes[1] = 29;
        }

        dia++; // Incrementar el día

        // Verificar si se pasa al siguiente mes
        if (dia > diasPorMes[mes - 1]) {
            dia = 1; // Reiniciar día
            mes++;   // Incrementar mes

            // Verificar si se pasa al siguiente age
            if (mes > 12) {
                mes = 1;   // Reiniciar mes
                age++;    // Incrementar age
            }
        }

        // Mostrar el día siguiente
        System.out.printf("La fecha del día siguiente es: %02d/%02d/%04d\n", dia, mes, age);
    }

    private static void act12() {
        System.out.println("Actividad 12 Ejecutada:");

        System.out.println("=======================");
        int dia, mes, age;

        // Solicitar una fecha válida al usuario
        do {
            System.out.print("Introduce el día (DD): ");
            dia = scanner.nextInt();

            System.out.print("Introduce el mes (MM): ");
            mes = scanner.nextInt();

            System.out.print("Introduce el age (AAAA): ");
            age = scanner.nextInt();

            if (!esFechaValida(dia, mes, age)) {
                System.out.println("Fecha incorrecta. Por favor, introduce una fecha válida.");
            }

        } while (!esFechaValida(dia, mes, age));

        // Calcular y mostrar el día siguiente
        diaSiguiente(dia, mes, age);

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
        scanner.nextLine();
    }

    //ACTIVIDAD 13
    public static String convertirNotaEnTexto(int nota) {
        String[] numerosEnTexto = {
                "Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco",
                "Seis", "Siete", "Ocho", "Nueve", "Diez"
        };

        return numerosEnTexto[nota];
    }

    private static void act13() {
        System.out.println("Actividad 13 Ejecutada:");
        System.out.println("=======================");
        // Solicitar la nota al usuario
        System.out.print("Introduce una nota numérica entera (0-10): ");
        int nota = scanner.nextInt();

        // Verificar que la nota esté dentro del rango permitido
        if (nota < 0 || nota > 10) {
            System.out.println("La nota debe estar entre 0 y 10.");
        } else {
            // Convertir la nota en su representación en texto
            String notaTexto = convertirNotaEnTexto(nota);
            System.out.println("La nota es: " + notaTexto);
        }


        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
        scanner.nextLine();
    }

    //ACTIVIDAD 14
    public static String convertirNumeroEnTexto(int numero) {
        String[] unidades = {
                "cero", "uno", "dos", "tres", "cuatro", "cinco",
                "seis", "siete", "ocho", "nueve", "diez",
                "once", "doce", "trece", "catorce", "quince"
        };

        String[] decenas = {
                "", "", "veinte", "treinta", "cuarenta", "cincuenta",
                "sesenta", "setenta", "ochenta", "noventa"
        };

        if (numero <= 15) {
            return unidades[numero];  // Retornar directamente si es un número entre 0 y 15
        } else if (numero < 20) {
            return "dieci" + unidades[numero - 10];  // Manejar los números entre 16 y 19
        } else if (numero < 30) {
            if (numero == 20) {
                return "veinte";  // Caso especial para 20
            }
            return "veinti" + unidades[numero - 20];  // Manejar los números entre 21 y 29
        } else {
            int decena = numero / 10;  // Obtener las decenas
            int unidad = numero % 10;  // Obtener las unidades

            if (unidad == 0) {
                return decenas[decena];  // Si es una decena exacta (30, 40, 50, etc.)
            } else {
                return decenas[decena] + " y " + unidades[unidad];  // Para números como 31, 42, etc.
            }
        }
    }

    private static void act14() {
        System.out.println("Actividad 14 Ejecutada:");
        System.out.println("=======================");
        // Solicitar al usuario un número entre 0 y 99
        System.out.print("Introduce un número entre 0 y 99: ");
        int numero = scanner.nextInt();

        // Verificar que el número esté en el rango permitido
        if (numero < 0 || numero > 99) {
            System.out.println("El número debe estar entre 0 y 99.");
        } else {
            // Convertir el número en su representación en texto
            String numeroTexto = convertirNumeroEnTexto(numero);
            System.out.println("El número es: " + numeroTexto);
        }

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
        scanner.nextLine();
    }

    //ACTIVIDAD 15
    public static String convertirNumeroEnTexto2(int numero) {
        String[] unidades = {
                "cero", "uno", "dos", "tres", "cuatro", "cinco",
                "seis", "siete", "ocho", "nueve", "diez",
                "once", "doce", "trece", "catorce", "quince"
        };

        String[] decenas = {
                "", "", "veinte", "treinta", "cuarenta", "cincuenta",
                "sesenta", "setenta", "ochenta", "noventa"
        };

        String[] centenas = {
                "", "cien", "doscientos", "trescientos", "cuatrocientos", "quinientos",
                "seiscientos", "setecientos", "ochocientos", "novecientos"
        };

        if (numero < 16) {
            return unidades[numero];  // Manejar los números del 0 al 15
        } else if (numero < 20) {
            return "dieci" + unidades[numero - 10];  // Manejar los números entre 16 y 19
        } else if (numero < 30) {
            if (numero == 20) {
                return "veinte";
            }
            return "veinti" + unidades[numero - 20];  // Manejar los números entre 21 y 29
        } else if (numero < 100) {
            int decena = numero / 10;
            int unidad = numero % 10;
            if (unidad == 0) {
                return decenas[decena];  // Números exactos como 30, 40, 50, etc.
            } else {
                return decenas[decena] + " y " + unidades[unidad];  // Por ejemplo, 42 -> cuarenta y dos
            }
        } else if (numero < 1000) {
            int centena = numero / 100;
            int resto = numero % 100;
            if (resto == 0) {
                if (centena == 1) {
                    return "cien";  // Caso especial para 100
                } else {
                    return centenas[centena];  // Centenas exactas como 200, 300, etc.
                }
            } else {
                if (centena == 1) {
                    return "ciento " + convertirNumeroEnTexto2(resto);  // Por ejemplo, 123 -> ciento veintitrés
                } else {
                    return centenas[centena] + " " + convertirNumeroEnTexto2(resto);  // Ejemplo: 256 -> doscientos cincuenta y seis
                }
            }
        } else {
            int millar = numero / 1000;
            int resto = numero % 1000;
            if (resto == 0) {
                if (millar == 1) {
                    return "mil";  // Caso especial para 1000
                } else {
                    return convertirNumeroEnTexto2(millar) + " mil";  // Mil exacto como 2000, 3000, etc.
                }
            } else {
                if (millar == 1) {
                    return "mil " + convertirNumeroEnTexto2(resto);  // Por ejemplo, 1234 -> mil doscientos treinta y cuatro
                } else {
                    return convertirNumeroEnTexto2(millar) + " mil " + convertirNumeroEnTexto2(resto);  // Ejemplo: 4321 -> cuatro mil trescientos veintiuno
                }
            }
        }
    }

    private static void act15() {
        System.out.println("Actividad 15 Ejecutada:");
        System.out.println("=======================");

        // Solicitar al usuario un número entre 0 y 9999
        System.out.print("Introduce un número entre 0 y 9999: ");
        int numero = scanner.nextInt();

        // Verificar que el número esté en el rango permitido
        if (numero < 0 || numero > 9999) {
            System.out.println("El número debe estar entre 0 y 9999.");
        } else {
            // Convertir el número en su representación en texto
            String numeroTexto = convertirNumeroEnTexto2(numero);
            System.out.println("El número es: " + numeroTexto);
        }

        //ABADONA LA EJECUCIÓN
        System.out.println("Presione cualquier tecla para continuar...");
        scanner.nextLine();
        scanner.nextLine();
    }
}