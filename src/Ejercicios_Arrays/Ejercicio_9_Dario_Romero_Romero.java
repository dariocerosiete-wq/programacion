package Ejercicios_Arrays;

import java.util.Scanner;

/*
Escribe un programa que cree un vector de 100 enteros y lo llene con valores aleatorios
entre 1 y 10, con (int) (1 + Math.random() * 10).
 Después pedirá un valor N y mostrará en qué posiciones del vector aparece.
 */
public class Ejercicio_9_Dario_Romero_Romero {
    public static void main(String[] args) {
        int vector[] = new int [100];
        boolean encontrado;
        Scanner sc = new Scanner(System.in);
        int n;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(1 + Math.random() * 100);
        }

        System.out.print("Introduzca las posiciones del array: ");
        n = sc.nextInt();

        System.out.print("El valor " + n + " aparece en las posiciones: ");
        encontrado = false;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == n) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.print("ninguna (no se encontró el número).");
        }

    }
}
