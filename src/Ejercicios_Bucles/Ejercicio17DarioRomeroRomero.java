package Ejercicios_Bucles;

import java.util.Scanner;

/*
Escribe un programa que lea números y acepte únicamente los que sean mayores que el último introducido.
La introducción termina con un 0. Al final se mostrará el total de números introducidos, sin contar el 0, y
el total de fallos. Por ejemplo, con 20 21 8 15 10 30 0 el programa avisa de que el 8 y el 10 son fallos,
y al final dice que se han introducido 6 números y que ha habido 2 fallos.
 */
public class Ejercicio17DarioRomeroRomero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNumeros = 0;
        int fallos = 0;

        System.out.println("Introduce números mayores que el anterior (0 para terminar):");

        // Lectura adelantada: leemos el primer número ANTES del bucle
        System.out.print("Número: ");
        int numeroActual = sc.nextInt();

        // Si el primer número es 0, ni siquiera entra al bucle
        if (numeroActual != 0) {
            totalNumeros = 1; // Contamos el primer número (nunca puede ser fallo)

            int ultimoIntroducido = numeroActual;

            // Pedimos el siguiente número antes de evaluar la condición del while
            System.out.print("Número: ");
            numeroActual = sc.nextInt();

            while (numeroActual != 0) {
                totalNumeros++;

                // Comprobamos si es menor o igual que el anterior
                if (numeroActual <= ultimoIntroducido) {
                    fallos++;
                }

                // Actualizamos la referencia con el número que se acaba de introducir
                ultimoIntroducido = numeroActual;

                // Leemos el siguiente número para la próxima vuelta
                System.out.print("Número: ");
                numeroActual = sc.nextInt();
            }
        }

        // Resultados finales
        System.out.println("Total de números introducidos (sin contar el 0): " + totalNumeros);
        System.out.println("Total de fallos: " + fallos);

    }
}
