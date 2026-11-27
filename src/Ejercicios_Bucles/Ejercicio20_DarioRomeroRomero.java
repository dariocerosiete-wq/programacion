package Ejercicios_Bucles;

import java.util.Scanner;

/*
Escribe un programa que pida un número entero N entre 0 y 20 y muestre los números desde 1 hasta N,
uno en cada línea, repitiendo cada número tantas veces como su valor:
Número: 5
1
22
333
4444
55555
 */
public class Ejercicio20_DarioRomeroRomero {
    public static void main(String[] args) {
        int numeroEntero;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce un número entero N (entre 0 y 20): ");
            numeroEntero = sc.nextInt();

            if (numeroEntero < 0 || numeroEntero > 20) {
                System.out.println("El número debe estar entre 0 y 20. Inténtalo de nuevo.");
            }
        } while (numeroEntero < 0 || numeroEntero > 20);

        System.out.println("\nResultado:");

        // Bucle externo: controla las filas (desde 1 hasta N)
        for (int i = 1; i <= numeroEntero; i++) {

            // Bucle interno: imprime el número 'i' tantas veces como valga 'i'
            for (int j = 1; j <= i; j++) {
                System.out.print(i); // Usamos print para no cambiar de línea
            }

            // Salto de línea al terminar cada fila
            System.out.println();
        }
    }
}
