package Ejercicios_Bucles;

import java.util.Scanner;

/*
Escribe una calculadora con menú: sumar, restar, multiplicar, dividir y salir.
El menú se repite hasta que se elige salir. Los dos números se piden una sola vez, antes de la operación;
la división entre cero se avisa en vez de calcularse; una opción que no exista se rechaza;
y una opción que no sea un número se rechaza sin que el programa se detenga.
Los resultados se muestran con dos decimales, así: 7,00 + 2,00 = 9,00.
 */
public class Ejercicio27DarioRomeroRomero {
    public static void main(String[] args) {
        final int SALIR = 5;
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- CALCULADORA ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println(SALIR + ". Salir");
            System.out.print("Elige una opción: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();

                double numA = 0;
                double numB = 0;

                // Lectura de los operandos antes del switch dentro de un if
                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Introduce el primer número: ");
                    numA = sc.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    numB = sc.nextDouble();
                }

                // Switch con flechas (Java 14+)
                switch (opcion) {
                    case 1 -> System.out.printf("%.2f + %.2f = %.2f%n", numA, numB, numA + numB);
                    case 2 -> System.out.printf("%.2f - %.2f = %.2f%n", numA, numB, numA - numB);
                    case 3 -> System.out.printf("%.2f * %.2f = %.2f%n", numA, numB, numA * numB);
                    case 4 -> {
                        if (numB == 0) {
                            System.out.println("Error: No se puede dividir entre cero.");
                        } else {
                            System.out.printf("%.2f / %.2f = %.2f%n", numA, numB, numA / numB);
                        }
                    }
                    case SALIR -> System.out.println("Saliendo de la calculadora...");
                    default -> System.out.println("Opción no válida. Elige un número entre 1 y " + SALIR + ".");
                }
            } else {
                System.out.println("Error: Debes introducir un número entero.");
                sc.next();
            }

        } while (opcion != SALIR);
    }
}
